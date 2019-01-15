object exc1 extends App{

//  def BottleFunc(counter:Int): Unit ={
  //  println(s"$counter bottles of beer on the wall, $counter bottles of beer")
 //   println (s"take one down and pass it around, $counter bottles of beer")

  //}


  val List1 = List.range(1,99).reverse



  //List1.foreach(i => BottleFunc(i))

def BottleFunc2( List1:List[Int] , index: Int): Unit ={
  if (index != List1.length) {
    println(List1(index) + "bottles of beer on the wall," + List1(index) + "bottles of beer")
    println(s"take one down and pass it around," + List1(index) + "bottles of beer")
    BottleFunc2(List1, index + 1)
  }
}
BottleFunc2(List1, 0)

}
