package Projet

object Run extends App {

  var Tondeuse1= new Tondeuse("Tondeuse 1", 5, 5, 'N', 1, 2)

  val série1 : String = "GAGAGAGAA"

  var ordre1 : Char = ' '

  for (i <- 0 until  série1.length) {
    ordre1 = série1.charAt(i)
    ordre1 match {
      case 'A' => Tondeuse1.avancer(ordre1)
      case 'D' => Tondeuse1.tourner(ordre1)
      case 'G' => Tondeuse1.tourner(ordre1)
    }
  }

  var Tondeuse2 = new Tondeuse("Tondeuse 2", 5,5,'E',3,3)

  val série2 : String = "AADAADADDA"

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
