(ns dlfs.chapter2.section3.step1.simple-implementation)

(defn AND [x1 x2]
  (let [w1 0.5
        w2 0.5
        theta 0.7
        tmp (+ (* w1 x1) (* w2 x2))]
    (if (< theta tmp)
      1
      0)))

(println (AND 0 0))
(println (AND 1 0))
(println (AND 0 1))
(println (AND 1 1))