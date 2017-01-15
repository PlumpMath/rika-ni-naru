(ns dlfs.chapter3.section3.step1.multidimesional-arrays
  (:use [clojure.core.matrix]))

(def A [1 2 3 4])

(println A)
(println (dimensionality A))
(println (shape A))
(println (nth (shape A) 0))

(def B [[1 2] [3 4] [5 6]])

(println B)
(println (dimensionality B))
(println (shape B))