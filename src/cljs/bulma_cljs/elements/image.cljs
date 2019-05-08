(ns bulma-cljs.elements.image)

;; Image Ratios

;; is-16x16	
;; is-24x24	
;; is-32x32	
;; is-48x48	
;; is-64x64	
;; is-96x96	
;; is-128x128
;; is-square
;; is-1by1	
; is-5by4
; is-4by3
; is-3by2
; is-5by3
; is-16by9
; is-2by1
; is-3by1
; is-4by5
; is-3by4
; is-2by3
; is-3by5
; is-9by16
; is-1by2
; is-1by3

(defn image [src ratio]
  [:figure.image {:class ratio}
   [:img {:src src}]])

(defn round-image [src ratio]
  [:figure.image {:class ratio}
   [:img.is-rounded {:src src}]])