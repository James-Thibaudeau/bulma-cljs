(ns bulma-cljs-lib.elements.notification
  (:require [bulma-cljs-lib.elements.button :as b]))

(defn notification [content delete-fn]
  [:div.notification
   [b/delete-button delete-fn]
   content])