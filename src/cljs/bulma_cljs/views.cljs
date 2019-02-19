(ns bulma-cljs.views
  (:require [bulma-cljs-lib.core :as bulma]))

(defn main-panel []
  [:div
   [bulma/title "Welcome to bulma-cljs"]
   [bulma/dropdown
    [:<>
     [:div.dropdown-trigger {:aria-controls "dropdown-menu" :aria-haspopup true}
      [:button.button
       [:span "Click Me"]
       [:span.icon.is-small
        [:i.fas.fa-angle-down]]]]
     [:div.dropdown-menu {:id "dropdown-menu"}
      [:div.dropdown-content
       [:div.dropdown-item "1"]
       [:div.dropdown-item "2"]
       [:div.dropdown-item "3"]]]]]])
