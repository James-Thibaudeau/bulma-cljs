(ns bulma-cljs.views
  (:require 
   [reagent.core :as reagent]
   [bulma-cljs-lib.core :as bulma]))


(defn main-panel []
  (let [active? (reagent/atom false)
        close-fn #(reset! active? false)
        open-fn #(reset! active? true)]
    (fn []
      [:div
       [bulma/button "Click to Open" open-fn]
       [bulma/modal
        @active?
        close-fn
        [:div.box
         [:h1 "Modal"]
         [:p "Hello World"]]]])))
