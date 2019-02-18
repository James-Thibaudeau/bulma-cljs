(ns bulma-cljs-lib.layout.section)

(defn section [content]
  [:section.section content])

(defn md-section [content]
  [:section.section.is-medium content])

(defn lg-section [content]
  [:section.section.is-large content])