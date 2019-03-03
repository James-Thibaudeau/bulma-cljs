(ns bulma-cljs-lib.form.text-area)

(defn text-area [props]
  [:div.field
   [:div.control
    [:textarea.textarea props]]])