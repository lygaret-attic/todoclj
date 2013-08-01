(ns config
  (:use environ.core))

(def datasource {:classname   "com.mysql.jdbc.Driver"
                 :url         (env :database-url)
                 :user        (env :database-user)
                 :password    (env :database-password)
                 :delimiters  "`"})