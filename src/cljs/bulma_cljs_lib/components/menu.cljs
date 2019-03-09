(ns bulma-cljs-lib.components.menu)

(defn sub-menu [{:keys [label items]}]
  [:<>
   [:p.menu-label label]
   (into
    [:ul.menu-list]
    (map (fn [item]
           [:li [:a item]])
         items))])

(defn menu [menus]
  (into [:aside.menu]
        (map (fn [menu-props]
               [sub-menu menu-props])
             menus)))