import System.Process
import System.Info
import Control.Concurrent

isPrime num = null [ x | x <- [2..num - 1], num `mod`x  == 0]

printIt num = do
    threadDelay 1000000
    print num

main = do
    print("Enter a number:")
    input <- getLine
    let x = (read input :: Int)
    let results = filter isPrime [x + 1, x + 2..]
    mapM printIt results