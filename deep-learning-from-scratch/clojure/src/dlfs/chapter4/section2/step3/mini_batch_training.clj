(ns dlfs.chapter4.section2.step3.mini-batch-training
  (:require
    [clojure.core.matrix.random :as rand]
    [cortex-datasets.mnist :as mnist]))

(def x (mnist/test-data))
(def t (mnist/test-labels))

(def batch-size 10)

(def x-batch (take batch-size (shuffle x)))
(def t-batch (take batch-size (shuffle t)))

(println x-batch)
(println t-batch)

(println (take 10 (rand/randoms)))