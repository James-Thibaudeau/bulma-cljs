(ns bulma-cljs-lib.utils)

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