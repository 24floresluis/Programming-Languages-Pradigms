import Test.Tasty (defaultMain, testGroup)
import Test.Tasty.HUnit (assertEqual, testCase)
import FibCalculator (recursiveFib, iterativeFib, recursiveIterativeFib)

main = defaultMain unitTests

unitTests =
  testGroup
    "Unit tests"
    [canary, testIter0, testIter1, testIter2, testIter3, testIter4, testIter5, testIter10, testRec0, testRec1, testRec2, testRec3, testRec4, testRec5, testRec10, testRecIter0, testRecIter1, testRecIter2, testRecIter3, testRecIter4, testRecIter5, testRecIter10]

canary =
  testCase "canary" $ assertEqual [] True (True)

testIter0 = 
  testCase "Initial Case iterativeFib(0)" $ assertEqual [] [1] (iterativeFib 0)

testIter1 =                                                            
  testCase "Case iterativeFib(1)" $ assertEqual [] [1, 1] (iterativeFib 1)
  
testIter2 = 
  testCase "Case iterativeFib(2)" $ assertEqual [] [1, 1, 2] (iterativeFib 2)
  
testIter3 = 
  testCase "Case iterativeFib(3)" $ assertEqual [] [1, 1, 2, 3] (iterativeFib 3)
  
testIter4 = 
  testCase "Case iterativeFib(4)" $ assertEqual [] [1, 1, 2, 3, 5] (iterativeFib 4)
  
testIter5 = 
  testCase "Case iterativeFib(5)" $ assertEqual [] [1, 1, 2, 3, 5, 8] (iterativeFib 5)
  
testIter10 = 
  testCase "Case iterativeFib(10)" $ assertEqual [] [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89] (iterativeFib 10)

testRec0 = 
  testCase "Initial Case recursivefib(0)" $ assertEqual [] [1] (recursiveFib 0)

testRec1 = 
  testCase "Case recursivefib(1)" $ assertEqual [] [1, 1] (recursiveFib 1)

testRec2 = 
  testCase "Case recursivefib(2)" $ assertEqual [] [1, 1, 2] (recursiveFib 2)

testRec3 = 
  testCase "Case recursivefib(3)" $ assertEqual [] [1, 1, 2 ,3] (recursiveFib 3)

testRec4 = 
  testCase "Case recursivefib(4)" $ assertEqual [] [1, 1, 2 ,3 ,5] (recursiveFib 4)

testRec5 = 
  testCase "Case recursivefib(5)" $ assertEqual [] [1, 1, 2, 3, 5, 8] (recursiveFib 5)

testRec10 = 
  testCase "Case recursivefib(10)" $ assertEqual [] [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89] (recursiveFib 10)

testRecIter0 = 
  testCase "Case recursiveiterativefib(0)" $ assertEqual [] [1] (recursiveIterativeFib 0)

testRecIter1 = 
  testCase "Case recursiveiterativefib(1)" $ assertEqual [] [1, 1] (recursiveIterativeFib 1)

testRecIter2 = 
  testCase "Case recursiveiterativefib(2)" $ assertEqual [] [1, 1, 2] (recursiveIterativeFib 2)

testRecIter3 = 
  testCase "Case recursiveiterativefib(3)" $ assertEqual [] [1, 1, 2, 3] (recursiveIterativeFib 3)

testRecIter4 = 
  testCase "Case recursiveiterativefib(4)" $ assertEqual [] [1, 1, 2, 3, 5] (recursiveIterativeFib 4)

testRecIter5 = 
  testCase "Case recursiveiterativefib(5)" $ assertEqual [] [1, 1, 2, 3, 5, 8] (recursiveIterativeFib 5)

testRecIter10 = 
  testCase "Case recursiveiterativefib(10)" $ assertEqual [] [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89] (recursiveIterativeFib 10)