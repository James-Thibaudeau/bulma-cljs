(ns bulma-cljs.elements.button)

(defn button [label on-click & [{:keys [class]}]]
  [:button.button
   {:class class
    :onClick on-click}
   label])

;; use a fragment to add buttons to the buttons list
(defn button-list [& content]
  (into [:div.buttons] content))

(defn delete-button [on-click & [{:keys [class]}]]
  [:button.delete {:class class
                   :onClick on-click}])

(defn inverted-button [label on-click & [{:keys [class]}]]
  [:button.button
   {:class (into ["is-inverted"] class)
    :onClick on-click}
   label])

(defn round-button [label on-click & [{:keys [class]}]]
  [:button.button
   {:class (into ["is-rounded"] class)
    :onClick on-click}
   label])