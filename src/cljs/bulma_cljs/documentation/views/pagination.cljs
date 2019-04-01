(ns bulma-cljs.documentation.views.pagination
  (:require [bulma-cljs-lib.core :as b]))

(defn pagination []
  [b/section
   [b/subtitle "Pagination"]
   [b/content "This is an example of the pagination component"]
   [b/pagination {:initial-page 1
                  :total-pages 15
                  :on-change-page identity}]])