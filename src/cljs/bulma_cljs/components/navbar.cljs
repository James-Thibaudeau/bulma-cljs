(ns bulma-cljs.components.navbar
  [:require [bulma-cljs.utils :refer [children]]])

(defn navbar [& content]
  (into [:nav.navbar] content))

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

(defn navbar-item [content & [{:keys [on-click]}]]
  [:div.navbar-item
   [:a {:on-click on-click} content]])

(defn navbar-menu [& content]
  (into [:div.navbar-menu] content))

(defn navbar-start [& content]
  (into [:div.navbar-start] content))

(defn navbar-end [& content]
  (into [:div.navbar-end] content))

(defn navbar-dropdown [title & content]
  [:div.navbar-item.has-dropdown
   [:a.navbar-link title]
   (into [:div.navbar-dropdown] content)])

(defn navbar-divider []
  [:hr.navbar-divider])