(ns dlfs.chapter3.section2.step3.step-function-graph
  (:use [clojure.core.matrix])
  (:require [com.hypirion.clj-xchart :as c]))

(def step-function #(if (pos? %) 1 0))

(def x (array (range -5.0 5.0 0.1)))
(def y (emap step-function x))

(def chart
  (c/xy-chart
    {"value" [x y]}
    {:y-axis {:min -0.1
              :max 1.1}}))

(c/view chart)
