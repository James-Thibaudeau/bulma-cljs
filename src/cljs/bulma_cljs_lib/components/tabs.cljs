(ns bulma-cljs-lib.components.tabs)

(defn tabs [content & [{:keys [alignment size]}]]
  [:div.tabs {:class [alignment size]}
   [:ul
    content]])