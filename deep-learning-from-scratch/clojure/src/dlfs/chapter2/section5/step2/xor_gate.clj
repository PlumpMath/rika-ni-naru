(ns dlfs.chapter2.section5.step2.xor-gate
  (:use [clojure.core.matrix]))

(defn AND [x1 x2]
  (let [x [x1 x2]
        w [0.5 0.5]
        b -0.7
        tmp (add b (esum (mul w x)))]
    (if (<= tmp 0) 0 1)))
(defn NAND [x1 x2]
  (let [x [x1 x2]
        w [-0.5 -0.5]
        b 0.7
        tmp (add b (esum (mul w x)))]
    (if (<= tmp 0) 0 1)))
(defn OR [x1 x2]
  (let [x [x1 x2]
        w [0.5 0.5]
        b -0.2
        tmp (add b (esum (mul w x)))]
    (if (<= tmp 0) 0 1)))

(defn XOR [x1 x2]
  (let [s1 (NAND x1 x2)
        s2 (OR x1 x2)
        y  (AND s1 s2)]
    y))

(println (XOR 0 0))
(println (XOR 1 0))
(println (XOR 0 1))
(println (XOR 1 1))