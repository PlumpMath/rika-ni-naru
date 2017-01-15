(ns dlfs.chapter2.section3.step3.implementation-with-weight-and-bias
  (:use [clojure.core.matrix]))

(defn AND [x1 x2]
  (let [x [x1 x2]
        w [0.5 0.5]
        b -0.7
        tmp (add b (esum (mul w x)))]
    (if (<= tmp 0) 0 1)))

(println (AND 0 0))
(println (AND 1 0))
(println (AND 0 1))
(println (AND 1 1))

(defn NAND [x1 x2]
  (let [x [x1 x2]
        w [-0.5 -0.5]
        b 0.7
        tmp (add b (esum (mul w x)))]
    (if (<= tmp 0) 0 1)))

(println (NAND 0 0))
(println (NAND 1 0))
(println (NAND 0 1))
(println (NAND 1 1))

(defn OR [x1 x2]
  (let [x [x1 x2]
        w [0.5 0.5]
        b -0.2
        tmp (add b (esum (mul w x)))]
    (if (<= tmp 0) 0 1)))

(println (OR 0 0))
(println (OR 1 0))
(println (OR 0 1))
(println (OR 1 1))
