(ns bulma-cljs.form.input)

(defn input [props]
  [:div.field
   [:div.control
    [:input.input props]]])