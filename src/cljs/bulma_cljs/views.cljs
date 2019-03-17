(ns bulma-cljs.views
  (:require
   [reagent.core :as reagent]
   [re-frame.core :as re-frame]
   [bulma-cljs-lib.core :as b]
   [bulma-cljs.events :as events]
   [bulma-cljs.subs :as subs]
   [bulma-cljs.documentation.views :as docs]
   [bulma-cljs.home.views :as home]))

(def bulma-logo
  "https://bulma.io/images/bulma-logo.png")

(def image-url
  "https://i.dailymail.co.uk/i/pix/2012/06/26/article-0-13CA2B13000005DC-989_468x474.jpg")

(defn navigate [page-key]
  (re-frame/dispatch [::events/change-page page-key]))

(def routes
  {:home [home/home]
   :documentation [docs/documentation]})

(defn router [page-key]
  (page-key routes))

(defn main-panel []
  (let [current-page (re-frame/subscribe [::subs/current-page])]
    (fn []
      [b/container
       [b/navbar
        [b/navbar-brand
         bulma-logo
         [b/navbar-burger]]
        [b/navbar-menu
         [b/navbar-start
          [b/navbar-item "Home" {:on-click #(navigate :home)}]
          [b/navbar-item "Documentation" {:on-click #(navigate :documentation)}]]
         [b/navbar-end
          [b/navbar-item "Github"]]]]
       [router @current-page]])))
