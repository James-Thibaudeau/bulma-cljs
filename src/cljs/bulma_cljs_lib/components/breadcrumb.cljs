(ns bulma-cljs-lib.components.breadcrumb)

(defn crumb [{:keys [on-click active? text]}]
  [:li {:class [(when active? "is-active")]
        :onClick on-click}
   [:a text]])

;; options is an array of prop maps for now
(defn breadcrumb [options]
  [:nav.breadcrumb
   (into
    [:ul]
    (map (fn [props]
           [crumb props])
         options))])