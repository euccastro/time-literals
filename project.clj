(defproject jsr310-tagged-literals "0.1.3"
  :description "Clojure(Script) tagged literals for jsr-310 entities"
  :url "https://github.com/henryw374/jsr310-tagged-literals"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[cljs.java-time "0.1.2"]]
  :profiles {:dev
            {:source-paths ["dev"]
             :dependencies [[org.clojure/clojure "1.9.0"]
                            [org.clojure/clojurescript "1.10.238"]
                            [cljsjs/js-joda-timezone "1.3.0-0"]]
             :plugins [[lein-doo "0.1.10"]]}})
