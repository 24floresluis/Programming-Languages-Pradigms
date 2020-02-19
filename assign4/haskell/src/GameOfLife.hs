module GameOfLife where
  import Data.List (groupBy, sort)

  isAlive alive livingNeighbors =
    or [livingNeighbors == 3, alive && livingNeighbors == 2]

  generateSignals liveCells = 
    concat (map (\cell -> [
        ((fst cell) - 1, (snd cell) - 1), ((fst cell) - 1, (snd cell)),
        ((fst cell) - 1, (snd cell) + 1), ((fst cell), (snd cell) - 1),
        ((fst cell), (snd cell) + 1), ((fst cell) + 1, (snd cell) - 1),
        ((fst cell) + 1, (snd cell)), ((fst cell) + 1, (snd cell) + 1)
      ]) liveCells)

  countSignalsForEachCell :: (Ord a, Ord b, Num a, Num b) =>
    [(a, b)] -> [((a, b), Int)]
  countSignalsForEachCell signals =
    map (\listEqual -> (
      head listEqual, length listEqual)) (groupBy (==) (sort signals))

  nextGeneration liveCells =
    let signals = generateSignals liveCells in
    map (\x -> fst x) (filter (\x -> isAlive (elem (fst x) liveCells ) $ snd x) $ countSignalsForEachCell signals)
