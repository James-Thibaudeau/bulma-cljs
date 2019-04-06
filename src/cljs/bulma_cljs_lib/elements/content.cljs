(ns bulma-cljs-lib.elements.content)

(defn content [& content]
  (into [:div.content] content))