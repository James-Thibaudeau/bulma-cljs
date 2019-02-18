(ns bulma-cljs-lib.elements.box)

(defn box [content]
  [:div {:class ["box"]}
   content])