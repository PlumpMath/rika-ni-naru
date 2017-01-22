(ns dlfs.chapter3.section6.step1.mnist
  (:require
    [clojure.core.matrix :as mat]
    [clojure.java.io :as io]
    [cortex-datasets.mnist :as mnist]))

(let [x-train (mnist/training-data)
      t-train (mnist/training-labels)
      x-test (mnist/test-data)
      t-test (mnist/test-labels)
      image (first x-train)
      label (first t-train)
      reshaped (mat/reshape image [28 28])]

  (println (mat/shape x-train))
  (println (mat/shape t-train))
  (println (mat/shape x-test))
  (println (mat/shape t-test))

  (println label)
  (println (mat/shape image))
  (println (mat/shape reshaped))

  ; Skip the image part
  )