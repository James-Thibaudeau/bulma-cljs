(ns bulma-cljs.layout.tiles)

(defn tile [& content]
  (into [:div.tile] content))