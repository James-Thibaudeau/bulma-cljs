(ns bulma-cljs.views
  (:require
   [re-frame.core :as re-frame]
   [bulma-cljs.elements.box :refer [box]]
   [bulma-cljs.elements.button :as b]
   [bulma-cljs.elements.title :as t]
   [bulma-cljs.elements.content :as c]
   [bulma-cljs.elements.icon :as i]
   [bulma-cljs.elements.notification :as n]
   [bulma-cljs.elements.progress-bars :as pb]
   [bulma-cljs.elements.tag :as tag]
   [bulma-cljs.subs :as subs]
   [bulma-cljs.layout.hero :refer [hero]]
   [bulma-cljs.layout.footer :refer [footer]]))

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div
     [t/title "Title"]
     [t/subtitle "Subtitle"]
     [box [:p "hello world"]]
     [b/button "Click" identity]
     [b/delete-button identity]
     [n/notification "Notifying you of something interesting" identity]
     [i/sm-icon "fas fa-home"]
     [i/icon "fas fa-lg fa-home"]
     [i/md-icon "fas fa-2x fa-home"]
     [i/lg-icon "fas fa-3x fa-home"]
     [pb/sm-prog-bar "is-primary" 10 100]
     [pb/prog-bar nil 15 100]
     [pb/md-prog-bar "is-info" 25 100]
     [pb/lg-prog-bar "is-danger" 95 100]
     [tag/tag "Tag"]
     [tag/delete-tag "Jerry" identity]
     [tag/tag-list
      [tag/tag "Tag"]
      [tag/tag "You're it!"]]
     [c/content "This is content"]
     [c/sm-content "Small content"]
     [c/md-content [:ul
                    [:li "medium"]
                    [:li "content"]]]
     [c/lg-content [:ol
                    [:li "large"]
                    [:li "content"]]]
     [footer [:p "Footer. All rights reserved."]]]))
