(ns practicetopiczero.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))


(foo "Lucy")

(defn practiceConcat
  [x,y]
  (concat x y)
  )

(println (practiceConcat "Lucy" "HEath"))

(defn practiceString
  [x]
  (str x "Lucy" )
  )

(println (practiceString "Hello "))

(defn practiceNumericalConcat
  [[x,y], [z,a]]
  (concat [x, y] "Lucy" [z, a])
  )

(println (practiceNumericalConcat [1, 2] [3, 5]))

(defn capitalWords
  [x]
  (.toUpperCase x)
  )

(println (capitalWords "im NoT shOUTing"))

(defn spellWordWrong
  [x]
  (subs x 2 6)
  )

(defn findLen
  [x]
  (count x)

  )

(println (spellWordWrong "qwerty"))
(println (findLen (spellWordWrong "qwerty")))