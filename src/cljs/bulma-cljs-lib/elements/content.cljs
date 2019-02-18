(ns bulma-cljs-lib.elements.content)

(defn- content-base [size content]
  [:div {:class ["content" size]} content])

(defn content [content]
  [content-base nil content])

(defn sm-content [content]
  [content-base "is-small" content])

(defn md-content [content]
  [content-base "is-medium" content])

(defn lg-content [content]
  [content-base "is-large" content])