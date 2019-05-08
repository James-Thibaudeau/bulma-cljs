(defproject bulma-cljs "0.1.2"
  :description "A Reagent component library using Bulma"
  :url "https://github.com/James-Thibaudeau/bulma-cljs"
  :license {:name "MIT"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/clojurescript "1.10.238"]
                 [org.clojure/core.async "0.4.474"]
                 [reagent "0.8.1"]]

  :repl-options {:init-ns dev.user
                 :nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}

  :plugins [[lein-cljsbuild "1.1.7"]]

  :min-lein-version "2.5.3"

  :source-paths ["src/clj" "src/cljs"]

  :clean-targets ^{:protect false} ["resources/public/js/compiled" "target"]

  :figwheel {:css-dirs ["resources/public/css"]}

  :profiles
  {:dev
   {:dependencies [[binaryage/devtools "0.9.10"]
                   [com.cemerick/piggieback "0.2.1"]
                   [figwheel-sidecar "0.5.16"]]
    :plugins      [[lein-figwheel "0.5.16"]]}
   :prod {}}

  :cljsbuild
  {:builds
   [{:id           "dev"
     :source-paths ["src/cljs"]
     :figwheel     {:on-jsload "bulma-cljs.core/mount-root"}
     :compiler     {:main                 bulma-cljs.core
                    :output-to            "resources/public/js/compiled/app.js"
                    :output-dir           "resources/public/js/compiled/out"
                    :asset-path           "js/compiled/out"
                    :source-map-timestamp true
                    :preloads             [devtools.preload]
                    :external-config      {:devtools/config {:features-to-install :all}}}}

    {:id           "prod"
     :source-paths ["src/cljs/bulma-cljs-lib"]
     :compiler     {:main            bulma-cljs-lib.core
                    :output-to       "resources/public/js/compiled/app.js"
                    :optimizations   :advanced
                    :closure-defines {goog.DEBUG false}
                    :pretty-print    false}}]})
