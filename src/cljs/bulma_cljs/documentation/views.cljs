(ns bulma-cljs.documentation.views
  (:require [bulma-cljs-lib.core :as b]))

(def sub-menu-data {:label "Test"
                    :items [{:item "Test2"
                             :on-click identity}] })

(defn documentation []
  [b/columns
   [b/column {:class [:is-one-quarter]}
    [b/menu
     [b/sub-menu sub-menu-data]]]
   [b/column
    {:class [:is-three-quarters]}
    [:h2 "Column2"]]])