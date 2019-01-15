import scala.annotation.tailrec

object Recursion extends App {
  @tailrec
  def sum ( stop: Int, num: Int): Int ={
    var x = 0
    if (stop == 0 )
      num
    else
      {
        x = num + stop
        sum(stop - 1,x)
      }
  }
  println(sum(9,10))


  def factorial(n: Int): Int = {
    if (n == 0)
      return 1
    else
      return n * factorial(n-1)
  }

println(factorial(5))

@tailrec
  def zeros(newarray: Array[Int], index:Int, numberOfZeros:Int): Int = {
  if (index == newarray.length){
    numberOfZeros
  }
  else if (newarray(index) == 0){
      zeros(newarray, index +1, numberOfZeros+1)
    }
    else {
      zeros(newarray, index +1, numberOfZeros)
    }
  }
  val newarray = Array(0,0,0,7,6)
  println(zeros(newarray, 0 ,0))


  @tailrec
  def lowestNumber(newarray2: Array[Int], index:Int, num:Int): Int = {
    if (index == newarray2.length){
      num
    }
    else if (newarray2(index) > num){
      lowestNumber(newarray2, index +1,  newarray2(index))
    }
    else {
      lowestNumber(newarray2, index +1, num)
    }
  }
  val newarray2 = Array(0,0,0,7,6)
  println(lowestNumber(newarray2, 0 ,0))

  @tailrec
def allNumbers(newArray3: Array[Int], index: Int): Unit ={
  if (index != newArray3.length){
    print(newArray3(index))
    allNumbers(newArray3, index +1)
  }
}
val newArray3 = Array(1,2,3,4,5,6,7)
  allNumbers(newArray3, 0)

/*  def digitSum(numSum:Int): Int ={
    val newList = numSum.toString.toList
  }
  */
}