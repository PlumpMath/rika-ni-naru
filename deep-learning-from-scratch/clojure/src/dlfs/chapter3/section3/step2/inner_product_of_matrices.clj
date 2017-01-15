(ns dlfs.chapter3.section3.step2.inner-product-of-matrices
  (:use [clojure.core.matrix]))

(def A [[1 2] [3 4]])

(println (shape A))

(def B [[5 6] [7 8]])

(println (shape B))

(println (mmul A B))

(def A [[1 2 3] [4 5 6]])

(println (shape A))

(def B [[1 2] [3 4] [5 6]])

(println (shape B))

(println (mmul A B))

(def C [[1 2] [3 4]])

(println (shape C))
(println (shape A))
(try
  (mmul A C)
  (catch Exception e (println "Shapes not aligned")))

(def A [[1 2] [3 4] [5 6]])

(println (shape A))

(def B [7 8])

(println (shape B))

(println (mmul A B))