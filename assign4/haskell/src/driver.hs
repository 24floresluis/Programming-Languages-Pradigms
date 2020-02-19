import System.Process
import System.Info
import Control.Concurrent
import Data.List as LS
import Data.Map
import Data.Maybe
import GameOfLife (nextGeneration)


getWindow cells = do
    let xmax = fst $ maximumBy (\x y -> fst x `compare` fst y) cells
    let ymax = snd $ maximumBy (\x y -> snd x `compare` snd y) cells
    let xmin = fst $ minimumBy (\x y -> fst x `compare` fst y) cells
    let ymin = snd $ minimumBy (\x y -> snd x `compare` snd y) cells
    fromList [("xmax", xmax), ("ymax", ymax), ("xmin", xmin), ("ymin", ymin)]

cellsToString cells = do
    let win = getWindow cells

    let xmin = win ! "xmin"
    let xmax = win ! "xmax"
    let ymin = win ! "ymin"
    let ymax = win ! "ymax"

    let xrange = abs $ xmin - xmax
    let yrange = abs $ ymin - ymax

    let xoffset = win ! "xmin"
    let yoffset = win ! "ymin"

    let shiftedCells = LS.map (\cell -> (fst cell - xoffset, snd cell - yoffset)) cells

    let indices = [(x, y) | x <- [0..xrange],
                            y <- [0..yrange]]

    LS.intercalate "" $ LS.map (\cell -> if elem cell shiftedCells then (if snd cell == yrange then "x\n" else "x") else (if snd cell == yrange then " \n" else " ")) indices

printIt cellsString = do
    threadDelay 1000000
    system (if System.Info.os == "windows" then "cls" else "clear")
    putStr cellsString


main = do
    let cells = [(1, 1), (1, 3), (2, 2), (2, 3), (3, 2)]
    let results = iterate (nextGeneration) cells
    threadDelay 2000000
    mapM_ printIt (LS.map cellsToString (LS.take 1000000 results))