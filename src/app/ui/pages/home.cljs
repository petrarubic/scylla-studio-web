(ns app.ui.pages.home
  (:require [helix.dom :as d]
            [helix.core :as hx :refer [$]]
            [keechma.next.helix.core :refer [with-keechma]]
            [keechma.next.helix.lib :refer [defnc]]
            [keechma.next.controllers.router :as router]
            [keechma.next.helix.classified :refer [defclassified]]
            [app.ui.components.navbar :refer [Navbar]]))

(defclassified HomeWrapper :div "h-screen w-screen font-montserrat cursor-default")
(defclassified HomeTitle :h1 "uppercase font-light text-center text-3xl")
(defclassified HomeLink :a "hover:font-bold hover:text-black w-full cursor-pointer md:w-1/2 py-2 rounded-md text-center bg-gradient-to-r from-red-700 to-red-900")

(defnc HomeRenderer [_]
  ($ HomeWrapper
     ($ Navbar)
     (d/div {:class "bg-fixed bg-black text-white"}
            (d/video {:autoPlay "autoplay"
                      :class "m-auto h-full w-full items-center justify-center"
                      :style {:object-fit "cover"}
                      :playsInline true
                      :muted true
                      :type "video/mp4"
                      :src "../videos/remind-animation.mp4"})
            (d/div {:class "my-48"}
                   ($ HomeTitle "Currently in development"))
            (d/div {:class "mx-80"}
                   (d/div {:class "text-left"}
                          (d/h5 {:class "text-2xl font-bold leading-relaxed"}
                                "ReMind is a sci-fi puzzle adventure 3D video game that focuses on social and 
                                 ethical problems of neurotechnology that could escalate in the future.")
                          (d/div {:class "flex flex-wrap mt-8 leading-relaxed text-base"}
                                 (d/div {:class "my-1 px-1 w-full md:w-1/2"}
                                        (d/p "The story is set in 2050 when the neuroscientist Emma transfers her consciousness to the paralysed patient 
                                              using Neuropatch, a technology she invented, in order to investigate his mental disorders.")
                                        (d/p {:class "mt-4"} "However, she gets trapped in the patient's subconsciousness, 
                                              forcing her to search for the physical source of consciousness, which is a question still unanswered by science."))
                                 (d/div {:class "my-1 px-1 w-full md:w-1/2"}
                                        (d/p "You play as Emma, moving around the patient's brain where every level corresponds to one part of the brain 
                                              that needs to be fixed. While inside the brain, a robot named Yµ follows your progress and guides you across multiple puzzles
                                              and riddles every level contains."))))
                   (d/div {:class "flex flex-row justify-center space-x-4 mt-4"}
                          ($ HomeLink "Media")
                          ($ HomeLink "ReMind FAQ")))
            (d/div {:class "py-10 mx-80"}
                   (d/div {:class "flex flex-col place-items-center m-auto"}
                          (d/a {:href (router/get-url _ :router {:page "team"}) :class "pb-10 transform transition ease-in-out duration-500 hover:scale-125"}
                               (d/img {:src "../images/scylla-logo.jpeg" :class "w-64 h-64"}))
                          (d/p {:class "font-bold mt-10 text-center text-xs"} "Made with:"
                               (d/a {:href "https://github.com/keechma" :target "_blank"}
                                    (d/img {:src "../images/keechma-logo.png" :class "w-32 h-5"}))))))))

(def Home (with-keechma HomeRenderer))