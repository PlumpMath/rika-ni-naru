(ns dlfs.chapter1.section5.step5.broadcasting
  (:use [clojure.core.matrix]))

(def A [[1 2] [3 4]])
(def B [10 20])

(println (mul A B))