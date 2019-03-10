(ns bulma-cljs-lib.components.navbar)


(defn navbar [& content]
  [:nav.navbar
   (map-indexed
    #(with-meta %2  {:key %1})
    content)])

(defn navbar-brand [logo-src & content]
  [:div.navbar-brand
   [:a.navbar-item
    [:img {:src logo-src}]]
   (map-indexed
    #(with-meta %2  {:key %1})
    content)])

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
   (map-indexed
    #(with-meta %2  {:key %1})
    content)])

(defn navbar-start [& content]
  [:div.navbar-start
   (map-indexed
    #(with-meta %2  {:key %1})
    content)])

(defn navbar-end [& content]
  [:div.navbar-end
   (map-indexed
    #(with-meta %2  {:key %1})
    content)])

(defn navbar-dropdown [title content]
  [:div.navbar-item.has-dropdown
   [:a.navbar-link title]
   [:div.navbar-dropdown
    content]])

(defn navbar-divider []
  [:hr.navbar-divider])