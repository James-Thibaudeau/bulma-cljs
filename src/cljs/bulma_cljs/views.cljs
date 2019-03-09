(ns bulma-cljs.views
  (:require [bulma-cljs-lib.core :as bulma]))

(defn main-panel []
  [:div
   
   [bulma/menu [{:label "General" :items ["test1" "test2" "test3"]}
                {:label "Advanced" :items ["test1" "test2" "test3"]}
                {:label "Options" :items ["test1" "test2" "test3"]}]]
   
   [bulma/breadcrumb [{:text "test1" :on-click identity :active? true}
                      {:text "test2" :on-click identity :active? false}
                      {:text "test3" :on-click identity :active? false}]]
   [bulma/title "Welcome to bulma-cljs"]
   [bulma/select [{:value "test1" :text "test1"}
                  {:value "test2" :text "test2"}
                  {:value "test3" :text "test3"}
                  {:value "test4" :text "test4"}]]
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
