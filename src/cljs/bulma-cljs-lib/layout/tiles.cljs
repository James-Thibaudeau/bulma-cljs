(ns bulma-cljs-lib.layout.tiles)

(defn tile [content & [{:keys [size ancestor parent child]
                        :or {size nil
                             ancestor false
                             parent false
                             child false}}]]
  [:div.tile {:class [size 
                      (when ancestor "is-ancestor")
                      (when parent "is-parent")
                      (when child "is-child")]} 
   content])