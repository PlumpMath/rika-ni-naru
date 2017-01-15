(ns dlfs.chapter1.section6.step2.other-features
  (:require [com.hypirion.clj-xchart :as c])
  (:use [clojure.core.matrix]))

(def x (array (range 0 6 0.1)))
(def y1 (sin x))
(def y2 (cos x))

(def chart
  (c/xy-chart
    {"sin" [x y1]
     "cos" [x y2]}
    {:title "sin & cos"
     :x-axis {:title "x"}
     :y-axis {:title "y"}
     :theme :matlab}))

(c/view chart)
