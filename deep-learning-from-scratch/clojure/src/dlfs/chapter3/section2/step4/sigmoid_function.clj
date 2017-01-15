(ns dlfs.chapter3.section2.step4.sigmoid-function
  (:use [clojure.core.matrix])
  (:require [com.hypirion.clj-xchart :as c]))

(def sigmoid #(/ 1 (+ 1 (Math/exp (- %)))))

(def x [-1.0 1.0 2.0])

(println (emap sigmoid x))

(def t [1.0 2.0 3.0])

(println (add 1.0 t))
(println (div 1.0 t))

(def x (array (range -5.0 5.0 0.1)))
(def y (emap sigmoid x))

(def chart
  (c/xy-chart
    {"value" [x y]}
    {:y-axis {:min -0.1 :max 1.1}}))

(c/view chart)