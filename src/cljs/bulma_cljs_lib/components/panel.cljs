(ns bulma-cljs-lib.components.panel)

(defn panel [content]
  [:nav.panel content])

(defn panel-heading [content]
  [:h3.panel-heading content])

(defn panel-tabs [content]
  [:p.panel-tabs
   content])