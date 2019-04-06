(ns bulma-cljs.docs.sub-views.elements.progress-bars
  (:require [bulma-cljs-lib.core :as b]
            [reagent.core :as r]))

(defn main []
  (let [progress (r/atom 0)
        max 10
        increase-fn (fn []
                      (swap! progress
                             #(if (< % max)
                                (inc %)
                                %)))
        decrease-fn (fn []
                      (swap! progress
                             #(if (> % 0)
                                (dec %)
                                %)))]
    (fn []
      [b/section
       [b/subtitle "Progress Bars"]
       [b/content "This is an example of the progress-bars component"]
       [b/button-list
        [b/button "Increase" increase-fn]
        [b/button "Decrease" decrease-fn]]
       [b/content
        [b/box
         [:p "Normal Progress Bar"]
         [b/prog-bar "is-primary" @progress max]]]
       [b/content
        [b/box
         [:p "Small Progress Bar"]
         [b/sm-prog-bar "is-info" @progress max]]]
       [b/content
        [b/box
         [:p "Medium Progress Bar"]
         [b/md-prog-bar "is-warning" @progress max]]]
       [b/content
        [b/box
         [:p "Large Progress Bar"]
         [b/lg-prog-bar "is-danger" @progress max]]]
       [b/content
        [b/box
         [:p "Indeterminate Progress Bar"]
         [b/prog-bar "is-primary" nil 10]]]])))