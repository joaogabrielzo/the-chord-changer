(ns the-chord-changer.repositories.scales)

(def scales [:Cmajor :Cminor :C#minor :Dbmajor :Dmajor :Dminor :Ebmajor :Ebminor
             :Emajor :Eminor :Fmajor :Fminor :F#major :F#minor :Gmajor :Gminor
             :G#minor :Abmajor :Amajor :Aminor :Bbmajor :Bbminor :Bmajor :Bminor])

(def scales-map {:Cmajor  [
                           {:number "I"
                            :note   "C"
                            :type   "major"}
                           {:number "II"
                            :note   "D"
                            :type   "minor"}
                           {:number "III"
                            :note   "E"
                            :type   "minor"}
                           {:number "IV"
                            :note   "F"
                            :type   "major"}
                           {:number "V"
                            :note   "G"
                            :type   "dominant"}
                           {:number "VI"
                            :note   "A"
                            :type   "minor"}
                           {:number "VII"
                            :note   "B"
                            :type   "diminished"}
                           ]
                 :Cminor  [
                           {:number "I"
                            :note   "C"
                            :type   "minor"}
                           {:number "II"
                            :note   "D"
                            :type   "diminished"}
                           {:number "III"
                            :note   "Eb"
                            :type   "major"}
                           {:number "IV"
                            :note   "F"
                            :type   "minor"}
                           {:number "V"
                            :note   "G"
                            :type   "dominant"}
                           {:number "VI"
                            :note   "Ab"
                            :type   "major"}
                           {:number "VII"
                            :note   "Bb"
                            :type   "major"}
                           ]
                 :C#minor [
                           {:number "I"
                            :note   "C#"
                            :type   "minor"}
                           {:number "II"
                            :note   "D#"
                            :type   "diminished"}
                           {:number "III"
                            :note   "E"
                            :type   "major"}
                           {:number "IV"
                            :note   "F#"
                            :type   "minor"}
                           {:number "V"
                            :note   "G#"
                            :type   "dominant"}
                           {:number "VI"
                            :note   "A"
                            :type   "major"}
                           {:number "VII"
                            :note   "B"
                            :type   "major"}
                           ]
                 :Dbmajor [
                           {:number "I"
                            :note   "Db"
                            :type   "major"}
                           {:number "II"
                            :note   "Eb"
                            :type   "minor"}
                           {:number "III"
                            :note   "F"
                            :type   "minor"}
                           {:number "IV"
                            :note   "Gb"
                            :type   "major"}
                           {:number "V"
                            :note   "Ab"
                            :type   "dominant"}
                           {:number "VI"
                            :note   "Bb"
                            :type   "minor"}
                           {:number "VII"
                            :note   "C"
                            :type   "diminished"}
                           ]
                 :Dmajor  [
                           {:number "I"
                            :note   "D"
                            :type   "major"}
                           {:number "II"
                            :note   "E"
                            :type   "minor"}
                           {:number "III"
                            :note   "F#"
                            :type   "minor"}
                           {:number "IV"
                            :note   "G"
                            :type   "major"}
                           {:number "V"
                            :note   "A"
                            :type   "dominant"}
                           {:number "VI"
                            :note   "B"
                            :type   "minor"}
                           {:number "VII"
                            :note   "C#"
                            :type   "diminished"}
                           ]
                 :Dminor  [
                           {:number "I"
                            :note   "D"
                            :type   "minor"}
                           {:number "II"
                            :note   "E"
                            :type   "diminished"}
                           {:number "III"
                            :note   "F"
                            :type   "major"}
                           {:number "IV"
                            :note   "G"
                            :type   "minor"}
                           {:number "V"
                            :note   "A"
                            :type   "dominant"}
                           {:number "VI"
                            :note   "Bb"
                            :type   "major"}
                           {:number "VII"
                            :note   "C"
                            :type   "major"}
                           ]
                 :Ebmajor [
                           {:number "I"
                            :note   "Eb"
                            :type   "major"}
                           {:number "II"
                            :note   "F"
                            :type   "minor"}
                           {:number "III"
                            :note   "G"
                            :type   "minor"}
                           {:number "IV"
                            :note   "Ab"
                            :type   "major"}
                           {:number "V"
                            :note   "Bb"
                            :type   "dominant"}
                           {:number "VI"
                            :note   "C"
                            :type   "minor"}
                           {:number "VII"
                            :note   "D"
                            :type   "diminished"}
                           ]
                 :Ebminor [
                           {:number "I"
                            :note   "Eb"
                            :type   "minor"}
                           {:number "II"
                            :note   "F"
                            :type   "diminished"}
                           {:number "III"
                            :note   "Gb"
                            :type   "major"}
                           {:number "IV"
                            :note   "Ab"
                            :type   "minor"}
                           {:number "V"
                            :note   "Bb"
                            :type   "dominant"}
                           {:number "VI"
                            :note   "B"
                            :type   "major"}
                           {:number "VII"
                            :note   "Db"
                            :type   "major"}
                           ]
                 :Emajor  [
                           {:number "I"
                            :note   "E"
                            :type   "major"}
                           {:number "II"
                            :note   "F#"
                            :type   "minor"}
                           {:number "III"
                            :note   "G#"
                            :type   "minor"}
                           {:number "IV"
                            :note   "A"
                            :type   "major"}
                           {:number "V"
                            :note   "B"
                            :type   "dominant"}
                           {:number "VI"
                            :note   "C#"
                            :type   "minor"}
                           {:number "VII"
                            :note   "D#"
                            :type   "diminished"}
                           ]
                 :Eminor  [
                           {:number "I"
                            :note   "E"
                            :type   "minor"}
                           {:number "II"
                            :note   "F#"
                            :type   "diminished"}
                           {:number "III"
                            :note   "G"
                            :type   "major"}
                           {:number "IV"
                            :note   "A"
                            :type   "minor"}
                           {:number "V"
                            :note   "B"
                            :type   "dominant"}
                           {:number "VI"
                            :note   "C"
                            :type   "major"}
                           {:number "VII"
                            :note   "D"
                            :type   "major"}
                           ]
                 :Fmajor  [
                           {:number "I"
                            :note   "F"
                            :type   "major"}
                           {:number "II"
                            :note   "G"
                            :type   "minor"}
                           {:number "III"
                            :note   "A"
                            :type   "minor"}
                           {:number "IV"
                            :note   "Bb"
                            :type   "major"}
                           {:number "V"
                            :note   "C"
                            :type   "dominant"}
                           {:number "VI"
                            :note   "D"
                            :type   "minor"}
                           {:number "VII"
                            :note   "E"
                            :type   "diminished"}
                           ]
                 :Fminor  [
                           {:number "I"
                            :note   "F"
                            :type   "minor"}
                           {:number "II"
                            :note   "G"
                            :type   "diminished"}
                           {:number "III"
                            :note   "Ab"
                            :type   "major"}
                           {:number "IV"
                            :note   "Bb"
                            :type   "minor"}
                           {:number "V"
                            :note   "C"
                            :type   "dominant"}
                           {:number "VI"
                            :note   "Db"
                            :type   "major"}
                           {:number "VII"
                            :note   "Eb"
                            :type   "major"}
                           ]
                 :F#major [
                           {:number "I"
                            :note   "F#"
                            :type   "major"}
                           {:number "II"
                            :note   "G#"
                            :type   "minor"}
                           {:number "III"
                            :note   "A#"
                            :type   "minor"}
                           {:number "IV"
                            :note   "B"
                            :type   "major"}
                           {:number "V"
                            :note   "C#"
                            :type   "dominant"}
                           {:number "VI"
                            :note   "D#"
                            :type   "minor"}
                           {:number "VII"
                            :note   "F"
                            :type   "diminished"}
                           ]
                 :F#minor [
                           {:number "I"
                            :note   "F#"
                            :type   "minor"}
                           {:number "II"
                            :note   "G#"
                            :type   "diminished"}
                           {:number "III"
                            :note   "A"
                            :type   "major"}
                           {:number "IV"
                            :note   "B"
                            :type   "minor"}
                           {:number "V"
                            :note   "C#"
                            :type   "dominant"}
                           {:number "VI"
                            :note   "D"
                            :type   "major"}
                           {:number "VII"
                            :note   "E"
                            :type   "major"}
                           ]
                 :Gmajor  [
                           {:number "I"
                            :note   "G"
                            :type   "major"}
                           {:number "II"
                            :note   "A"
                            :type   "minor"}
                           {:number "III"
                            :note   "B"
                            :type   "minor"}
                           {:number "IV"
                            :note   "C"
                            :type   "major"}
                           {:number "V"
                            :note   "D"
                            :type   "dominant"}
                           {:number "VI"
                            :note   "E"
                            :type   "minor"}
                           {:number "VII"
                            :note   "F#"
                            :type   "diminished"}
                           ]
                 :Gminor  [
                           {:number "I"
                            :note   "G"
                            :type   "minor"}
                           {:number "II"
                            :note   "A"
                            :type   "diminished"}
                           {:number "III"
                            :note   "Bb"
                            :type   "major"}
                           {:number "IV"
                            :note   "C"
                            :type   "minor"}
                           {:number "V"
                            :note   "D"
                            :type   "dominant"}
                           {:number "VI"
                            :note   "Eb"
                            :type   "major"}
                           {:number "VII"
                            :note   "F"
                            :type   "major"}
                           ]
                 :G#minor [
                           {:number "I"
                            :note   "G#"
                            :type   "minor"}
                           {:number "II"
                            :note   "A#"
                            :type   "diminished"}
                           {:number "III"
                            :note   "B"
                            :type   "major"}
                           {:number "IV"
                            :note   "C#"
                            :type   "minor"}
                           {:number "V"
                            :note   "D#"
                            :type   "dominant"}
                           {:number "VI"
                            :note   "E"
                            :type   "major"}
                           {:number "VII"
                            :note   "F#"
                            :type   "major"}
                           ]
                 :Abmajor [
                           {:number "I"
                            :note   "Ab"
                            :type   "major"}
                           {:number "II"
                            :note   "Bb"
                            :type   "minor"}
                           {:number "III"
                            :note   "C"
                            :type   "minor"}
                           {:number "IV"
                            :note   "Db"
                            :type   "major"}
                           {:number "V"
                            :note   "Eb"
                            :type   "dominant"}
                           {:number "VI"
                            :note   "F"
                            :type   "minor"}
                           {:number "VII"
                            :note   "G"
                            :type   "diminished"}
                           ]
                 :Amajor  [
                           {:number "I"
                            :note   "A"
                            :type   "major"}
                           {:number "II"
                            :note   "B"
                            :type   "minor"}
                           {:number "III"
                            :note   "C#"
                            :type   "minor"}
                           {:number "IV"
                            :note   "D"
                            :type   "major"}
                           {:number "V"
                            :note   "E"
                            :type   "dominant"}
                           {:number "VI"
                            :note   "F#"
                            :type   "minor"}
                           {:number "VII"
                            :note   "G#"
                            :type   "diminished"}
                           ]
                 :Aminor  [
                           {:number "I"
                            :note   "A"
                            :type   "minor"}
                           {:number "II"
                            :note   "B"
                            :type   "diminished"}
                           {:number "III"
                            :note   "C"
                            :type   "major"}
                           {:number "IV"
                            :note   "D"
                            :type   "minor"}
                           {:number "V"
                            :note   "E"
                            :type   "dominant"}
                           {:number "VI"
                            :note   "F"
                            :type   "major"}
                           {:number "VII"
                            :note   "G"
                            :type   "major"}
                           ]
                 :Bbmajor [
                           {:number "I"
                            :note   "Bb"
                            :type   "major"}
                           {:number "II"
                            :note   "C"
                            :type   "minor"}
                           {:number "III"
                            :note   "D"
                            :type   "minor"}
                           {:number "IV"
                            :note   "Eb"
                            :type   "major"}
                           {:number "V"
                            :note   "F"
                            :type   "dominant"}
                           {:number "VI"
                            :note   "G"
                            :type   "minor"}
                           {:number "VII"
                            :note   "A"
                            :type   "diminished"}
                           ]
                 :Bbminor [
                           {:number "I"
                            :note   "Bb"
                            :type   "minor"}
                           {:number "II"
                            :note   "C"
                            :type   "diminished"}
                           {:number "III"
                            :note   "Db"
                            :type   "major"}
                           {:number "IV"
                            :note   "Eb"
                            :type   "minor"}
                           {:number "V"
                            :note   "F"
                            :type   "dominant"}
                           {:number "VI"
                            :note   "Gb"
                            :type   "major"}
                           {:number "VII"
                            :note   "Ab"
                            :type   "major"}
                           ]
                 :Bmajor  [
                           {:number "I"
                            :note   "B"
                            :type   "major"}
                           {:number "II"
                            :note   "C#"
                            :type   "minor"}
                           {:number "III"
                            :note   "D#"
                            :type   "minor"}
                           {:number "IV"
                            :note   "E"
                            :type   "major"}
                           {:number "V"
                            :note   "F#"
                            :type   "dominant"}
                           {:number "VI"
                            :note   "G#"
                            :type   "minor"}
                           {:number "VII"
                            :note   "A#"
                            :type   "diminished"}
                           ]
                 :Bminor  [
                           {:number "I"
                            :note   "B"
                            :type   "minor"}
                           {:number "II"
                            :note   "C#"
                            :type   "diminished"}
                           {:number "III"
                            :note   "D"
                            :type   "major"}
                           {:number "IV"
                            :note   "E"
                            :type   "minor"}
                           {:number "V"
                            :note   "F#"
                            :type   "dominant"}
                           {:number "VI"
                            :note   "G"
                            :type   "major"}
                           {:number "VII"
                            :note   "A"
                            :type   "major"}
                           ]
                 })