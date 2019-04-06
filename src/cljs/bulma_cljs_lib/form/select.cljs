(ns bulma-cljs-lib.form.select)

(defn option [value text]
  [:option {:value value} text])

;; making options a vector of option maps for now
(defn select [options]
  [:div.select
   (into [:select]
         (map (fn [{:keys [value text]}]
                ^{:key text}
                [option value text])
              options))])