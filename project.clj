(defproject hello-ston "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "1.1.6"]]
  :plugins [[org.clojars.cdpjenkins/lein-ring "0.8.11-SNAPSHOT"]]
  :ring {:handler hello-ston.handler/app
         :uberwar-name "my-war-me-do.war" 
         :servlet-version "2.5"}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}}
  :uberjar-name "uberjar-ston.jar"
  :servlet-version "3.1"
)
