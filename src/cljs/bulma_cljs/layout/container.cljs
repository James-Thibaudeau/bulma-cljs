(ns bulma-cljs.layout.container
  (:require [bulma-cljs.utils :refer [children]]))

(defn fluid-container [& content]
  (into [:div.container.is-fluid] content))

(defn container [& content]
  (into [:div.container] content))