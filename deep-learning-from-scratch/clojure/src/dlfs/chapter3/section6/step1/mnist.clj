(ns dlfs.chapter3.section6.step1.mnist
  (:use [clojure.core.matrix])
  (:require [clojure.java.io :as io]
            [cortex-datasets.mnist :as mnist]
            [quil.core :as q]))

(let [x-train (mnist/training-data)
      t-train (mnist/training-labels)
      x-test (mnist/test-data)
      t-test (mnist/test-labels)]
  (println (shape x-train))
  (println (shape t-train))
  (println (shape x-test))
  (println (shape t-test))

  ; TODO Display image here
  )