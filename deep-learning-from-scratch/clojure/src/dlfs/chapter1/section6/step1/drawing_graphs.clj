(ns dlfs.chapter1.section6.step1.drawing-graphs
  (:require [com.hypirion.clj-xchart :as c]))

(def x (range 0 6 0.1))
(def y (map #(Math/sin %) x))

(def chart
  (c/xy-chart {"foo" [x y]}))

(c/view chart)

