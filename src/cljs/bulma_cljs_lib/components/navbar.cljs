(ns bulma-cljs-lib.components.navbar)

;; going with this map-indexed to map children 
;; for now might be able to do better

(defn children [elements]
  (map-indexed
   #(with-meta %2  {:key %1})
   elements))

(defn navbar [& content]
  [:nav.navbar
   (children content)])

(defn navbar-brand [logo-src & content]
  [:div.navbar-brand
   [:a.navbar-item
    [:img {:src logo-src}]]
   (children content)])

(defn navbar-burger []
  [:a.navbar-burger
   [:span]
   [:span]
   [:span]])

(defn navbar-item [content]
  [:div.navbar-item
   [:a content]])

(defn navbar-menu [& content]
  [:div.navbar-menu
   (children content)])

(defn navbar-start [& content]
  [:div.navbar-start
   (children content)])

(defn navbar-end [& content]
  [:div.navbar-end
   (children content)])

(defn navbar-dropdown [title & content]
  [:div.navbar-item.has-dropdown
   [:a.navbar-link title]
   [:div.navbar-dropdown
    (children content)]])

(defn navbar-divider []
  [:hr.navbar-divider])