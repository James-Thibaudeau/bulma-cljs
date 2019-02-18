(ns bulma-cljs-lib.components.message)

(defn message [content]
  [:article.message content])

(defn message-header [content]
  [:div.message-header content])

(defn message-body [content]
  [:div.message-body content])