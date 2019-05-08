(ns bulma-cljs.elements.table)

(defn table [& content]
  (into [:div.table] content))