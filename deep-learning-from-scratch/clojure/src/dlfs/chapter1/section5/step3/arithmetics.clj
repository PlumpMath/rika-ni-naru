(ns dlfs.chapter1.section5.step3.arithmetics
  (:use [clojure.core.matrix]))

(def x [1.0 2.0 3.0])
(def y [2.0 4.0 6.0])

(println (add x y))
(println (sub x y))
(println (mul x y))
(println (div x y))

(println (div x 2.0))