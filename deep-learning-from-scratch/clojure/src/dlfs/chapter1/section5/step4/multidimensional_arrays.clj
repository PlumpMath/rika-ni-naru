(ns dlfs.chapter1.section5.step4.multidimensional-arrays
  (:use [clojure.core.matrix]))

(def A [[1 2] [3 4]])

(println A)
(println (shape A))
(println (element-type A))

(def B [[3 0] [0 6]])

(println (add A B))
(println (mul A B))

(println (mul A 10))