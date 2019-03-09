(ns bulma-cljs-lib.components.pagination)

(defn pagination [current pages]
  [:nav.pagination
   [:a.pagination-previous "Previous"]
   [:a.pagination-next "Next"]
   [:ul.pagination-list
    (map (fn [number]
           ^{:key (str "p" number)}
           [:li
            [:a.pagination-link 
             {:class [(when (= number current) "is-current")]} 
             number]])
         (range 1 pages))]])