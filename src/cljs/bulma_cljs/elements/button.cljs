(ns bulma-cljs.elements.button)

(defn button [label on-click]
  [:button {:class ["button"]
            :onClick on-click} label])

(defn delete-button [on-click]
  [:button.delete {:onClick on-click}])