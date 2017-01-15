(ns dlfs.chapter3.section2.step7.relu-function
  (:require [com.hypirion.clj-xchart :as c])
  (:use [clojure.core.matrix :exclude [relu]]))

(def relu (partial max 0))

; The book does not include python code for the following

(def x (array (range -5.0 5.0 0.1)))
(def y (emap relu x))
(def chart
  (c/xy-chart
    {"value" [x y]}
    {:y-axis {:min -0.1 :max 5.1}}))

(c/view chart)
