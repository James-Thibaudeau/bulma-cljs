(ns bulma-cljs-lib.form.file)

;; basic file, will expand to be more customizable
(defn file [name text]
  [:div.file
   [:label.file-label
    [:input.file-input {:type "file" :name name}]
    [:span.file-cta
     [:span.file-icon
      [:i.fas.fa-upload]]
     [:span.file-label
      text]]]])