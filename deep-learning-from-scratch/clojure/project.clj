(defproject dlfs "0.1.0"
  :description "Deep Learning from Scratch codes in Clojure"
  :url "https://github.com/linterpreteur/rika-ni-naru/"
  :license {:name "MIT License"
            :url "https://github.com/linterpreteur/rika-ni-naru/blob/master/LICENSE"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 ; numpy equivalent
                 [net.mikera/core.matrix "0.57.0"]
                 ; matplotlib equivalent
                 [com.hypirion/clj-xchart "0.2.0"]
                 ; display image
                 [quil "2.5.0"]
                 ; mnist dataset
                 [thinktopic/cortex-datasets "0.3.0"]])
