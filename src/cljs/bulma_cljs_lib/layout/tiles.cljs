(ns bulma-cljs-lib.layout.tiles)

(defn tile [& content]
  (into [:div.tile] content))