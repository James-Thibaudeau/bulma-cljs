(ns bulma-cljs-lib.components.navbar)

(defn navbar [content]
  [:nav.navbar content])

(defn navbar-brand [content]
  [:div.navbar-brand content])

(defn navbar-burger []
  [:a.navbar-burger
   [:span]
   [:span]
   [:span]])

(defn navbar-item [content]
  [:div.navbar-item content])

(defn navbar-menu [content]
  [:div.navbar-menu content])

(defn navbar-start [content]
  [:div.navbar-start content])

(defn navbar-end [content]
  [:div.navbar-end content])

(defn navbar-dropdown [title content]
  [:div.navbar-item.has-dropdown
   [:a.navbar-link title]
   [:div.navbar-dropdown
    content]])

(defn navbar-divider []
  [:hr.navbar-divider])