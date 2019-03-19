(ns bulma-cljs-lib.columns.columns)

(defn columns [& content]
  (into [:div.columns] content))

(defn column [& content]
  (into [:div.column] content))