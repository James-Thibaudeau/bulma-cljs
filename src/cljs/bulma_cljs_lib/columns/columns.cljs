(ns bulma-cljs-lib.columns.columns)

;; sizes
;is-three-quarters
;is-two-thirds
;is-half
;is-one-third
;is-one-quarter
;is-full
;The other columns will fill up the remaining space automatically.
;
;Since
;0.6.1
;You can now use the following multiples of 20% as well:
;
;is-four-fifths
;is-three-fifths
;is-two-fifths
;is-one-fifth

(defn columns [props & content]
  (into [:div.columns props] content))

(defn column [props & content]
  (into [:div.column props] content))