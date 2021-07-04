(ns the-chord-changer.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults api-defaults]]
            [ring.middleware.json :as json]
            [the-chord-changer.services.progression-generator :refer [generate-progression]]
            [the-chord-changer.views.view :as view]))

(defroutes app-routes
           (GET "/" [] view/home-page)
           (POST "/generate" [qty scale]
               (if (= "random" scale)
                 (view/progression-page (generate-progression (Integer. qty)))
                 (view/progression-page (generate-progression (Integer. qty) (keyword scale)))))
           (route/not-found "Not Found"))

(def app
  (-> (wrap-defaults app-routes api-defaults)
      (json/wrap-json-params)
      (json/wrap-json-response)))
