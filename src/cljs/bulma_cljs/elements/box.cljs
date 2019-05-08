(ns bulma-cljs.elements.box)

(defn box [& content]
  (into [:div.box] content))