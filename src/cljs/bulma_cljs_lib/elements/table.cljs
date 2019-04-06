(ns bulma-cljs-lib.elements.table)

(defn table [& content]
  (into [:div.table] content))