(ns bulma-cljs.docs.sub-views.components.pagination
  (:require [bulma-cljs-lib.core :as b]))

(defn main []
  [b/section
   [b/subtitle "Pagination"]
   [b/content "This is an example of the pagination component"]
   [b/pagination {:initial-page 1
                  :total-pages 15
                  :on-change-page identity}]])