(ns bulma-cljs-lib.layout.level)

(defn level [& content]
  (into [:div.level] content))

(defn level-left [& content]
  (into [:div.level-left] content))

(defn level-right [& content]
  (into [:div.level-right] content))

(defn level-itm [& content]
  (into [:div.level-item] content))

(defn mobile-level [& content]
  (into [:div.level.is-mobile] content))