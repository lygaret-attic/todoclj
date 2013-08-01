(defproject todoclj "0.1.0-SNAPSHOT"
  :description "Tutorial Todo Application with Clojure and Clojurescript"
  :url "http://www.github.com/lygaret/todoclj"

  :source-path "src/clj"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 
                 ;; data access
                 [korma "0.3.0-RC5"]
                 [com.mchange/c3p0 "0.9.2.1"]
                 [org.clojure/java.jdbc "0.3.0-alpha4"]
                 [mysql/mysql-connector-java "5.1.25"]

                 ;; json api
                 [compojure "1.1.5"]
                 ]

  :plugins [[lein-ring "0.8.5"]
            ]

  :ring {:handler todoclj.handler/app}

  :profiles {:dev {:source-paths ["repl"]
                   :dependencies [[ring-mock "0.1.5"]
                                  [org.clojure/tools.namespace "0.2.3"]
                                  ]}})
