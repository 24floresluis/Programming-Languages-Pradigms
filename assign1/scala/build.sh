mkdir classes

scalac -d classes -classpath lib/scalatest_2.12-3.0.5.jar:lib/scalactic_2.12-3.0.5.jar src/*.scala test/*.scala

scala -classpath lib/scalatest_2.12-3.0.5.jar:lib/scalactic_2.12-3.0.5.jar:classes org.scalatest.run NamesComputerSpec

/bin/rm -rf classes