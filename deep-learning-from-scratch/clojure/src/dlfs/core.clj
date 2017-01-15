(ns dlfs.core
  (:use [clojure.string :as s :only [lower-case]]))

(def chapter #(println (str "\n" (slurp (str (lower-case (s/replace % #"\s" "")) "/README.md")))))
(def title #(println (str "\n###" %)))
(def run #(require %))

(println "Loading clojure.core.matrix...")
(use 'clojure.core.matrix)

(chapter "Chapter 1")

(title "Creating arrays")
(run 'dlfs.chapter1.section5.step2.creating-arrays)

(title "Arithmetics")
(run 'dlfs.chapter1.section5.step3.arithmetics)

(title "Multidimensional arrays")
(run 'dlfs.chapter1.section5.step4.multidimensional-arrays)

(title "Broadcasting")
(run 'dlfs.chapter1.section5.step5.broadcasting)

(title "Indexing arrays")
(run 'dlfs.chapter1.section5.step6.indexing-arrays)

(title "Drawing graphs")
(run 'dlfs.chapter1.section6.step1.drawing-graphs)

(title "Other features")
(run 'dlfs.chapter1.section6.step2.other-features)

(chapter "Chapter 2")

(title "Simple implementation")
(run 'dlfs.chapter2.section3.step1.simple-implementation)

(title "Weight and bias")
(run 'dlfs.chapter2.section3.step2.weight-and-bias)

(title "Implementation with weight and bias")
(run 'dlfs.chapter2.section3.step3.implementation-with-weight-and-bias)

(title "XOR gate")
(run 'dlfs.chapter2.section5.step2.xor-gate)