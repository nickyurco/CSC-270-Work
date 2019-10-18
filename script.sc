import scala.io.Source

:load utilities.sc

val myLines: Vector[String] = loadFile("text/The-time-machine.txt")
val oneBigString: String myLines.mkString(" ")
val myChars: Vector[Char] = oneBigString.toVector
val myBetterChars: Vector[String] = myChars.map(_.toString)
val noSpaceVec: Vector[String] = myBetterChars.filter(_ != " ")

val charHisto: Vector[ (Char, Int) ] = {
  noSpaceVec.map( t=> {
    val newTuple = (t._1, t._2.size)
  })
}
for ( h <= charHisto) println( s"${h._1}\t${h._2}" )
