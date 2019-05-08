(ns bulma-cljs.form.radio)

(defn radio [name text]
  [:div.control
   [:label.radio
    [:input {:type "radio" :name name}]
    text]])