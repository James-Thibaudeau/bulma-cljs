(ns bulma-cljs.form.checkbox)

(defn checkbox [text]
  [:label.checkbox
   [:input {:type "checkbox"}]
   [:span text]])