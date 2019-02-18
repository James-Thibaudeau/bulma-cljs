(ns bulma-cljs-lib.layout.media-object)

(defn media-object [content]
  [:article.media content])

(defn media-left [content]
  [:figure.media-left content])

(defn media-right [content]
  [:div.media-right content])