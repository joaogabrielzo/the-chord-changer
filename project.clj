(defproject the-chord-changer "0.1.0-SNAPSHOT"
  :description "App that creates random chord progressions"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [compojure "1.6.1"]
                 [ring/ring-core "1.9.3"]
                 [ring/ring-json "0.5.1"]
                 [ring/ring-defaults "0.3.2"]
                 [hiccup "1.0.5"]]
  :plugins [[lein-ring "0.12.5"]]
  :ring {:handler the-chord-changer.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.2"]]}})