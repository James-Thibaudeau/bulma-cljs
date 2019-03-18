(ns bulma-cljs-lib.utils)

;; This is not ideal, strings as children can't have meta
(defn children
  "children is used to populate the children of 
   a component, if key is already provided will 
   use that, if not defaults to index"
  [elements]
  (map-indexed
   (fn [index item]
     (if (:key (meta item))
       item
       (with-meta item {:key index})))
   elements))