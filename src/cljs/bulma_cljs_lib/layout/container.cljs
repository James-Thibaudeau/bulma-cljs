(ns bulma-cljs-lib.layout.container
  (:require [bulma-cljs-lib.utils :refer [children]]))

(defn fluid-container [& content]
  [:div.container.is-fluid
   (children content)])

(defn container [& content]
   [:div.container  
    (children content)])