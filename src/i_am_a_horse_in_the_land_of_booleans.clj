(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if(< x 0) (* -1 x) x))

(defn divides? [divisor n]
  (if(==(mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 5 n) "buzz"
   (divides? 3 n) "fizz"
   :else ""))

(defn teen? [age]
  (if(<= 13 age 19) true false))

(defn not-teen? [age]
  (if(teen? age) false true) )

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (or (list? x) (vector? x)) (* 2 (count x))
    :else true))

(defn leap-year? [year]
  (cond
   (and (divides? 4 year) (divides? 100 year) (divides? 400 year)) true
   (and (divides? 4 year) (divides? 100 year)) false
   (divides? 4 year) true
   :else false))

; '_______'
