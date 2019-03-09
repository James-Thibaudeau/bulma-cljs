(ns bulma-cljs-lib.components.modal)

(defn modal [active? close-fn content]
  [:div.modal {:class [(when active? "is-active")]}
   [:div.modal-background]
   [:div.modal-content
    content]
   [:button.modal-close.is-large {:onClick close-fn}]])