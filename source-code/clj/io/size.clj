
(ns io.size
    (:require [clojure.java.io]
              [io.check    :as check]
              [io.messages :as messages]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn get-filesize
  ; @description
  ; Returns the size (length of the file in bytes) of the file at the given filepath.
  ;
  ; @param (string) filepath
  ; @param (map)(opt) options
  ; {:warn? (boolean)(opt)
  ;   If TRUE, prints the error message (if any) to the console.
  ;   Default: true}
  ;
  ; @usage
  ; (get-filesize "my-directory/my-file.ext")
  ; =>
  ; 420
  ;
  ; @return (B)
  ([filepath]
   (get-filesize filepath {}))

  ([filepath {:keys [warn?] :or {warn? true}}]
   ; @note (io.actions#7440)
   (try (if (check/file-exists? filepath)
            (->                 filepath str clojure.java.io/file .length)
            (throw (Exception. messages/FILE-DOES-NOT-EXIST-ERROR)))
       (catch Exception e (if warn? (println (str e " \"" filepath "\"")))))))

(defn max-filesize-exceeded?
  ; @description
  ; Returns TRUE if the size of the file at the given filepath is exceeded the given maximum filesize.
  ;
  ; @param (string) filepath
  ; @param (B) max-filesize
  ; @param (map)(opt) options
  ; {:warn? (boolean)(opt)
  ;   If TRUE, prints the error message (if any) to the console.
  ;   Default: true}
  ;
  ; @usage
  ; (max-filesize-exceeded? "my-directory/my-file.ext" 420)
  ; =>
  ; true
  ;
  ; @return (boolean)
  ([filepath max-filesize]
   (max-filesize-exceeded? filepath max-filesize {}))

  ([filepath max-filesize options]
   (if-let [filesize (get-filesize filepath options)]
           (>= filesize max-filesize))))
