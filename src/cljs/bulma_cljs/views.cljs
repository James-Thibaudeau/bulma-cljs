(ns bulma-cljs.views
  (:require 
   [reagent.core :as reagent]
   [bulma-cljs-lib.core :as bulma]))

(def bulma-logo
  "https://bulma.io/images/bulma-logo.png")

(def image-url 
  "https://i.dailymail.co.uk/i/pix/2012/06/26/article-0-13CA2B13000005DC-989_468x474.jpg")

(defn main-panel []
    (fn []
      [bulma/navbar
        [bulma/navbar-brand 
         bulma-logo
         [bulma/navbar-burger]]
        [bulma/navbar-menu
          [bulma/navbar-start
           [bulma/navbar-item "Home"]
           [bulma/navbar-item "Documentation"]]
          [bulma/navbar-end
           [bulma/navbar-item "Github"]]]]))
