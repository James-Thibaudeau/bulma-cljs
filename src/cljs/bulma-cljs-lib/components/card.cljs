(ns bulma-cljs-lib.components.card)

(defn card [content]
  [:div.card content])

(defn card-header [content]
  [:header.card-header content])

(defn card-image [src]
  [:div.card-image
   [:figure.image.is-4by3
    [:img {:src src}]]])

(defn card-content [content]
  [:div.card-content content])

(defn card-footer [content]
  [:footer.card-footer content])

(defn card-footer-item [content]
  [:span.card-footer-item content])