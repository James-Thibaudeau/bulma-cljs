(ns bulma-cljs-lib.layout.footer)

(defn footer [& content]
  [:footer.footer
   (into [:div.content.has-text-centered] content)])