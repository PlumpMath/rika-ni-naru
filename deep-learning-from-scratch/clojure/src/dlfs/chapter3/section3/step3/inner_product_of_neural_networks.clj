(ns dlfs.chapter3.section3.step3.inner-product-of-neural-networks
  (:use [clojure.core.matrix]))

(def X [1 2])

(println (shape X))

(def W [[1 3 5] [2 4 6]])

(println W)
(println (shape W))

(def Y (mmul X W))

(println Y)