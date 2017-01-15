(ns dlfs.chapter3.section4.step2.signaling
  (:use [clojure.core.matrix]))

(def sigmoid #(/ 1 (+ 1 (Math/exp (- %)))))

(def X [1.0 0.5])
(def W1 [[0.1 0.3 0.5] [0.2 0.4 0.6]])
(def B1 [0.1 0.2 0.3])

(println (shape W1))
(println (shape X))
(println (shape B1))

(def A1 (add B1 (mmul X W1)))

(def Z1 (emap sigmoid A1))

(println A1)
(println Z1)

(def W2 [[0.1 0.4] [0.2 0.5] [0.3 0.6]])
(def B2 [0.1 0.2])

(println (shape Z1))
(println (shape W2))
(println (shape B2))

(def A2 (add B2 (mmul Z1 W2)))
(def Z2 (emap sigmoid A2))

(def W3 [[0.1 0.3] [0.2 0.4]])
(def B3 [0.1 0.2])

(def A3 (add B3 (mmul Z2 W3)))
(def Y (emap identity A3))