package Projet

class Tondeuse (val nom : String, xLim: Int, yLim: Int, val ptCardinal: Char, val xTondeuse: Int, yTondeuse : Int) {

  var X: Int = xTondeuse
  var Y: Int = yTondeuse
  var orientation: Char = ptCardinal

  def tourner(ordre: Char): Unit={
  ordre match {
    case 'G' =>
      orientation match {
        case 'N' => orientation = 'W'
        case 'W' => orientation = 'S'
        case 'S' => orientation = 'E'
        case 'E' => orientation = 'N'
      }

    case 'D' =>
      orientation match {
        case 'N' => orientation = 'E'
        case 'W' => orientation = 'N'
        case 'S' => orientation = 'W'
        case 'E' => orientation = 'S'
      }
  }
  }

  def avancer(ordre: Char): Unit={
    ordre match {
      case 'A' =>
        orientation match {
          case 'N' => if (Y < yLim) {
            Y = Y + 1
          } else { Y = Y
          }

          case 'E' => if (X< xLim) {
            X = X + 1
          } else {
            X = X
          }

          case 'S' => if (Y > 0) {
            Y = Y -1
          } else {
            Y = Y
          }

          case 'W' => if (X >0) {
            X = X - 1
          } else {
            X = X
          }


          }
        }
    println(s"$nom : $X $Y $orientation")
    }

  }



