import scala.collection.{Map, mutable}

object NamesComputer {

  def averageLengthFunctional(names: List[String]) = {
    if (names.isEmpty) 0 else names.map(_.length).sum.toFloat / names.length
  }

  def namesStartingWithEachLetterFunctional(names: List[String]): Map[String,Int] = {
    names.groupBy(_.substring(0,1)).map {case (nameInitial, nameList) => nameInitial -> nameList.size}
  }

  def averageLengthImperative(names: List[String]) = {
    if (names.isEmpty)
      0
    else { 
      var total = 0.0
      for (name <- names)
        total += name.length
      total.toFloat / names.length
    }
  }

  def namesStartingWithEachLetterImperative(names: List[String]) = {
    val map = new mutable.HashMap[String, Int]()
    for (name <- names)
      map(name.substring(0,1)) = map.getOrElse(name.substring(0,1), 0) + 1
      map
  }
}