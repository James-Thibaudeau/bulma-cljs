(ns bulma-cljs.elements.content)

(defn content [& content]
  (into [:div.content] content))