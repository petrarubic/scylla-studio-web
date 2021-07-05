(ns app.ui.components.navbar
  (:require [helix.dom :as d]
            [helix.core :as hx :refer [<> $]]
            [helix.hooks :as hooks]
            [keechma.next.controllers.router :as router]
            [keechma.next.helix.core :refer
             [with-keechma dispatch call use-sub]]
            [keechma.next.helix.lib :refer [defnc]]))

(defnc NavbarLink [props]
  (d/a {:class "navbar-link px-5 py-2 font-bold"
        :href (:url props)}
       (:text props)))

(defnc NavbarRenderer [props]
    (d/nav {:class "hidden lg:block bg-black text-white border-b-2 border-white border-opacity-10"}
           (d/div {:class "max-w-7xl mx-auto px-2 md:px-6 lg:px-8"}
                  (d/div {:class "relative flex items-center justify-between h-16 z-10"}
                         (d/div {:class "flex-1 flex justify-between"}
                                (d/div {:class "flex-shrink-0 flex"}
                                       (d/p {:class "float-left text-2xl mt-1 font-bold ml-5 lg:ml-0"} "Scylla Studio"))
                                (d/div
                                       (d/div {:class "flex space-x-4"}
                                              ($ NavbarLink {:url (router/get-url props :router {:page "home"}) :text "ReMind"})
                                              ($ NavbarLink {:url (router/get-url props :router {:page "news"}) :text "News"})
                                              ($ NavbarLink {:url (router/get-url props :router {:page "team"}) :text "Team"}))))))))

(def Navbar (with-keechma NavbarRenderer))