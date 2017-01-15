(ns dlfs.chapter2.section3.step2.weight-and-bias
  (:use [clojure.core.matrix]))

(def x [0 1])
(def w [0.5 0.5])
(def b -0.7)

(println (mul w x))
(println (esum (mul w x)))
(println (+ b (esum (mul w x))))