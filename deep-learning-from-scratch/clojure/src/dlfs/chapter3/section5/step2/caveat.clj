(ns dlfs.chapter3.section5.step2.caveat
  (:use [clojure.core.matrix :exclude [softmax]]))

(def a [1010 1000 990])

(println (div (emap #(Math/exp %) a) (esum (emap #(Math/exp %) a))))

(def c (apply max a))

(println (sub a c))

(println (div (emap #(Math/exp %) (sub a c)) (esum (emap #(Math/exp %) (sub a c)))))

(defn softmax [a]
  (let [c (max a)
        exp-a (emap #(Math/exp %) (sub a c))
        sum-exp-a (esum exp-a)
        y (div exp-a sum-exp-a)]
    y))