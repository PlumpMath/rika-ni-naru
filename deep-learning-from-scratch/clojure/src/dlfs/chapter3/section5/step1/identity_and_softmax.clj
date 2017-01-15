(ns dlfs.chapter3.section5.step1.identity-and-softmax
  (:use [clojure.core.matrix :exclude [softmax]]))

(def a [0.3 2.9 4.0])
(def exp-a (emap #(Math/exp %) a))

(println exp-a)

(def sum-exp-a (esum exp-a))

(println sum-exp-a)

(def y (div exp-a sum-exp-a))

(println y)

(defn softmax [a]
  (let [exp-a (emap #(Math/exp %) a)
        sum-exp-a (esum exp-a)
        y (div exp-a sum-exp-a)]
    y))