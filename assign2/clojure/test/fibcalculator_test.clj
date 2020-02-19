(ns fibcalculator-test
    (:require 
        [clojure.test :refer :all]
        [fibcalculator :refer :all]))

(deftest Canary
  (testing "Canary"
    (is true)))

(deftest iterativefib
  (testing "Initial Case iterativeFib(0)" 
    (is (= (iterativeFib 0) [1])))

  (testing "Case iterativeFib(1)" 
    (is (= (iterativeFib 1) [1, 1])))

  (testing "Case iterativeFib(2)" 
    (is (= (iterativeFib 2) [1, 1, 2])))

  (testing "Case iterativeFib(3)" 
    (is (= (iterativeFib 3) [1, 1, 2, 3])))
  
  (testing "Case iterativeFib(4)" 
    (is (= (iterativeFib 4) [1, 1, 2, 3, 5])))

  (testing "Case iterativeFib(5)" 
    (is (= (iterativeFib 5) [1, 1, 2, 3, 5, 8])))

  (testing "Case iterativeFib(10)" 
    (is (= (iterativeFib 10) [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89])))
)

(deftest recursivefib
  (testing "Initial Case recursiveFib(0)" 
    (is (= (recursiveFib 0) [1])))

  (testing "Case recursiveFib(1)" 
    (is (= (recursiveFib 1) [1, 1])))

  (testing "Case recursiveFib(2)" 
    (is (= (recursiveFib 2) [1, 1, 2])))

  (testing "Case recursiveFib(3)" 
    (is (= (recursiveFib 3) [1, 1, 2, 3])))
  
  (testing "Case recursiveFib(4)" 
    (is (= (recursiveFib 4) [1, 1, 2, 3, 5])))

  (testing "Case recursiveFib(5)" 
    (is (= (recursiveFib 5) [1, 1, 2, 3, 5, 8])))

  (testing "Case recursiveFib(10)" 
    (is (= (recursiveFib 10) [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89])))
)

(deftest recursiveiterativefib
  (testing "Initial Case recursiveiterativeFib(0)" 
    (is (= (recursiveiterativeFib 0) [1])))

  (testing "Case recursiveiterativeFib(1)" 
    (is (= (recursiveiterativeFib 1) [1, 1])))

  (testing "Case recursiveiterativeFib(2)" 
    (is (= (recursiveiterativeFib 2) [1, 1, 2])))

  (testing "Case recursiveiterativeFib(3)" 
    (is (= (recursiveiterativeFib 3) [1, 1, 2, 3])))
  
  (testing "Case recursiveiterativeFib(4)" 
    (is (= (recursiveiterativeFib 4) [1, 1, 2, 3, 5])))

  (testing "Case recursiveiterativeFib(5)" 
    (is (= (recursiveiterativeFib 5) [1, 1, 2, 3, 5, 8])))

  (testing "Case recursiveiterativeFib(10)" 
    (is (= (recursiveiterativeFib 10) [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89])))
)