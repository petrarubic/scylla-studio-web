(ns app.ui.pages.team
  (:require [helix.dom :as d]
            [helix.core :as hx :refer [$]]
            [keechma.next.helix.core :refer [with-keechma]]
            [keechma.next.helix.lib :refer [defnc]]
            [keechma.next.helix.classified :refer [defclassified]]
            [app.ui.components.navbar :refer [Navbar]]))

(defclassified TeamWrapper :div "h-screen w-screen font-montserrat")

(defnc TeamRenderer [_]
  ($ TeamWrapper
     ($ Navbar)
     "Team"))

(def Team (with-keechma TeamRenderer))