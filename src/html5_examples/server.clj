(ns html5-examples.server
  (:require [noir.server :as server])
  (:gen-class {:main true}))

(server/load-views-ns 'html5-examples.views)

(defn -main [& m]
  (let [mode (keyword (or (first m) :dev))
        port (Integer. (get (System/getenv) "PORT" "8080"))]
    (server/start port {:mode mode
                        :ns 'html5-examples})))

