module FibCalculator where

    iterativeFib 0 = [1]
    iterativeFib 1 = [1, 1]
    iterativeFib n = (iterate (\list  -> list ++ [(last list) + last (init list)]) [1,1] !! (n - 1))
    
    recursiveFib 0 = [1]
    recursiveFib 1 = [1, 1]
    recursiveFib n = list ++ [sum]
        where
            list = recursiveFib(n - 1)
            sum = list!!(n - 2) + list!!(n - 1)

    recursiveIterativeFib n = recurse n [1, 1]
        where
            recurse n list  | n == 0    = [1]
                            | n == 1    = list
                            | otherwise = recurse (n - 1) (list ++ [(last list) + last (init list)])
