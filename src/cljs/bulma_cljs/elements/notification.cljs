(ns bulma-cljs.elements.notification
  (:require [bulma-cljs.elements.button :as b]))

(defn notification [content delete-fn & [{:keys [class]}]]
  [:div.notification
   {:class class}
   [b/delete-button delete-fn]
   content])