(ns bulma-cljs-lib.layout.media-object)

(defn media-object [& content]
  (into [:article.media] content))

(defn media-left [& content]
  (into [:figure.media-left] content))

(defn media-right [& content]
  (into [:div.media-right] content))