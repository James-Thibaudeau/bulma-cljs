(ns bulma-cljs.form.text-area)

(defn text-area [props]
  [:div.field
   [:div.control
    [:textarea.textarea props]]])