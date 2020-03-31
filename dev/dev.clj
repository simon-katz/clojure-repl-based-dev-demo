(ns dev
  (:require [clojure.java.javadoc :refer [javadoc]]
            [clojure.pprint :refer [pp pprint]]
            [clojure.repl :refer [apropos dir doc find-doc pst source]]
            [clojure.tools.namespace.repl :as tnr]))

;;;; ___________________________________________________________________________

;;;; `clojure.tools.namespace.repl` sometimes doesn't work, because it doesn't
;;;; know what directories to read from when refreshing. This is a problem
;;;; caused by different behaviour around classpaths on different versions of
;;;; the JVM.
;;;;
;;;; See:
;;;; - https://ask.clojure.org/index.php/8288/java-11-and-tools-namespace
;;;; - https://github.com/clojure-emacs/cider/issues/2686
;;;; - https://github.com/clojure-emacs/cider/issues/2686#issuecomment-532389499
;;;;
;;;; Conclusion:
;;;; - Do the following:

(tnr/set-refresh-dirs "dev" "src" "test")
