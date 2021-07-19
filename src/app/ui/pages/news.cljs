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
     (d/div {:class "bg-black text-white h-full text-center"}
            (d/h1 {:class "font-bold pt-20 pb-5 text-2xl"} "Development blog is coming soon")
            (d/div {:class "m-auto justify-center dot-flashing"}))))

(def News (with-keechma NewsRenderer))