(ns advent-of-code.day-01)

(defn parse-input
  "Parse input slurped out of the file into vector of integers"
  [raw]
  (mapv read-string (clojure.string/split-lines raw)))

(defn count-depth-increases
  "Count the number of times a depth measurement increases"
  [depths]
  (count (filter true? (map pos? (map - (drop 1 depths) depths)))))

(defn part-1
  "Day 01 Part 1"
  [input]
  (->
   input
   (parse-input)
   (count-depth-increases)))

(defn count-depth-sums-increases
  "Count the number of times the sum of measurements in this sliding window increases"
  [input]
  (->> input
       (partition-all 3 1)
       (map #(reduce + %))
       (count-depth-increases)))

(defn part-2
  "Day 01 Part 2"
  [input]
  (->>
   input
   (parse-input)
   (count-depth-sums-increases)))
