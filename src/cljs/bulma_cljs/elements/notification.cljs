(ns bulma-cljs.elements.notification
  (:require [bulma-cljs.elements.button :as b]))

(defn notification [content delete-fn]
  [:div.notification
   [b/delete-button delete-fn]
   content])