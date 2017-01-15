(ns dlfs.chapter3.section4.step3.review
  (:use [clojure.core.matrix]))

(def sigmoid #(/ 1 (+ 1 (Math/exp (- %)))))

(defn init-network []
  {:W1 [[0.1 0.3 0.5] [0.2 0.4 0.6]]
   :b1 [0.1 0.2 0.3]
   :W2 [[0.1 0.4] [0.2 0.5] [0.3 0.6]]
   :b2 [0.1 0.2]
   :W3 [[0.1 0.3] [0.2 0.4]]
   :b3 [0.1 0.2]})

(defn forward [network x]
  (let [W1 (:W1 network)
        W2 (:W2 network)
        W3 (:W3 network)
        b1 (:b1 network)
        b2 (:b2 network)
        b3 (:b3 network)

        a1 (add b1 (mmul x  W1))
        z1 (emap sigmoid a1)
        a2 (add b2 (mmul z1 W2))
        z2 (emap sigmoid a2)
        a3 (add b3 (mmul z2 W3))
        y  (emap identity a3)]
    y))

(def network (init-network))
(def x [1.0 0.5])
(def y (forward network x))
(println y)
