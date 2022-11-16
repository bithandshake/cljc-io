
# <strong>io.api</strong> namespace
<p>Documentation of the <strong>io/api.cljs</strong> file</p>

<strong>[README](../../../README.md) > [DOCUMENTATION](../../COVER.md) > io.api</strong>



### B->GB

```
@param (B) n
```

```
@usage
(B->GB 420)
```

```
@return (GB)
```

<details>
<summary>Source code</summary>

```
(defn B->GB
  [n]
  (/ n 1000000000))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [io.api :as io :refer [B->GB]]))

(io/B->GB ...)
(B->GB    ...)
```

</details>

---

### B->KB

```
@param (B) n
```

```
@usage
(B->KB 420)
```

```
@return (KB)
```

<details>
<summary>Source code</summary>

```
(defn B->KB
  [n]
  (/ n 1000))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [io.api :as io :refer [B->KB]]))

(io/B->KB ...)
(B->KB    ...)
```

</details>

---

### B->MB

```
@param (B) n
```

```
@usage
(B->MB 420)
```

```
@return (MB)
```

<details>
<summary>Source code</summary>

```
(defn B->MB
  [n]
  (/ n 1000000))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [io.api :as io :refer [B->MB]]))

(io/B->MB ...)
(B->MB    ...)
```

</details>

---

### EXTENSIONS

<details>
<summary>Source code</summary>

```

```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [io.api :as io :refer [EXTENSIONS]]))

(io/EXTENSIONS)
(EXTENSIONS)
```

</details>

---

### IMAGE-EXTENSIONS

<details>
<summary>Source code</summary>

```

```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [io.api :as io :refer [IMAGE-EXTENSIONS]]))

(io/IMAGE-EXTENSIONS)
(IMAGE-EXTENSIONS)
```

</details>

---

### KB->B

```
@param (KB) n
```

```
@usage
(KB->B 420)
```

```
@return (B)
```

<details>
<summary>Source code</summary>

```
(defn KB->B
  [n]
  (* n 1000))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [io.api :as io :refer [KB->B]]))

(io/KB->B ...)
(KB->B    ...)
```

</details>

---

### KB->GB

```
@param (KB) n
```

```
@usage
(KB->GB 420)
```

```
@return (GB)
```

<details>
<summary>Source code</summary>

```
(defn KB->GB
  [n]
  (/ n 1000000))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [io.api :as io :refer [KB->GB]]))

(io/KB->GB ...)
(KB->GB    ...)
```

</details>

---

### KB->MB

```
@param (KB) n
```

```
@usage
(KB->MB 420)
```

```
@return (MB)
```

<details>
<summary>Source code</summary>

```
(defn KB->MB
  [n]
  (/ n 1000))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [io.api :as io :refer [KB->MB]]))

(io/KB->MB ...)
(KB->MB    ...)
```

</details>

---

### MB->B

```
@param (MB) n
```

```
@usage
(MB->B 420)
```

```
@return (B)
```

<details>
<summary>Source code</summary>

```
(defn MB->B
  [n]
  (* n 1000000))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [io.api :as io :refer [MB->B]]))

(io/MB->B ...)
(MB->B    ...)
```

</details>

---

### MB->GB

```
@param (MB) n
```

```
@usage
(MB->GB 420)
```

```
@return (GB)
```

<details>
<summary>Source code</summary>

```
(defn MB->GB
  [n]
  (/ n 1000))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [io.api :as io :refer [MB->GB]]))

(io/MB->GB ...)
(MB->GB    ...)
```

</details>

---

### MB->KB

```
@param (MB) n
```

```
@usage
(MB->KB 420)
```

```
@return (KB)
```

<details>
<summary>Source code</summary>

```
(defn MB->KB
  [n]
  (* n 1000))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [io.api :as io :refer [MB->KB]]))

(io/MB->KB ...)
(MB->KB    ...)
```

</details>

---

### MIME-TYPES

<details>
<summary>Source code</summary>

```

```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [io.api :as io :refer [MIME-TYPES]]))

(io/MIME-TYPES)
(MIME-TYPES)
```

</details>

---

### directory-name-invalid?

```
@param (string) directory-name
```

```
@example
(directory-name-invalid? "my-directory")
=>
false
```

```
@example
(directory-name-invalid? "my-directory/my-subdirectory")
=>
true
```

```
@return (boolean)
```

<details>
<summary>Source code</summary>

```
(defn directory-name-invalid?
  [directory-name]
  (re-mismatch? directory-name config/DIRECTORY-NAME-PATTERN))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [io.api :as io :refer [directory-name-invalid?]]))

(io/directory-name-invalid? ...)
(directory-name-invalid?    ...)
```

</details>

---

### directory-name-valid?

```
@param (string) directory-name
```

```
@example
(directory-name-valid? "my-directory")
=>
true
```

```
@example
(directory-name-valid? "my-directory/my-subdirectory")
=>
false
```

```
@return (boolean)
```

<details>
<summary>Source code</summary>

```
(defn directory-name-valid?
  [directory-name]
  (re-match? directory-name config/DIRECTORY-NAME-PATTERN))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [io.api :as io :refer [directory-name-valid?]]))

(io/directory-name-valid? ...)
(directory-name-valid?    ...)
```

</details>

---

### directory-path->directory-name

```
@param (string) directory-path
```

```
@example
(directory-path->directory-name "a/b")
=>
"b"
```

```
@return (string)
```

<details>
<summary>Source code</summary>

```
(defn directory-path->directory-name
  [directory-path]
  (if-let [directory-name (string/after-last-occurence directory-path "/")]
          (return directory-name)
          (return directory-path)))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [io.api :as io :refer [directory-path->directory-name]]))

(io/directory-path->directory-name ...)
(directory-path->directory-name    ...)
```

</details>

---

### extension->image?

```
@param (string) extension
```

```
@example
(extension->image? "png")
=>
true
```

```
@return (boolean)
```

<details>
<summary>Source code</summary>

```
(defn extension->image?
  [extension]
  (vector/contains-item? config/IMAGE-EXTENSIONS extension))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [io.api :as io :refer [extension->image?]]))

(io/extension->image? ...)
(extension->image?    ...)
```

</details>

---

### extension->mime-type

```
@param (extension) 
```

```
@example
(extension->mime-type "xml")
=>
"text/xml"
```

```
@example
(extension->mime-type "bar")
=>
"unknown/unknown"
```

```
@return (string)
```

<details>
<summary>Source code</summary>

```
(defn extension->mime-type
  [extension]
  (get config/MIME-TYPES (string/lowercase extension) "unknown/unknown"))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [io.api :as io :refer [extension->mime-type]]))

(io/extension->mime-type ...)
(extension->mime-type    ...)
```

</details>

---

### filename->basename

```
@param (string) filename
```

```
@example
(filename->basename "my-file.EXT")
=>
"my-file"
```

```
@example
(filename->basename ".my-hidden-file.ext")
=>
".my-hidden-file"
```

```
@example
(filename->basename ".my-hidden-file")
=>
".my-hidden-file"
```

```
@return (string)
```

<details>
<summary>Source code</summary>

```
(defn filename->basename
  [filename]
  (if-let [extension (filename->extension filename)]
          (string/before-last-occurence filename (str "." extension))
          (return filename)))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [io.api :as io :refer [filename->basename]]))

(io/filename->basename ...)
(filename->basename    ...)
```

</details>

---

### filename->extension

```
@param (string) filename
```

```
@example
(filename->extension "my-file.EXT")
=>
"ext"
```

```
@example
(filename->extension ".my-hidden-file.ext")
=>
"ext"
```

```
@example
(filename->extension ".my-hidden-file")
=>
nil
```

```
@return (string)
```

<details>
<summary>Source code</summary>

```
(defn filename->extension
  [filename]
  (filepath->extension filename))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [io.api :as io :refer [filename->extension]]))

(io/filename->extension ...)
(filename->extension    ...)
```

</details>

---

### filename->image?

```
@param (string) filename
```

```
@example
(filename->image? "my-image.png")
=>
true
```

```
@example
(filename->image? "my-file.ext")
=>
false
```

```
@example
(filename->image? "my-file")
=>
false
```

```
@return (boolean)
```

<details>
<summary>Source code</summary>

```
(defn filename->image?
  [filename]
  (filepath->image? filename))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [io.api :as io :refer [filename->image?]]))

(io/filename->image? ...)
(filename->image?    ...)
```

</details>

---

### filename->mime-type

```
@param (string) filename
```

```
@example
(filename->mime-type "my-image.png")
=>
"image/png"
```

```
@example
(filename->mime-type "my-file")
=>
"unknown/unknown"
```

```
@return (string)
```

<details>
<summary>Source code</summary>

```
(defn filename->mime-type
  [filename]
  (filepath->mime-type filename))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [io.api :as io :refer [filename->mime-type]]))

(io/filename->mime-type ...)
(filename->mime-type    ...)
```

</details>

---

### filename-invalid?

```
@param (string) filename
```

```
@example
(filename-invalid? "my-file.ext")
=>
false
```

```
@example
(filename-invalid? "my-directory/my-file.ext")
=>
true
```

```
@return (boolean)
```

<details>
<summary>Source code</summary>

```
(defn filename-invalid?
  [filename]
  (re-mismatch? filename config/FILENAME-PATTERN))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [io.api :as io :refer [filename-invalid?]]))

(io/filename-invalid? ...)
(filename-invalid?    ...)
```

</details>

---

### filename-valid?

```
@param (string) filename
```

```
@example
(filename-valid? "my-file.ext")
=>
true
```

```
@example
(filename-valid? "my-directory/my-file.ext")
=>
false
```

```
@return (boolean)
```

<details>
<summary>Source code</summary>

```
(defn filename-valid?
  [filename]
  (re-match? filename config/FILENAME-PATTERN))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [io.api :as io :refer [filename-valid?]]))

(io/filename-valid? ...)
(filename-valid?    ...)
```

</details>

---

### filepath->basename

```
@param (string) filepath
```

```
@example
(filepath->basename "my-directory/my-file.EXT")
=>
"my-file"
```

```
@example
(filepath->basename "my-directory/.my-hidden-file.ext")
=>
".my-hidden-file"
```

```
@example
(filepath->basename "my-directory/.my-hidden-file")
=>
".my-hidden-file"
```

```
@return (string)
```

<details>
<summary>Source code</summary>

```
(defn filepath->basename
  [filepath]
  (-> filepath filepath->filename filename->basename))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [io.api :as io :refer [filepath->basename]]))

(io/filepath->basename ...)
(filepath->basename    ...)
```

</details>

---

### filepath->directory-path

```
@param (string) filepath
```

```
@example
(filepath->directory-path "my-directory/my-subdirectory/my-file.ext")
=>
"my-directory/my-subdirectory"
```

```
@return (string)
```

<details>
<summary>Source code</summary>

```
(defn filepath->directory-path
  [filepath]
  (string/before-last-occurence filepath "/" {:return? false}))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [io.api :as io :refer [filepath->directory-path]]))

(io/filepath->directory-path ...)
(filepath->directory-path    ...)
```

</details>

---

### filepath->extension

```
@param (string) filepath
```

```
@example
(filepath->extension "my-directory/my-file.EXT")
=>
"ext"
```

```
@example
(filepath->extension "my-directory/.my-hidden-file.ext")
=>
"ext"
```

```
@example
(filepath->extension "my-directory/.my-hidden-file")
=>
nil
```

```
@return (string)
```

<details>
<summary>Source code</summary>

```
(defn filepath->extension
  [filepath]
  (let [filename (-> filepath filepath->filename (string/not-starts-with! "."))]
       (if-let [extension (string/after-last-occurence filename "." {:return? false})]
               (string/lowercase extension))))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [io.api :as io :refer [filepath->extension]]))

(io/filepath->extension ...)
(filepath->extension    ...)
```

</details>

---

### filepath->filename

```
@param (string) filepath
```

```
@example
(filepath->filename "my-directory/my-file.ext")
=>
"my-file.ext"
```

```
@return (string)
```

<details>
<summary>Source code</summary>

```
(defn filepath->filename
  [filepath]
  (string/after-last-occurence filepath "/" {:return? true}))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [io.api :as io :refer [filepath->filename]]))

(io/filepath->filename ...)
(filepath->filename    ...)
```

</details>

---

### filepath->image?

```
@param (string) filepath
```

```
@example
(filepath->image? "my-directory/my-image.png")
=>
true
```

```
@example
(filepath->image? "my-directory/my-file.ext")
=>
false
```

```
@example
(filepath->image? "my-directory/my-file")
=>
false
```

```
@return (boolean)
```

<details>
<summary>Source code</summary>

```
(defn filepath->image?
  [filepath]
  (-> filepath filepath->extension extension->image?))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [io.api :as io :refer [filepath->image?]]))

(io/filepath->image? ...)
(filepath->image?    ...)
```

</details>

---

### filepath->mime-type

```
@param (string) filepath
```

```
@example
(filepath->mime-type "my-directory/my-image.png")
=>
"image/png"
```

```
@example
(filepath->mime-type "my-directory/my-file")
=>
"unknown/unknown"
```

```
@return (string)
```

<details>
<summary>Source code</summary>

```
(defn filepath->mime-type
  [filepath]
  (-> filepath filepath->extension mime-type/extension->mime-type))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [io.api :as io :refer [filepath->mime-type]]))

(io/filepath->mime-type ...)
(filepath->mime-type    ...)
```

</details>

---

### mime-type->extension

```
@param (string) mime-type
```

```
@example
(mime-type->extension "text/xml")
=>
"xml"
```

```
@example
(mime-type->extension "foo/bar")
=>
"unknown"
```

```
@return (string)
```

<details>
<summary>Source code</summary>

```
(defn mime-type->extension
  [mime-type]
  (get config/EXTENSIONS (string/lowercase mime-type) "unknown"))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [io.api :as io :refer [mime-type->extension]]))

(io/mime-type->extension ...)
(mime-type->extension    ...)
```

</details>

---

### mime-type->image?

```
@param (string) extension
```

```
@example
(mime-type->image? "image/png")
=>
true
```

```
@example
(mime-type->image? "application/pdf")
=>
false
```

```
@return (boolean)
```

<details>
<summary>Source code</summary>

```
(defn mime-type->image?
  [mime-type]
  (string/starts-with? mime-type "image"))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [io.api :as io :refer [mime-type->image?]]))

(io/mime-type->image? ...)
(mime-type->image?    ...)
```

</details>

---

### unknown-mime-type?

```
@param (string) mime-type
```

```
@example
(unknown-mime-type? "text/xml")
=>
false
```

```
@example
(unknown-mime-type? "foo/bar")
=>
true
```

```
@return (boolean)
```

<details>
<summary>Source code</summary>

```
(defn unknown-mime-type?
  [mime-type]
  (-> mime-type mime-type->extension nil?))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [io.api :as io :refer [unknown-mime-type?]]))

(io/unknown-mime-type? ...)
(unknown-mime-type?    ...)
```

</details>