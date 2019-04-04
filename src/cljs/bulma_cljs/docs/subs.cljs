(ns bulma-cljs.docs.subs
  (:require [re-frame.core :as re-frame]))

(re-frame/reg-sub
  ::current-page
  (fn [db]
    (-> db :documentation :current-page)))