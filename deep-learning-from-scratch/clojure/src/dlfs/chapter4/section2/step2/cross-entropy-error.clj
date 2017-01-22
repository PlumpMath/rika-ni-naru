(ns dlfs.chapter4.section2.step2.cross-entropy-error
  (:require [clojure.core.matrix :as matrix]))

(defn cross-entropy-error [y t]
  (let [delta 1e-7]
    (- (matrix/esum (matrix/mul t (matrix/log (matrix/add delta y)))))))

(def t [0 0 1 0 0 0 0 0 0 0])
(def y [0.1 0.05 0.6 0.0 0.05 0.1 0.0 0.1 0.0 0.0])

(println (cross-entropy-error y t))

(def y [0.1 0.05 0.1 0.0 0.05 0.1 0.0 0.6 0.0 0.0])

(println (cross-entropy-error y t))