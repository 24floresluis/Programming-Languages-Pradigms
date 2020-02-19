import Data.List

--Iterative Function
iterativeFib 0 = [1]
iterativeFib 1 = [1]
iterativeFib n = (iterate (\list  -> list ++ [(\x -> (last x) + last (init x)) list]) [1,1] !! (n - 1))


-- recursiveCall = \num list -> 
--     case num of
--         0 -> [1]
--         1 -> list
--         _ -> (recursiveCall (num - 1) (list ++ [(\x -> (last x) + last (init x)) list]))

-- recursiveIterativeFib n = 
--     (recursiveCall n [1, 1])




-- recursiveCall = \num list -> 
--     case num of
--         0 -> [1]
--         1 -> list
--         _ -> (recursiveCall (num - 1) (list ++ [(\x -> (last x) + last (init x)) list]))

recursiveIterativeFib n = recurse n [1, 1]
    where
        recurse n list  | n == 0    = [1]
                        | n == 1    = list
                        | otherwise = recurse (n - 1) (list ++ [(last list) + last (init list)])






-- fib n = go n (0,1)
--     where
--         go !n (!a, !b)  | n==0      = a
--                         | otherwise = go (n-1) (b, a+b)








    --     --Calculate Fib
    --     (\x -> (last x) + last (init x))

    --     --Concatenate FIb
    --     (\list  -> list ++ [nextfib list])

    --     --Compount of previous (Calculate and append)
    --     (\list  -> list ++ [(\x -> (last x) + last (init x)) list])

--Recursive Function




--Test Cases

    -- testRec2, testRec3, testRec4, testRec5, testRec10]

    -- testRec2 = 
    --   testCase "Case recursivefib(2)" $ assertEqual [] [1, 1, 2] (recursiveFib 2)

    -- testRec3 = 
    --   testCase "Case recursivefib(3)" $ assertEqual [] [1, 1, 2, 3] (recursiveFib 3)

    -- testRec4 = 
    --   testCase "Case recursivefib(4)" $ assertEqual [] [1, 1, 2, 3, 5] (recursiveFib 4)

    -- testRec5 = 
    --   testCase "Case recursivefib(5)" $ assertEqual [] [1, 1, 2, 3, 5, 8] (recursiveFib 5)

    -- testRec10 = 
    --   testCase "Case recursivefib(10)" $ assertEqual [] [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89] (recursiveFib 10)