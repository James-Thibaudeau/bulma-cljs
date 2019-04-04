(ns bulma-cljs.docs.views
  (:require [bulma-cljs-lib.core :as b]
            [bulma-cljs.docs.sub-views.components.breadcrumb :as breadcrumb]
            [bulma-cljs.docs.sub-views.components.card :as card]
            [bulma-cljs.docs.sub-views.components.dropdown :as dropdown]
            [bulma-cljs.docs.sub-views.components.menu :as menu]
            [bulma-cljs.docs.sub-views.components.message :as message]
            [bulma-cljs.docs.sub-views.components.modal :as modal]
            [bulma-cljs.docs.sub-views.components.navbar :as navbar]
            [bulma-cljs.docs.sub-views.components.pagination :as pagination]
            [bulma-cljs.docs.sub-views.components.panel :as panel]
            [bulma-cljs.docs.sub-views.components.tabs :as tabs]
            [bulma-cljs.docs.sub-views.elements.box :as box]
            [bulma-cljs.docs.sub-views.elements.button :as button]
            [bulma-cljs.docs.sub-views.elements.content :as content]
            [bulma-cljs.docs.sub-views.elements.icon :as icon]
            [bulma-cljs.docs.sub-views.elements.image :as image]
            [bulma-cljs.docs.sub-views.elements.notification :as notification]
            [bulma-cljs.docs.sub-views.elements.progress-bars :as prog-bars]
            [bulma-cljs.docs.sub-views.elements.table :as table]
            [bulma-cljs.docs.sub-views.elements.tag :as tag]
            [bulma-cljs.docs.sub-views.elements.title :as title]
            [bulma-cljs.docs.events :as d-events]
            [bulma-cljs.docs.subs :as d-subs]
            [re-frame.core :as re-frame]
            [clojure.string :refer [capitalize]]))

(def routes
  {:components {:breadcrumb [breadcrumb/main]
                :card       [card/main]
                :dropdown   [dropdown/main]
                :menu       [menu/main]
                :message    [message/main]
                :modal      [modal/main]
                :navbar     [navbar/main]
                :pagination [pagination/main]
                :panel      [panel/main]
                :tabs       [tabs/main]}
   :elements   {:box           [box/main]
                :button        [button/main]
                :content       [content/main]
                :icon          [icon/main]
                :image         [image/main]
                :notification  [notification/main]
                :progress-bars [prog-bars/main]
                :table         [table/main]
                :tag           [tag/main]
                :title         [title/main]}})

(defn router [page-key]
  (page-key routes))

(defn navigate [page-key]
  (re-frame/dispatch [::d-events/change-page page-key]))

(def menus
  (reduce-kv (fn [prev k v]
               (assoc prev
                 k {:label (-> k name capitalize)
                    :items (mapv (fn [item]
                                   {:item     (-> item name capitalize)
                                    :on-click #(navigate item)})
                                 (keys v))}))
             {}
             routes))

(defn main []
  (let [current-page (re-frame/subscribe [::d-subs/current-page])]
    [b/columns
     [b/column {:class [:is-one-quarter]}
      [b/menu
       (map (fn [[_ v]]
              ^{:key (:label v)}
              [b/sub-menu v])
            menus)]]
     [b/column
      {:class [:is-three-quarters]}
      [router @current-page]]]))