import scala.io.Source

:load utilities.sc

val myLines: Vector[String] = loadFile("text/The-time-machine.txt")

val characterVector: Vector[Char] = myLines.map( ln => {
  ln.toVector
}).flatten

// saved?
val charHisto: Vector[ (Char, Int) ] = {
  val grouped: Vector[ ( Char, Vector[Char] ) ] = characterVector.groupBy( c =>
  c).toVector

  grouped.map( g => {
    ( g._1, g._2.size )
  }).sortBy(_._2).reverse

}

val justChars: Vector[Char] = characterVector.distinct
val sortedChars = justChars.sortBy ( c => c)

val tableHead: String = "\n\n| Char  | Unicode Hex|\n|-------|------------|"
println(tableHead)

for ( c <- sortedChars) {
  val hex: String = c.toHexString
  println(s"| ' ${c}'  | '${hex}'       |")
}
