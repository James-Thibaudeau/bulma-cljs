(ns bulma-cljs.elements.icon)

(defn- icon-base [size icon-class]
  [:span.icon (when size {:class size})
   [:i {:class icon-class}]])

(defn sm-icon [icon-class]
  [icon-base "is-small" icon-class])

(defn icon [icon-class]
  [icon-base nil icon-class])

(defn md-icon [icon-class]
  [icon-base "is-medium" icon-class])

(defn lg-icon [icon-class]
  [icon-base "is-large" icon-class])