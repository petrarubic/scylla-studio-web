(ns app.ui.main
  (:require [keechma.next.helix.core :refer [with-keechma use-sub]]
            [keechma.next.helix.lib :refer [defnc]]
            [helix.core :as hx :refer [$]]
            [helix.dom :as d]
            [helix.hooks :as hooks]
            [oops.core :refer [ocall]]
            [app.ui.pages.home :refer [Home]]
            [app.ui.pages.news :refer [News]]
            [app.ui.pages.team :refer [Team]]
            [app.ui.pages.media :refer [Media]]
            [app.ui.pages.faq :refer [FAQ]]))

(defnc MainRenderer [props]
  (let [{:keys [page] :as router} (use-sub props :router)]
    (hooks/use-effect [(pr-str router)]
                      (ocall js/window :scrollTo 0 0))
    (case page
      "home"  ($ Home)
      "news"  ($ News)
      "team"  ($ Team)
      "media" ($ Media)
      "faq"   ($ FAQ)
      (d/div "404"))))

(def Main (with-keechma MainRenderer))