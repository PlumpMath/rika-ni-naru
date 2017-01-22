(ns dlfs.chapter3.section6.step2.neural-net
  (:require
    [clojure.core.matrix :as mat]
    [clojure.java.io :as io]
    [cortex-datasets.mnist :as mnist]))

(def x (mnist/test-data))
(def t (mnist/test-labels))
(def convert #(reduce-kv (fn [m k v] (assoc m k (mat/array v))) {} %))
(def network (-> "sample-weight.edn" io/resource io/file slurp read-string convert))

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
  (let [[data label] v
        y (predict data)
        p (max-index y)
        t (max-index label)]
    (if (= p t) (inc cnt) cnt)))

(def accuracy-cnt (reduce count-answers 0 (map vector x t)))

(println (double (/ accuracy-cnt (count x))))
