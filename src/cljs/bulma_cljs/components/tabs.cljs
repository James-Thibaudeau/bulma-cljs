(ns bulma-cljs.components.tabs)

(defn tabs [content & [{:keys [alignment size]}]]
  [:div.tabs {:class [alignment size]}
   [:ul
    content]])