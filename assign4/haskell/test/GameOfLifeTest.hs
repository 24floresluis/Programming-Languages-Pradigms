import Test.Tasty (defaultMain, testGroup)
import Test.Tasty.HUnit (assertEqual, testCase)
import GameOfLife (isAlive, generateSignals, countSignalsForEachCell, nextGeneration)

main = defaultMain unitTests

unitTests =
  testGroup
    "Unit tests"
    [
      canary, 
      testLiveCellOneNeighbor, testLiveCellFourNeighbors, testLiveCellTwoNeighbors, testLiveCellThreeNeighbors,
      testDeadCellOneNeighbor, testDeadCellFourNeighbors, testDeadCellTwoNeighbors, testDeadCellThreeNeighbors,
      testSignalsEmptyUniverse, testSignalOneLiveCellUniverse, testSignalTwoLiveCellsUniverse,
      testSignalsTwoNearbyCellsUniverse, testCountSignalsNoSignals, testCountSignalsOneSignal, 
      testCountSignalsTwoSignals, testCountSignalsThreeSignals, testCountSignalsSixSignals,
      testNextGenerationEmpty, testNextGenerationOneCell, testNextGenerationBlock, 
      testNextGenerationVerticalOscillator, testNextGenerationHorizontalOscillator, testNextGenerationGlider
    ]

canary =
  testCase "canary" $ assertEqual [] True True
       
testLiveCellOneNeighbor =
  testCase "Case isAlive True 1" $ assertEqual [] False $ isAlive True 1

testLiveCellFourNeighbors =
  testCase "Case isAlive True 4" $ assertEqual [] False $ isAlive True 4

testLiveCellTwoNeighbors =
  testCase "Case isAlive True 2" $ assertEqual [] True $ isAlive True 2

testLiveCellThreeNeighbors =
  testCase "Case isAlive True 3" $ assertEqual [] True $ isAlive True 3

testDeadCellOneNeighbor =
  testCase "Case isAlive False 1" $ assertEqual [] False $ isAlive False 1

testDeadCellFourNeighbors =
  testCase "Case isAlive False 4" $ assertEqual [] False $ isAlive False 4

testDeadCellTwoNeighbors =
  testCase "Case isAlive False 2" $ assertEqual [] False $ isAlive False 2

testDeadCellThreeNeighbors =
  testCase "Case isAlive False 3" $ assertEqual [] True $ isAlive False 3

testSignalsEmptyUniverse =
  testCase "Case generateSignals []" $ assertEqual [] 0 $ length (generateSignals [])

testSignalOneLiveCellUniverse =
  testCase "Case generateSignals [(2, 3)]" $ do
    assertEqual [] 8 (length signals)
    assertEqual [] [(1, 2), (1, 3), (1, 4), (2, 2), (2, 4), (3, 2), (3, 3), (3, 4)] signals
  where signals = generateSignals [(2, 3)]

testSignalTwoLiveCellsUniverse =
  testCase "Case generateSignals [(2, 3), (10, 12)]" $ do 
    assertEqual [] 16 $ length signals
    assertEqual [] True $ elem (1,2) signals
    assertEqual [] True $ elem (10, 11) signals
  where signals = generateSignals [(2, 3), (10, 12)]

testSignalsTwoNearbyCellsUniverse =
  testCase "Case generateSignals [(2, 3), (2, 5)]" $ do
    assertEqual [] 16 $ length signals
    assertEqual [] 2 $ length $ filter (\x -> x == (2, 4)) signals
  where signals = generateSignals [(2, 3), (2, 5)]

testCountSignalsNoSignals =
  testCase "Case countSignalsForEachCell []" $ do
    assertEqual [] 0 $ length noSignals
  where noSignals = countSignalsForEachCell []
  
testCountSignalsOneSignal =
  testCase "Case countSignalsForEachCell [(1, 2)]" $ do
    assertEqual [] True $ elem ((1, 2), 1) noSignals
  where noSignals = countSignalsForEachCell [(1, 2)]

testCountSignalsTwoSignals =
  testCase "Case countSignalsForEachCell [(1, 2), (1, 2)]" $ do
    assertEqual [] True $ elem ((1, 2), 2) noSignals
  where noSignals = countSignalsForEachCell [(1, 2), (1, 2)]

testCountSignalsThreeSignals =
  testCase "Case countSignalsForEachCell [(3, 2), (101, 102), (3, 2)]" $ do
    assertEqual [] True $ elem ((3, 2), 2) noSignals
    assertEqual [] True $ elem ((101, 102), 1) noSignals
  where noSignals = countSignalsForEachCell [(3, 2), (101, 102), (3, 2)]

testCountSignalsSixSignals =
  testCase "Case countSignalsForEachCell [...multiple duplicate values...]" $ do
    assertEqual [] True $ elem ((3, 2), 4) noSignals
    assertEqual [] True $ elem ((1, 2), 1) noSignals
  where noSignals = countSignalsForEachCell [(3, 2), (101, 102), (3, 2), (1, 2), (3, 2), (3, 2)]

testNextGenerationEmpty =
  testCase "Case nextGeneration []" $ do
    assertEqual [] 0 $ length nextLiveCells
  where nextLiveCells = nextGeneration []

testNextGenerationOneCell =
  testCase "Case nextGeneration [(1, 2)]" $ do
    assertEqual [] 0 $ length nextLiveCells
  where nextLiveCells = nextGeneration [(1, 2)]

testNextGenerationBlock =
  testCase "Case nextGeneration [...block...]" $ do
    assertEqual [] True $ elem (1, 2) nextLiveCells
    assertEqual [] True $ elem (2, 2) nextLiveCells
    assertEqual [] True $ elem (1, 3) nextLiveCells
    assertEqual [] True $ elem (2, 3) nextLiveCells
  where nextLiveCells = nextGeneration [(1, 2), (2, 2), (1, 3), (2, 3)]

testNextGenerationVerticalOscillator =
  testCase "Case nextGeneration [...vertical oscillator...]" $ do
    assertEqual [] True $ elem (2, 1) nextLiveCells
    assertEqual [] True $ elem (2, 2) nextLiveCells
    assertEqual [] True $ elem (2, 3) nextLiveCells
  where nextLiveCells = nextGeneration [(1, 2), (2, 2), (3, 2)]

testNextGenerationHorizontalOscillator =
  testCase "Case nextGeneration [...horizontal oscillator...]" $ do
    assertEqual [] True $ elem (1, 2) nextLiveCells
    assertEqual [] True $ elem (2, 2) nextLiveCells
    assertEqual [] True $ elem (3, 2) nextLiveCells
  where nextLiveCells = nextGeneration [(2, 1), (2, 2), (2, 3)]

testNextGenerationGlider =
  testCase "Case nextGeneration [...glider...]" $ do
    assertEqual [] True $ elem (1, 3) nextLiveCells
    assertEqual [] True $ elem (2, 1) nextLiveCells
    assertEqual [] True $ elem (2, 3) nextLiveCells
    assertEqual [] True $ elem (3, 2) nextLiveCells
    assertEqual [] True $ elem (3, 3) nextLiveCells
  where nextLiveCells = nextGeneration [(1, 1), (1, 3), (2, 2), (2, 3), (3, 2)]