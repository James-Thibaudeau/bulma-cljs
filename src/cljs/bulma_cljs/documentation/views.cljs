(ns bulma-cljs.documentation.views
  (:require [bulma-cljs-lib.core :as b]
            [reagent.core :as reagent]))


(def sub-menu-data {:label "Test"
                    :items [{:item     "Test2"
                             :on-click identity}]})

(def test-map (zipmap
                (map (comp keyword str) (range 1 12))
                ["one" "two" "three" "four"
                 "five" "six" "seven" "eight"
                 "nine" "ten" "eleven"]))

(defn documentation []
  (let [test-state (reagent/atom 1)
        on-change-fn (fn [page]
                       (js/console.log "page" page)
                       (js/console.log "on-change" (reset! test-state page)))]
    (fn []
      (js/console.log "test-state-str-keyword" (-> @test-state str keyword))
      (js/console.log "test-state" @test-state)
      [b/columns
       [b/column {:class [:is-one-quarter]}
        [b/menu
         [b/sub-menu sub-menu-data]]]
       [b/column
        {:class [:is-three-quarters]}
        [b/pagination {:initial-page 1
                       :total-pages 11
                       :on-change-page on-change-fn}]
        [:p (get test-map (-> @test-state str keyword))]]])))