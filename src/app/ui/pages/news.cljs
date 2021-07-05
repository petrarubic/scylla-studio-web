(ns app.ui.pages.news
  (:require [helix.dom :as d]
            [helix.core :as hx :refer [$]]
            [keechma.next.helix.core :refer [with-keechma]]
            [keechma.next.helix.lib :refer [defnc]]
            [keechma.next.helix.classified :refer [defclassified]]
            [app.ui.components.navbar :refer [Navbar]]))

(defclassified NewsWrapper :div "h-screen w-screen font-montserrat")

(defnc NewsRenderer [_]
  ($ NewsWrapper
     ($ Navbar)
     "Stay in touch: development blog is coming soon..."))

(def News (with-keechma NewsRenderer))