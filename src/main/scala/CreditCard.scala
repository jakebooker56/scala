object CreditCard extends App {


  def CheckValid( NewCard: List[Int])= {   // checks if identifying number is valid
    var i = 0
    var Doubled = 0
    var NextNum = 0


    var Total = 0
    while (i < CardNo.length) {
      Doubled = CardNo(i + 1) * 2
      if (Doubled > 9) {
        Doubled = Doubled - 9
        Total = Total + Doubled
        i += 2
      }
      else {
        i += 2
      }
    }
    println(Total)
    if (Total % 10 == 0) {
      println(" Your number is valid")
    }
    else {
      println("Your number is invalid")
    }
  }


  def CheckDigit ( num:Int, NewCard:List[Int]): List[Int] ={   // adds a new digit to the end of a card
    val NewestCard = num:: NewCard.tail.reverse
    var z = 0
    while(z < NewestCard.length) {
      print(NewestCard(z))
      z += 1
    }
    println(":  is your newest card number")
    return NewestCard


  }
  var CardNo = List[Int]()
  var x: Int = 0
  for(x <- 1 to 16){
    CardNo = CardNo :+ scala.util.Random.nextInt(9)      //  generates a random card number
  }
  val NewCard = CardNo.reverse

 // println("your  card number is")
 // var y = 0
 // while(y < NewCard.length){
 //   print(NewCard(y))
 //   y +=1
 // }


  CheckValid(NewCard)

CheckDigit(3,NewCard)


}
