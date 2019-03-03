(ns bulma-cljs-lib.form.radio)

(defn radio [name text]
  [:div.control
   [:label.radio
    [:input {:type "radio" :name name}]
    text]])