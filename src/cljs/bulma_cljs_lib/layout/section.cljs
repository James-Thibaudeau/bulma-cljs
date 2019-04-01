(ns bulma-cljs-lib.layout.section)

(defn section [& content]
  (into [:section.section] content))

(defn md-section [content]
  (into [:section.section.is-medium] content))

(defn lg-section [content]
  (into [:section.section.is-large] content))