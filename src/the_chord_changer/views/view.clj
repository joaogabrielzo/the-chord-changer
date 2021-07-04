(ns the-chord-changer.views.view
  (:require
    [hiccup.core :refer [html]]))

(def home-page
  (html [:h1 {:style "color: #5e9ca0; text-align: center;"} "The Chord " [:span {:style "color: #2b2301;"} "Changer"]] [:p "&nbsp;"]
        [:center [:form {:action "/generate" :method "post"}
                  [:label {:for "qty"} "Chord Quantity:"] [:input#qty {:name "qty" :type "number"}]
                  [:label {:for "scale"} " Scale:"] [:select#scale {:name "scale"}
                                                     [:option {:value "random"} "Random"]
                                                     [:option {:value "Cmajor"} "C Major"]
                                                     [:option {:value "Cminor"} "C Minor"]
                                                     [:option {:value "C#minor"} "C# Minor"]
                                                     [:option {:value "Dbmajor"} "Db Major"]
                                                     [:option {:value "Dmajor"} "D Major"]
                                                     [:option {:value "Dminor"} "D Minor"]
                                                     [:option {:value "Ebmajor"} "Eb Major"]
                                                     [:option {:value "Ebminor"} "Eb Minor"]
                                                     [:option {:value "Emajor"} "E Major"]
                                                     [:option {:value "Eminor"} "E Minor"]
                                                     [:option {:value "Fmajor"} "F Major"]
                                                     [:option {:value "Fminor"} "F Minor"]
                                                     [:option {:value "F#major"} "F# Major"]
                                                     [:option {:value "F#minor"} "F# Minor"]
                                                     [:option {:value "Gmajor"} "G Major"]
                                                     [:option {:value "Gminor"} "G Minor"]
                                                     [:option {:value "G#minor"} "G# Minor"]
                                                     [:option {:value "Abmajor"} "Ab Major"]
                                                     [:option {:value "Amajor"} "A Major"]
                                                     [:option {:value "Aminor"} "A Minorr"]
                                                     [:option {:value "Bbmajor"} "Bb Major"]
                                                     [:option {:value "Bbminor"} "Bb Minor"]
                                                     [:option {:value "Bmajor"} "B Major"]
                                                     [:option {:value "Bminor"} "B Minor"]]
                  [:br]
                  [:br]
                  [:br]
                  [:br]
                  [:input {:type "submit" :value "Generate"}]]]))

(defn progression-page
  "Generates a page containing the chord progression"
  [progression-map]
  (html [:header
         [:script {:async "true" :type "text/javascript" :src "https://www.scales-chords.com/api/scales-chords-api.js"}]]
        [:h4 {:style "text-align: center;"} "Scale:"]
        [:h1 {:style "color: #5e9ca0; text-align: center;"} (:scale progression-map)]
        [:p "&nbsp;"]
        [:h4 {:style "text-align: center;"} [:strong "Progression:"]]
        [:div
        (loop [chords (:progression progression-map)
               progression []]
          (if (empty? chords)
            progression
            (recur (rest chords)
                   (let [head (first chords)]
                     (into progression
                           ["&nbsp;" [:center [:h1 {:style "color: #5e9ca0; text-align: center;"} (str (:chord head)
                                                                                             " (" (:number head) ")")
                                     (str "<br /> <ins class=\"scales_chords_api\"
                                               chord=" (:chord head) " instrument=\"piano\"></ins> <br />"
                                          "<ins class=\"scales_chords_api\" chord=" (:chord head) " instrument=\"piano\" output=\"sound\"></ins><center/>")]]])))))]))