
(ns iso.io.directory
    (:require [fruits.string.api :as string]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn directory-path->directory-name
  ; @param (string) directory-path
  ;
  ; @usage
  ; (directory-path->directory-name "a/b")
  ; =>
  ; "b"
  ;
  ; @return (string)
  [directory-path]
  (if-let [directory-name (string/after-last-occurence directory-path "/")]
          (-> directory-name)
          (-> directory-path)))
