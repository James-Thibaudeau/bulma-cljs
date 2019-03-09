(ns bulma-cljs.views
  (:require 
   [reagent.core :as reagent]
   [bulma-cljs-lib.core :as bulma]))


(defn main-panel []
  (let [active? (reagent/atom {:modal false
                               :img false
                               :card false})
        close-fn (fn [k]
                   (swap! active? assoc k false))
        open-fn (fn [k]
                  (swap! active? assoc k true))]
    (fn []
      [:div
       [bulma/button "Click to Open Modal" #(open-fn :modal)]
       [bulma/button "Click to Open Image Modal" #(open-fn :img)]
       [bulma/button "Click to Open Card Modal" #(open-fn :card)]
       [bulma/modal
        (:modal @active?)
        #(close-fn :modal)
        [:div.box
         [:h1 "Modal"]
         [:p "Hello World"]]]
       [bulma/image-modal
        (:img @active?)
        #(close-fn :img)
        "https://i.dailymail.co.uk/i/pix/2012/06/26/article-0-13CA2B13000005DC-989_468x474.jpg"]
       [bulma/card-modal
        (:card @active?)
        #(close-fn :card)
        "Card Modal"
        [:p "body content"]
        [:p "footer content"]
        ]])))
