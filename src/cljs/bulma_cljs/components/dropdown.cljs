(ns bulma-cljs.components.dropdown
  (:require [reagent.core :as r]))

(defn dropdown [content & [{:keys [on-click]}]]
  (let [active? (r/atom false)
        toggle-dd #(swap! active? not)
        on-click-fn (fn [] 
                      (toggle-dd)
                      (when on-click
                        (on-click)))]
    (fn [content & [{:keys [on-click]}]]
    [:div.dropdown {:class [(when @active? "is-active")]
                    :on-click on-click-fn} content])))