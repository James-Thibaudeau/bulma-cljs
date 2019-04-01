(ns bulma-cljs-lib.layout.container
  (:require [bulma-cljs-lib.utils :refer [children]]))

(defn fluid-container [& content]
  (into [:div.container.is-fluid] content))

(defn container [& content]
  (into [:div.container] content))