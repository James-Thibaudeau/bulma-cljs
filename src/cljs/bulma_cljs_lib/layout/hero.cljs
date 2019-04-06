(ns bulma-cljs-lib.layout.hero)

(defn hero [& content]
  (into [:section.hero] content))

(defn hero-body [& content]
  (into [:div.hero-body] content))

(defn hero-head [& content]
  (into [:div.hero-head] content))

(defn hero-foot [& content]
  (into [:div.hero-foot] content))