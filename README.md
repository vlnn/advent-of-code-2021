# Advent of Code Clojure

## Progress

- [x] Day 1: Sonar Sweep
- [x] Day 2: Dive!
- [ ] Day 3: Binary Diagnostic
- [ ] Day 4:
- [ ] Day 5:
- [ ] Day 6:
- [ ] Day 7:
- [ ] Day 8:
- [ ] Day 9:
- [ ] Day 10:
- [ ] Day 11:
- [ ] Day 12:
- [ ] Day 13:
- [ ] Day 14:
- [ ] Day 15:
- [ ] Day 16:
- [ ] Day 17:
- [ ] Day 18:
- [ ] Day 19:
- [ ] Day 20:
- [ ] Day 21:
- [ ] Day 22:
- [ ] Day 23:
- [ ] Day 24:

## Usage

There are 25 namespaces, 25 input files 25 example input files, 25 tests, and 50 `lein` tasks.

1. Fill in the tests with the example solutions.
1. Write your implementation.
1. Fill in the final problem inputs into the `lein` task and run `lein run d01.p1`!

```clojure
(ns advent-of-code.day-01)

(defn part-1
  "Day 01 Part 1"
  [input]
  input)

(defn part-2
  "Day 01 Part 2"
  [input]
  input)
```

```clojure
(ns advent-of-code.core-test
  (:require [clojure.test :refer [deftest testing is]]
            [advent-of-code.day-01 :refer [part-1 part-2]]
            [clojure.java.io :refer [resource]]))

(deftest part1
  (let [expected nil]
    (is (= expected (part-1 (slurp (resource "day-1-example.txt")))))))

(deftest part2
  (let [expected nil]
    (is (= expected (part-2 (slurp (resource "day-1-example.txt")))))))
```
