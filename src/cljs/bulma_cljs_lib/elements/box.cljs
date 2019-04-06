(ns bulma-cljs-lib.elements.box)

(defn box [& content]
  (into [:div.box] content))