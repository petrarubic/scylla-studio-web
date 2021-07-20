(ns app.ui.pages.faq
  (:require [helix.dom :as d]
            [helix.core :as hx :refer [$]]
            [keechma.next.helix.core :refer [with-keechma]]
            [keechma.next.helix.lib :refer [defnc]]
            [keechma.next.helix.classified :refer [defclassified]]
            [app.ui.components.navbar :refer [Navbar]]))

(defclassified FAQWrapper :div "h-screen w-screen font-montserrat cursor-default")
(defclassified FAQTitle :h1 "font-bold pt-20 pb-5 text-2xl")
(defclassified FAQAnimatedDots :div "m-auto justify-center dot-flashing-red")

(defnc FAQRenderer [_]
  ($ FAQWrapper
     ($ Navbar)
     (d/div {:class "bg-black text-white h-full text-center"}
            ($ FAQTitle "ReMind FAQ is coming soon")
            ($ FAQAnimatedDots))))

(def FAQ (with-keechma FAQRenderer))