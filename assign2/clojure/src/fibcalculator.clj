(ns fibcalculator)

(defn iterativeFib [n] 
  (case n
    0 [1]
    1 [1, 1]
    (nth (iterate (fn [flist] (conj flist (reduce +' (take-last 2 flist)))) '[1, 1]) (dec n))))

(def recursiveFib 
  (fn [n]
    (case n
      0 [1]
      1 [1, 1]
      ((fn [list] (conj list (reduce +' (take-last 2 list)))) (recursiveFib (dec n))))))

(defn recursiveiterativeFib [num]
  (letfn [(recursiveCall [number list]
          (case number
              0 [1]
              1 list
              (recursiveCall (dec number) (conj list (reduce +' (take-last 2 list))))
          ))]
  (recursiveCall num [1, 1]))
)