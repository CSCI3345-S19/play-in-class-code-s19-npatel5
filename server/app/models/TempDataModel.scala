package models
case class TempData(day: Int, dayOfYear: Int, month: Int, stateId: String, year: Int, precip: Double, tave: Double, tmax: Double, tmin: Double)

object TempDataModel {
  val source = scala.io.Source.fromFile("data/SanAntonioTemps.csv");
  val lines = source.getLines();
  val data = lines.map{line =>
    val p = line.split(",")
    TempData(p(0).toInt, p(1).toInt, p(2).toInt, p(3), p(4).toInt, p(5).toDouble, p(6).toDouble, p(7).toDouble, p(8).toDouble)
  }
}