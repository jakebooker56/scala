object exc1 {

  def BottleFunc(counter:Int): Unit ={
    println(s"$counter bottles of beer on the wall, $counter bottles of beer")
    println (s"take one down and pass it around, $counter bottles of beer")
  }


  val List1: Range = 99 to 1 by -1


  List1.foreach(i => BottleFunc(i))



}
