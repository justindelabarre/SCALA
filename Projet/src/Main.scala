package Projet

object Main extends App {

  val lines = io.Source.fromResource("instructions.txt").getLines.toList

  val xLim = lines(0).split(" ")(0).toInt
  val yLim = lines(0).split(" ")(1).toInt

  val xTondeuse1 = lines(1).split(" ")(0).toInt
  val yTondeuse1 = lines(1).split(" ")(1).toInt
  val ptCardinal1 = lines(1).split(" ")(2).charAt(0)

  val série1 = lines(2).toString

  var Tondeuse1= new Tondeuse("Tondeuse 1", xLim, yLim, ptCardinal1, xTondeuse1, yTondeuse1)

  var ordre1 : Char = ' '

  for (i <- 0 until  série1.length) {
    ordre1 = série1.charAt(i)
    ordre1 match {
      case 'A' => Tondeuse1.avancer(ordre1)
      case 'D' => Tondeuse1.tourner(ordre1)
      case 'G' => Tondeuse1.tourner(ordre1)
    }
  }


  val xTondeuse2 = lines(3).split(" ")(0).toInt
  val yTondeuse2 = lines(3).split(" ")(1).toInt
  val ptCardinal2 = lines(3).split(" ")(2).charAt(0)

  val série2 = lines(4).toString

  var Tondeuse2 = new Tondeuse("Tondeuse 2", xLim, yLim, ptCardinal2, xTondeuse2, yTondeuse2)

  var ordre2 : Char = ' '

  for (i <- 0 until  série2.length) {
    ordre2 = série2.charAt(i)
    ordre2 match {
      case 'A' => Tondeuse2.avancer(ordre2)
      case 'D' => Tondeuse2.tourner(ordre2)
      case 'G' => Tondeuse2.tourner(ordre2)
    }
  }

}
