(ns bulma-cljs.elements.progress-bars)

(defn- base-prog-bar [size color value max]
  [:progress.progress {:class [size color] 
                       :value value 
                       :max max} 
   value])

(defn sm-prog-bar [color value max]
  [base-prog-bar "is-small" color value max])

(defn prog-bar [color value max]
  [base-prog-bar nil color value max])

(defn md-prog-bar [color value max]
  [base-prog-bar "is-medium" color value max])

(defn lg-prog-bar [color value max]
  [base-prog-bar "is-large" color value max])