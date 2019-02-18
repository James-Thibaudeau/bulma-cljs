(ns bulma-cljs-lib.elements.title)

(defn title [text & [{:keys [as]
                      :or {as :h1}}]]
  [as {:class ["title"]} text])

(defn subtitle [text & [{:keys [as]
                         :or {as :h2}}]]
  [as {:class ["subtitle"]} text])