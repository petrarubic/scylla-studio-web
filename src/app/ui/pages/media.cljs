(ns app.ui.pages.media
  (:require [helix.dom :as d]
            [helix.core :as hx :refer [$]]
            [keechma.next.helix.core :refer [with-keechma]]
            [keechma.next.helix.lib :refer [defnc]]
            [keechma.next.helix.classified :refer [defclassified]]
            [app.ui.components.navbar :refer [Navbar]]))

(defclassified MediaWrapper :div "h-screen w-screen font-montserrat cursor-default")
(defclassified MediaTitle :h1 "font-bold pt-20 pb-5 mx-5 md:mx-0 text-2xl")
(defclassified MediaAnimatedDots :div "m-auto justify-center dot-flashing-red")

(defnc MediaRenderer [_]
  ($ MediaWrapper
     ($ Navbar)
     (d/div {:class "bg-black text-white h-full text-center"}
            ($ MediaTitle "ReMind media is coming soon")
            ($ MediaAnimatedDots))))

(def Media (with-keechma MediaRenderer))