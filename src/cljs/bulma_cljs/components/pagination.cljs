(ns bulma-cljs.components.pagination
  (:require [reagent.core :as r]
            [goog.string :as gstring]))

;; updated pagination, still not %100, but a lot better

(defn pages-fn! [total-pages current-page]
  (cond
    (<= total-pages 10)
    {:start-page 1 :end-page total-pages}
    (< current-page 6)
    {:start-page 1 :end-page 10}
    (> (+ 4 current-page)
       total-pages)
    {:start-page (- total-pages 9) :end-page total-pages}
    :else
    {:start-page (- current-page 5) :end-page (+ current-page 4)}))


(defn pagination [{:keys [initial-page total-pages on-change-page]}]
  (let [current-page (r/atom initial-page)
        page-fn! (fn [page]
                   (on-change-page
                     (reset! current-page page)))
        #_#_first! (fn [] (page-fn! 1))
        #_#_last! (fn [] (page-fn! total-pages))
        next-fn! (fn []
                   (on-change-page
                     (swap! current-page inc)))
        prev-fn! (fn []
                   (on-change-page
                     (swap! current-page dec)))]
    (fn [{:keys [initial-page total-pages on-change-page]}]
      (let [{:keys [start-page end-page]} (pages-fn! total-pages @current-page)
            start-page? (= @current-page start-page)
            end-page? (= @current-page end-page)]
        [:nav.pagination
         #_[:button.pagination-previous
          {:disabled start-page?
           :on-click first!}
          "First"]
         [:button.pagination-previous
          {:disabled start-page?
           :on-click prev-fn!}
          "Previous"]
         [:button.pagination-next
          {:disabled end-page?
           :on-click next-fn!}
          "Next"]
         #_[:button.pagination-next
          {:disabled end-page?
           :on-click last!}
          "Last"]
         [:ul.pagination-list
          (when (> @current-page 6)
            [:li [:span.pagination-ellipsis (gstring/unescapeEntities "&hellip;")]])
          (map (fn [page]
                 ^{:key (str "p-" page)}
                 [:li
                  [:button.pagination-link
                   {:class    [(when (= page @current-page) "is-current")]
                    :on-click #(when (not= page @current-page)
                                  (page-fn! page))}
                   page]])
               (range start-page (inc end-page)))
          (when (< @current-page
                   (- total-pages 4))
            [:li [:span.pagination-ellipsis (gstring/unescapeEntities "&hellip;")]])]]))))