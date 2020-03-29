(ns com.nomistech.clojure-repl-based-dev-demo.code
  (:require [clojure.edn :as edn]
            [clojure.java.io :as io]))

(defn f [] 42)

(defn g [] (f))


;;;; ___________________________________________________________________________

;;;; Sometimes we have data or functionality that lives outside of Clojure's
;;;; namespace dependency system.
;;;; For example:
;;;; - Configuration data read from .edn files.
;;;; - Auto-generated Clojure functions that wrap queries in .sql files.
;;;;
;;;; In such cases we need `reset-all`.
;;;;
;;;; Here's an example of data from an .edn file.

(def data-from-non-clj-file
  (let [data-string (slurp (io/resource "data.edn"))
        data        (edn/read-string data-string)]
    data))
