(ns bulma-cljs.components.modal)

;; modals are externally controlled, maybe make an internal controlled one in the future
(defn modal [active? close-fn content]
  [:div.modal {:class [(when active? "is-active")]}
   [:div.modal-background]
   [:div.modal-content
    content]
   [:button.modal-close.is-large {:onClick close-fn}]])

(defn image-modal [active? close-fn img-url]
  [:div.modal {:class [(when active? "is-active")]}
   [:div.modal-background]
   [:div.modal-content
    [:p.image.is-4by3
     [:img {:src img-url}]]]
   [:button.modal-close.is-large {:onClick close-fn}]])

(defn card-modal [active? close-fn title header-content body-content footer-content]
  [:div.modal {:class [(when active? "is-active")]}
   [:div.modal-background]
   [:div.modal-card
    [:header.modal-card-head
     [:p.modal-card-title title]
     [:button.delete {:onClick close-fn}]]
    [:section.modal-card-body
     body-content]
    [:footer.modal-card-foot
     footer-content]]])