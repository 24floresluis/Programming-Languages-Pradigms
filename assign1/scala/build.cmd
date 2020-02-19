mkdir classes

cmd /c scalac -d classes -classpath lib\scalatest_2.12-3.0.5.jar;lib\scalactic_2.12-3.0.5.jar src\*.scala test\*.scala



cmd /c scala -classpath lib\scalatest_2.12-3.0.5.jar;lib\scalactic_2.12-3.0.5.jar;classes org.scalatest.run NamesComputerSpec



rmdir /s /q classes
