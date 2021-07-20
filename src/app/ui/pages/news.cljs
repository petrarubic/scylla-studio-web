(ns app.ui.pages.news
  (:require [helix.dom :as d]
            [helix.core :as hx :refer [$]]
            [keechma.next.helix.core :refer [with-keechma]]
            [keechma.next.helix.lib :refer [defnc]]
            [keechma.next.helix.classified :refer [defclassified]]
            [app.ui.components.navbar :refer [Navbar]]))

(defclassified NewsWrapper :div "h-screen w-screen font-montserrat cursor-default")
(defclassified NewsTitle :h1 "font-bold pt-20 pb-5 text-2xl")
(defclassified NewsAnimatedDots :div "m-auto justify-center dot-flashing-blue")

(defnc NewsRenderer [_]
  ($ NewsWrapper
     ($ Navbar)
     (d/div {:class "bg-black text-white h-full text-center"}
            ($ NewsTitle "Development blog is coming soon")
            ($ NewsAnimatedDots))))

(def News (with-keechma NewsRenderer))