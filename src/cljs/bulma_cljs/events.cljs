(ns bulma-cljs.events
  (:require
   [re-frame.core :as re-frame]
   [bulma-cljs.db :as db]))

(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))

(defn change-page [db [_ page-key]]
  (assoc db :current-page page-key))

(re-frame/reg-event-db ::change-page change-page)
