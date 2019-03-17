(ns bulma-cljs.subs
  (:require
   [re-frame.core :as re-frame]))

(re-frame/reg-sub
 ::current-page
 (fn [db]
   (:current-page db)))
