(ns advent-of-code.day-02)

(defn forward [dx m]
  {:x (+ dx (:x m)) , :y (:y m)})

(defn up [dy m]
  {:x (:x m) , :y (- (:y m) dy)})

(defn down [dy m]
  {:x (:x m) , :y (+ (:y m) dy)})

(defn the-program [input]
  (->>
   input
   (format "(->> {:x 0, :y 0} %s ) ")
   (read-string)
   (eval)))

(defn part-1
  "Day 02 Part 1"
  [input]
  (->>
   input
   (clojure.string/split-lines)
   (map #(str "(advent-of-code.day-02/" % ")")) ;; AAAARGH that's not funny at all: https://stackoverflow.com/questions/42368725/lein-run-eval-unable-to-resolve-symbol
   (clojure.string/join " ")
   (the-program)
   (vals)
   (reduce *)))

(defn new-forward [dx m]
  {:x (+ dx (:x m)), :y (+ (* (:a m) dx) (:y m)), :a (:a m)})

(defn new-down [da m]
  {:x (:x m), :y (:y m), :a (+ (:a m) da)})

(defn new-up [da m]
  {:x (:x m), :y (:y m), :a (- (:a m) da)})

(defn the-program [input]
  (->>
   input
   (format "(->> {:x 0, :y 0, :a 0} %s ) ")
   (read-string)
   (eval)))

(defn part-2
  "Day 02 Part 2"
  [input]
  (let [result
        (->>
         input
         (clojure.string/split-lines)
         (map #(str "(advent-of-code.day-02/new-" % ")")) ;; AAAARGH that's not funny at all: https://stackoverflow.com/questions/42368725/lein-run-eval-unable-to-resolve-symbol
         (clojure.string/join " ")
         (the-program))]
    (* (:y result) (:x result))))
