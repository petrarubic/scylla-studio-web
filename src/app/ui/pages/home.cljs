(ns app.ui.pages.home
  (:require [helix.dom :as d]
            [helix.core :as hx :refer [$]]
            [keechma.next.helix.core :refer [with-keechma]]
            [keechma.next.helix.lib :refer [defnc]]
            [keechma.next.helix.classified :refer [defclassified]]
            [app.ui.components.navbar :refer [Navbar]]))

(defclassified HomepageWrapper :div "h-screen w-screen font-montserrat bg-black")

(defnc HomeRenderer [_]
  ($ HomepageWrapper
     ($ Navbar)
     (d/div {:class "items-center justify-center"}
            (d/video {:autoplay "autoplay"
                      :class "m-auto h-full w-full items-center justify-center"
                      :style {:object-fit "cover"}
                      :playsinline true
                      :muted true
                      :type "video/mp4"
                      :src "../videos/remind-animation.mp4"}))))

(def Home (with-keechma HomeRenderer))