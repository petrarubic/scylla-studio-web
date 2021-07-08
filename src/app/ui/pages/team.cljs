(ns app.ui.pages.team
  (:require [helix.dom :as d]
            [helix.core :as hx :refer [$]]
            [keechma.next.helix.core :refer [with-keechma]]
            [keechma.next.helix.lib :refer [defnc]]
            [keechma.next.helix.classified :refer [defclassified]]
            [app.ui.components.navbar :refer [Navbar]]))

(defclassified TeamWrapper :div "h-screen w-screen font-montserrat bg-black")
(defclassified TeamTitle :h1 "uppercase font-light text-center text-3xl")

(defnc TeamRenderer [_]
  ($ TeamWrapper
     ($ Navbar)
     (d/div {:class "text-white my-20"}
            (d/div {:class "px-40 bg-black"}
                   ($ TeamTitle "Meet the Team")
                   (d/div {:class "grid grid-cols-2 gap-28 my-20"}
                          (d/div {:class "bg-white shadow-lg rounded-lg relative"}
                                 (d/div {:class "bg-gradient-to-t from-blue-800 z-10 absolute w-full h-full rounded-lg"})
                                 (d/img {:src "https://via.placeholder.com/400x400.png?text=Placeholder+image" :class "w-full rounded-lg block"}))
                          (d/div {:class "bg-white shadow-lg rounded-lg relative"}
                                 (d/div {:class "bg-gradient-to-t from-blue-800 z-10 absolute w-full h-full rounded-lg"})
                                 (d/img {:src "https://via.placeholder.com/400x400.png?text=Placeholder+image" :class "w-full rounded-lg block"}))
                          (d/div {:class "bg-white shadow-lg rounded-lg relative"}
                                 (d/div {:class "bg-gradient-to-t from-blue-800 z-10 absolute w-full h-full rounded-lg"})
                                 (d/img {:src "https://via.placeholder.com/400x400.png?text=Placeholder+image" :class "w-full rounded-lg block"}))
                          (d/div {:class "bg-white shadow-lg rounded-lg relative"}
                                 (d/div {:class "bg-gradient-to-t from-blue-800 z-10 absolute w-full h-full rounded-lg"})
                                 (d/img {:src "https://via.placeholder.com/400x400.png?text=Placeholder+image" :class "w-full rounded-lg block"})))))))

(def Team (with-keechma TeamRenderer))