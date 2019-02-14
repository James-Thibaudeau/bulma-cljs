(ns bulma-cljs.layout.level)

(defn level [content]
  [:div.level content])

(defn level-left [content]
  [:div.level-left content])

(defn level-right [content]
  [:div.level-right content])

(defn level-itm [content]
  [:div.level-item content])

(defn mobile-level [content]
  [:div.level.is-mobile content])