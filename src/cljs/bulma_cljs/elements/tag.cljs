(ns bulma-cljs.elements.tag)

(defn tag-list [& tags]
  (into [:div.tags] tags))

(defn tag [content]
  [:span.tag content])

(defn delete-tag [content delete-fn]
  [:div.tags.has-addons
   [:span.tag content]
   [:span.tag.is-delete {:onClick delete-fn}]])