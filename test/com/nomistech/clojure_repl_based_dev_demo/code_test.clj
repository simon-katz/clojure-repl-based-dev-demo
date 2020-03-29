(ns com.nomistech.clojure-repl-based-dev-demo.code-test
  (:require [clojure.test :refer [deftest is]]
            [com.nomistech.clojure-repl-based-dev-demo.code :as sut]))

(deftest g-test
  (is (= 42
         (sut/g))))

(deftest data-from-non-clj-file-test
  (is (= [:a :b :c]
         sut/data-from-non-clj-file)))
