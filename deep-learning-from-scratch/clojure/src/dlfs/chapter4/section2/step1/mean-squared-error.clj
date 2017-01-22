(ns dlfs.chapter4.section2.step1.mean-squared-error
  (:require [clojure.core.matrix :as matrix]))

(def y [0.1 0.05 0.6 0.0 0.05 0.1 0.0 0.1 0.0 0.0])
(def t [0 0 1 0 0 0 0 0 0 0])

(defn mean-squared-error [y t]
  (* 0.5 (matrix/esum (matrix/emap #(Math/pow % 2) (matrix/sub y t)))))

(println (mean-squared-error y t))

(def y [0.1 0.05 0.1 0.0 0.05 0.1 0.0 0.6 0.0 0.0])

(println (mean-squared-error y t))