(ns dlfs.chapter1.section5.step6.indexing-arrays
  (:use [clojure.core.matrix])
  (:use [clojure.core.matrix.selection]))

(def X [[51 55] [14 19] [0 4]])

(println X)

(println (nth X 0))
(println (nth (nth X 0) 1))

(doseq [row X] (println row))

(def X (array (flatten X)))

(println X)

(println (sel X [0 2 4]))

(println (array (map (partial < 15) X)))
(println (sel X (where-slice (partial < 15))))