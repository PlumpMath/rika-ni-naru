(ns dlfs.chapter3.section5.step3.characteristic
  (:use [clojure.core.matrix]))

(def a [0.3 2.9 4.0])
(def y (softmax a))

(println y)
(println (esum y))