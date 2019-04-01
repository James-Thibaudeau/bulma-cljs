(ns bulma-cljs-lib.components.message)

(defn message [& content]
  (into [:article.message] content))

(defn message-header [& content]
  (into [:div.message-header] content))

(defn message-body [& content]
  (into [:div.message-body] content))