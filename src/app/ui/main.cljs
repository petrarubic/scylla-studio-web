(ns app.ui.main
  (:require [keechma.next.helix.core :refer [with-keechma use-sub]]
            [keechma.next.helix.lib :refer [defnc]]
            [helix.core :as hx :refer [$]]
            [helix.dom :as d]
            [helix.hooks :as hooks]
            [oops.core :refer [ocall]]
            [app.ui.pages.home :refer [Home]]
            [app.ui.pages.news :refer [News]]
            [app.ui.pages.team :refer [Team]]))

(defnc MainRenderer [props]
  (let [{:keys [page] :as router} (use-sub props :router)]
    (hooks/use-effect [(pr-str router)]
                      (ocall js/window :scrollTo 0 0))
    (case page
      "home" ($ Home)
      "news" ($ News)
      "team" ($ Team)
      (d/div "404"))))

(def Main (with-keechma MainRenderer))