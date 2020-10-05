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

(defn squareNum
  [x]
  (* x x)
  )

(println (squareNum 9))

(defn sumOfSquares
  [x, y]
  (+ (squareNum x) (squareNum y))
     )

(println (sumOfSquares 10 10))
(defn equal? [x y] (if (= x y) 1 y))
;;if x is equal to y return 1 else return y
(println (equal? 3 3))


(defn add2 [a b] (+ 2 (if (> a b) a b)))
(println (add2 10 1))

(defn addLargest
  [x, y,z]
  (cond
    (and (> x z) (> y z)) (+ x y)
    (and (> y x) (> z x)) (+ y z)
    (and (> z y ) (> x y)) (+ z y)
    ):else (+ x z)
  )
;;compares the values and adds the largest two together

(println (addLargest 10, 2, 3) )