(ns bulma-cljs.docs.sub-views.components.message
  (:require [bulma-cljs-lib.core :as b]))

(defn main []
  [b/section
   [b/subtitle "Message"]
   [b/content "This is an example of the Message component"]
   [b/message
    [b/message-header "Message"]
    [b/message-body [:p "This is the body of the message"]]]
   [b/message {:class [:is-primary]}
    [b/message-body "This Message has no header!"]]])
