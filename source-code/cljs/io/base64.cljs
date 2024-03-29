
(ns io.base64
    (:require [fruits.base64.api :as base64]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn base64->blob
  ; @description
  ; Converts the given Base64 string into a Blob object.
  ;
  ; @param (string) n
  ;
  ; @usage
  ; (base64->blob "data:application/pdf;base64,...")
  ; =>
  ; #object[Blob]
  ;
  ; @return (Blob object)
  [n]
  (let [binary-string (.atob          js/window n)
        binary-length (.-length       binary-string)
        integer-array (js/Uint8Array. binary-length)
        mime-type     (base64/to-mime-type n)]
       (doseq [i (range binary-length)]
              (aset integer-array i (.charCodeAt binary-string i)))
       (js/Blob. (clj->js [integer-array])
                 (clj->js {:type mime-type}))))
