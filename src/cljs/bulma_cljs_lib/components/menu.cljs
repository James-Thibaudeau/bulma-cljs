(ns bulma-cljs-lib.components.menu)

;; sub-menu - example props
;; {:label "docs"
;;  :items [{:item "Layout"
;;           :on-click (fn [])}
;;          {:item "Columns"
;;           :on-click (fn [])}]

(defn sub-menu [{:keys [label items]}]
  [:<>
   [:p.menu-label label]
   (into
    [:ul.menu-list]
    (map (fn [{:keys [item on-click]}]
           ^{:key (str label item)}
           [:li
            [:a
             {:on-click on-click}
             item]])
         items))])

(defn menu [& content]
  (into [:aside.menu] content))