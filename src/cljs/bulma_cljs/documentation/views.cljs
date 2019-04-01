(ns bulma-cljs.documentation.views
  (:require [bulma-cljs-lib.core :as b]
            [bulma-cljs.documentation.views.pagination :as pagination]
            [bulma-cljs.documentation.views.message :as message]
            [bulma-cljs.documentation.events :as d-events]
            [bulma-cljs.documentation.subs :as d-subs]
            [re-frame.core :as re-frame]))

(def routes
  {:pagination [pagination/pagination]
   :message    [message/message]})

(defn router [page-key]
  (page-key routes))

(defn navigate [page-key]
  (js/console.log "navigate-" page-key)
  (re-frame/dispatch [::d-events/change-page page-key]))


(def sub-menu-data {:label "Components"
                    :items [{:item     "Pagination"
                             :on-click #(navigate :pagination)}
                            {:item     "Message"
                             :on-click #(navigate :message)}]})

(defn documentation []
  (let [current-page (re-frame/subscribe [::d-subs/current-page])]
    [b/columns
     [b/column {:class [:is-one-quarter]}
      [b/menu
       [b/sub-menu sub-menu-data]]]
     [b/column
      {:class [:is-three-quarters]}
      [router @current-page]]]))