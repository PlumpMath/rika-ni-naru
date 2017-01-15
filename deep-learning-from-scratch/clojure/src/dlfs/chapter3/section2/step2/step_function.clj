(ns dlfs.chapter3.section2.step2.step-function
  (:use [clojure.core.matrix]))

(def step-function #(if (pos? %) 1 0))

(def x [-1.0 1.0 2.0])

(println x)

(def y (emap step-function x))

(println (emap pos? y))
(println y)