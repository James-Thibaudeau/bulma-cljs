(ns bulma-cljs.components.card)

(defn card [& content]
  (into [:div.card] content))

(defn card-header [& content]
  (into [:header.card-header] content))

(defn card-image [src]
  [:div.card-image
   [:figure.image.is-4by3
    [:img {:src src}]]])

(defn card-content [& content]
  (into [:div.card-content] content))

(defn card-footer [& content]
  (into [:footer.card-footer] content))

(defn card-footer-item [& content]
  (into [:span.card-footer-item] content))