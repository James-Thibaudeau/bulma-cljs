(ns bulma-cljs-lib.form.input)

(defn input [props]
  [:div.field
   [:div.control
    [:input.input props]]])