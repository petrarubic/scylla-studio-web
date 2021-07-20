(ns app.ui.pages.team
  (:require [helix.dom :as d]
            [helix.core :as hx :refer [$]]
            [keechma.next.helix.core :refer [with-keechma]]
            [keechma.next.helix.lib :refer [defnc]]
            [keechma.next.controllers.router :as router]
            [keechma.next.helix.classified :refer [defclassified]]
            [app.ui.components.navbar :refer [Navbar]]))

(defclassified TeamWrapper :div "h-screen w-screen font-montserrat bg-black cursor-default")
(defclassified TeamTitle :h1 "uppercase font-light text-center text-3xl")
(defclassified TeamSubtitle :h1 "uppercase font-light text-center lg:text-left text-2xl")
(defclassified TeamCoreGrid :div "grid xl:grid-cols-2 grid-cols-1 grid-rows-4 md:grid-rows-2 grid-flow-col mx-10 md:mx-20 lg:mx-0 md:grid-flow-row gap-20 mb-20 mt-10")
(defclassified TeamAssociateGrid :div "grid xl:grid-cols-3 grid-cols-1 grid-rows-3 md:grid-rows-1 grid-flow-col mx-10 md:mx-20 lg:mx-0 md:grid-flow-row gap-20 mb-20 mt-10")

(defnc TeamCoreMemberCard [{:keys [image first_name last_name position]}]
  (d/div {:class "bg-white shadow-lg rounded-lg relative"}
         (d/div {:class "bg-gradient-to-t from-blue-900 z-10 absolute w-full h-full rounded-lg"})
         (d/div {:class "w-full h-full z-20 absolute text-white"}
                (d/div {:class "bottom-5 left-5 md:bottom-10 md:left-10 absolute font-bold"}
                       (d/h1 {:class "text-xl 2xl:text-3xl"} first_name)
                       (d/h2 {:class "text-md 2xl:text-xl pb-4"} last_name)
                       (d/hr {:class "w-20 border-blue-300 border-2"})
                       (d/p {:class "text-sm 2xl:text-md text-blue-300 uppercase pt-4"} position)))
         (d/img {:src image :class "w-full rounded-lg block"})))

(defnc TeamAssociateMemberCard [{:keys [image first_name last_name position]}]
  (d/div {:class "bg-white shadow-lg rounded-lg relative"}
         (d/div {:class "bg-gradient-to-t from-blue-900 z-10 absolute w-full h-full rounded-lg"})
         (d/div {:class "w-full h-full z-20 absolute text-white"}
                (d/div {:class "bottom-5 left-5 md:bottom-10 md:left-10 xl:bottom-4 xl:left-4 absolute font-bold"}
                       (d/h1 {:class "text-xl 2xl:text-2xl"} first_name)
                       (d/h2 {:class "text-md 2xl:text-lg pb-4"} last_name)
                       (d/hr {:class "w-20 border-blue-300 border-2"})
                       (d/p {:class "text-xs 2xl:text-sm text-blue-300 uppercase pt-4"} position)))
         (d/img {:src image :class "w-full rounded-lg block"})))

(defnc TeamSocialCard [{:keys [image description link icon icon_hover]}]
  (d/div {:class "p-10 text-center justify-center m-auto border-white rounded-lg border-opacity-10 border-2 w-full md:w-1/2"}
         (d/img {:src image :class "w-30 h-20 m-auto mb-5"})
         (d/p description)
         (d/br)
         (d/a {:href link :target "_blank" :class "flex justify-center"}
              (d/img {:src icon :class "w-10 h-10 absolute transition hover:opacity-20 transition-opacity duration-700 ease-out"})
              (d/img {:src icon_hover :class "w-10 h-10"}))))

(def placeholder_image "https://via.placeholder.com/400x400.png?text=Placeholder+image")

(defnc TeamRenderer [_]
  ($ TeamWrapper
     ($ Navbar)
     (d/div {:class "text-white mt-10"}
            (d/div {:class "md:px-20 lg:px-80 bg-black pb-20"}
                   (d/div {:class "flex flex-col place-items-center"}
                          (d/a {:href (router/get-url _ :router {:page "team"})}
                               (d/img {:src "../images/scylla-logo.jpeg" :class "w-64 h-64 md:w-96 md:h-96"}))
                          (d/p {:class "mx-5 md:mx-0 text-md md:text-lg text-wrap text-center mb-40"} "Small indie studio team in Croatia working together since 2019 on puzzle adventure video games."))
                   ($ TeamTitle "Meet the Team")
                   (d/div {:class "mt-20"}
                          ($ TeamSubtitle "Core Team Members")
                          ($ TeamCoreGrid
                             ($ TeamCoreMemberCard {:image placeholder_image :first_name "Marko" :last_name "Pavliško" :position "Programmer"})
                             ($ TeamCoreMemberCard {:image placeholder_image :first_name "Matija" :last_name "Vigato" :position "Game Designer"})
                             ($ TeamCoreMemberCard {:image placeholder_image :first_name "Marko" :last_name "Dijan" :position "3D Artist"})
                             ($ TeamCoreMemberCard {:image placeholder_image :first_name "Petra" :last_name "Rubić" :position "UI Programmer"}))
                          ($ TeamSubtitle "Associate Team Members")
                          ($ TeamAssociateGrid
                             ($ TeamAssociateMemberCard {:image placeholder_image :first_name "Mehmet" :last_name "Demirci" :position "Level Designer"})
                             ($ TeamAssociateMemberCard {:image placeholder_image :first_name "Lucian" :last_name "Ludaš" :position "Programmer"})
                             ($ TeamAssociateMemberCard {:image placeholder_image :first_name "Igor" :last_name "Margan" :position "Mentor & Game Designer"})))
                   (d/div {:class "m-auto pt-20"}
                          ($ TeamTitle "Join the Community")
                          (d/div {:class "flex flex-col md:flex-row mt-14 mx-10 md:mx-0 md:space-x-10 space-y-10 md:space-y-0"}
                                 ($ TeamSocialCard {:image "../images/facebook-logo.png"
                                                    :description "Like our page on Facebook and stay in touch for latest updates on Scylla Studio and ReMind!"
                                                    :link "https://www.facebook.com/StudioScylla"
                                                    :icon "../images/like-white-outline.png"
                                                    :icon_hover "../images/like-blue-outline.png"})
                                 ($ TeamSocialCard {:image "../images/instagram-logo.png" 
                                                    :description "Follow us on Instagram and stay in touch for latest updates on Scylla Studio and ReMind!"
                                                    :link "https://www.instagram.com/scylla.studio"
                                                    :icon "../images/follow-white-outline.png"
                                                    :icon_hover "../images/follow-blue-outline.png"})))
                   (d/div {:class "pt-40 text-center"}
                          ($ TeamTitle {:class "mb-4"} "Stay Connected")
                          (d/a {:href "mailto:studioscylla@gmail.com" :class "text-lg font-semibold"} "studioscylla@gmail.com"))))))

(def Team (with-keechma TeamRenderer))