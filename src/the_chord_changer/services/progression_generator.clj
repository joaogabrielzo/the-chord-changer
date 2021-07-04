(ns the-chord-changer.services.progression-generator
  (:require
    [the-chord-changer.repositories.scales :as scales]
    [the-chord-changer.repositories.extensions :as ext]))


(defn get-extensions
  "Retrieve an extension to the given chord based on it's type"
  [chord-map]
  (cond
    (= (:type chord-map) "major") {:number (:number chord-map)
                                   :chord  (str (:note chord-map) (get ext/major-extensions (rand-int (count ext/major-extensions))))}
    (= (:type chord-map) "minor") {:number (:number chord-map)
                                   :chord  (str (:note chord-map) (get ext/minor-extensions (rand-int (count ext/minor-extensions))))}
    (= (:type chord-map) "diminished") {:number (:number chord-map)
                                        :chord  (str (:note chord-map) (get ext/minor-extensions (rand-int (count ext/minor-extensions))))}
    :else {:number (:number chord-map)
           :chord  (str (:note chord-map) (get ext/dominant-extensions (rand-int (count ext/dominant-extensions))))}
    ))

(defn generate-progression
  "Retrieve a vector with the given quantity of chords"
  ([qty] (generate-progression qty (get scales/scales (rand-int (count scales/scales)))))
  ([qty scale-name]
   (loop [actual 0
          scale (scale-name scales/scales-map)
          chords []]
     (if (>= actual qty)
       {:scale       scale-name
        :progression (map get-extensions chords)}
       (recur (inc actual) scale (conj chords (get scale (rand-int 6))))))))
