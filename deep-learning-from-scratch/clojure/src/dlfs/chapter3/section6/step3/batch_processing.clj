(ns dlfs.chapter3.section6.step3.batch-processing
  (:require
    [clojure.core.matrix :as mat]
    [clojure.java.io :as io]
    [cortex-datasets.mnist :as mnist]))

(def x (mnist/test-data))
(def t (mnist/test-labels))
(def convert #(reduce-kv (fn [m k v] (assoc m k (mat/array v))) {} %))
(def network (-> "sample-weight.edn" io/resource io/file slurp read-string convert))

(let [{:keys [W1 W2 W3 b1 b2 b3]} network]
  (println (mat/shape x))
  (println (mat/shape (first x)))
  (println (mat/shape W1))
  (println (mat/shape W2))
  (println (mat/shape W3)))

(defn normalize [x]
  ; Would be super slow without mat/array call
  (->> x mat/array (mat/emap (partial + 0.5))))

(defn predict [x]
  (let [{:keys [W1 W2 W3 b1 b2 b3]} network
        x  (normalize x)
        M  (mat/mmul x W1)
        a1 (mat/add b1 M)
        z1 (mat/logistic a1)
        a2 (mat/add b2 (mat/mmul z1 W2))
        z2 (mat/logistic a2)
        a3 (mat/add b3 (mat/mmul z2 W3))
        y  (mat/softmax a3)]
    y))

(defn max-index [coll]
  (first (apply max-key second (map-indexed vector coll))))

(defn count-answers [cnt v]
  (let [[data labels] v
        y (predict data)
        p (map max-index y)
        t (map max-index labels)
        n (count (filter #(= (first %) (last %)) (partition 2 (interleave p t))))]
    (+ n cnt)))

(def batch-size 100)

(def accuracy-cnt (reduce count-answers 0 (map vector (partition-all batch-size x) (partition-all batch-size t))))

(println (double (/ accuracy-cnt (count x))))

