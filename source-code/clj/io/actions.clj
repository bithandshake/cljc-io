
;; -- Namespace ---------------------------------------------------------------
;; ----------------------------------------------------------------------------

(ns io.actions
    (:require [clojure.java.io]
              [io.check          :as check]
              [io.config         :as config]
              [mid-fruits.string :as string]))



;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn delete-file!
  ; @param (string) filepath
  ;
  ; @return (?)
  [filepath]
  (try (if (check/file-exists?          filepath)
           (clojure.java.io/delete-file filepath)
           (throw (Exception. config/FILE-DOES-NOT-EXIST-ERROR)))
      (catch Exception e (println (str e " \"" filepath "\"")))))

(defn copy-file!
  ; WARNING! NON-PUBLIC! DO NOT USE!
  ;
  ; @param (string) source-filepath
  ; @param (string) destination-filepath
  ;
  ; @return (?)
  [source-filepath destination-filepath]
  (try (if (check/file-exists? source-filepath)
           (clojure.java.io/copy (clojure.java.io/file      source-filepath)
                                 (clojure.java.io/file destination-filepath))
           (throw (Exception. config/FILE-DOES-NOT-EXIST-ERROR)))
       (catch Exception e (println (str e " \"" source-filepath "\"")))))

(defn write-file!
  ; @param (string) filepath
  ; @param (*) content
  ;
  ; @return (?)
  [filepath content]
  (if-not (check/file-exists? filepath)
          (println (str config/CREATE-FILE-MESSAGE " \"" filepath "\"")))
  (spit filepath (str content)))

(defn append-to-file!
  ; @param (string) filepath
  ; @param (*) content
  ; @param (map)(opt) options
  ;  {:max-line-count (integer)(opt)
  ;   :reverse? (boolean)(opt)
  ;    Default: false}
  ;
  ; @return (?)
  [filepath content {:keys [max-line-count reverse?]}]
  (let [file-content (read-file filepath)
        output       (if reverse? (str content      "\n" file-content)
                                  (str file-content "\n" content))]
       (if max-line-count ; If maximum number of lines is limited ...
                          (let [output (string/max-lines output max-line-count)]
                               (write-file! filepath output))
                          ; If maximum number of lines is NOT limited ...
                          (write-file! filepath output))))

(defn create-file!
  ; @param (string) filepath
  ;
  ; @return (?)
  [filepath]
  (if-not (check/file-exists? filepath)
          (println (str config/CREATE-FILE-MESSAGE " \"" filepath "\"")))
  (spit filepath nil))

(defn copy-uri-to-file!
  ; @param (string) uri
  ; @param (?) file
  ;
  ; @return (?)
  [uri file]
  (try (with-open [input  (clojure.java.io/input-stream  uri)
                   output (clojure.java.io/output-stream file)]
                  (clojure.java.io/copy input output))
       (catch Exception e (println e))))



;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn create-directory!
  ; @param (string) directory-path
  ;
  ; @return (?)
  [directory-path]
  (try (-> directory-path java.io.File. .mkdir)
       (catch Exception e (println e))))

(defn delete-empty-directory!
  ; @param (string) directory-path
  ;
  ; @return (?)
  [directory-path]
  (try (if (check/directory-exists?     directory-path)
           (clojure.java.io/delete-file directory-path)
           (throw (Exception. config/DIRECTORY-DOES-NOT-EXIST-ERROR)))
      (catch Exception e (println (str e " \"" directory-path "\"")))))

(defn empty-directory!
  ; @param (string) directory-path
  ;
  ; @return (?)
  [directory-path]
  (doseq [item-path (item-list directory-path)]
         (if (check/directory? item-path)
             (do (empty-directory!        item-path)
                 (delete-empty-directory! item-path))
             (delete-file! item-path))))

(defn delete-directory!
  ; @param (string) directory-path
  ;
  ; @return (?)
  [directory-path]
  (empty-directory!        directory-path)
  (delete-empty-directory! directory-path))
