(ns bulma-cljs.documentation.events
  (:require [re-frame.core :as re-frame]))


(defn change-page [db [_ page-key]]
  (assoc-in db [:documentation :current-page] page-key))

(re-frame/reg-event-db ::change-page change-page)