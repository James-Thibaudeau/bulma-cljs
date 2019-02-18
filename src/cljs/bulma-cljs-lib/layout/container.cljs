(ns bulma-cljs-lib.layout.container)

(defn container [content & [{:keys [is-fluid?]}]]
   [:div.container {:class [(when is-fluid? "is-fluid")]} content])