import System.Process
import System.Info
import Control.Concurrent

convertToString number = do
  "number:" ++ (show number)

generations number =
  iterate (+ 10) number

printIt str = do
  threadDelay 1000000
  system (if System.Info.os == "windows" then "cls" else "clear")
  putStr str

main = do
  mapM_ printIt (map convertToString (take 1000000 (generations 0)))
