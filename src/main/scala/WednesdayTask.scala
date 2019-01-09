object WednesdayTask extends App {
  import scala.io.Source

def WordCalc: Unit = {

  val lines = Source.fromURL("http://norvig.com/ngrams/enable1.txt").getLines.toArray
  //var lines2 = Source.fromURL("http://norvig.com/ngrams/enable1.txt").getLines.toArray
  println("please enter word")
  val Word1 = scala.io.StdIn.readLine()
  val Array1 = Word1.toArray
  val array1length = Array1.length
  var i = 0
  var k = 0
  var count = 0
  var LongestArrayLength = 0
  var LongestWord = ""
  var Length1 = 0
  while (i < lines.length) { //goes through all the words
    while (count < array1length) { // goes through each individual letter
      if (lines(i).contains(Array1(k))) { // checks if letter is in word
        k += 1
        count += 1 // if it is it goes to the next letter
      }
      else {
        count += 1
      }
    }
    if (k == 1) {        /// if it has a letter contained in the user input then the result is printed
      println(lines(i))
       Length1 = lines(i).length()
      if( Length1 > LongestArrayLength) {     // if the length of the word is larger that the LongestArrayLength then it becomes the longest word
        LongestWord = lines(i)
        LongestArrayLength = Length1
      }

      i += 1
      k = 0
      count = 0
    }
    else {
      i += 1
      k = 0
      count = 0
    }
  }
  println(s"the longest word is: $LongestWord")
}
  println("please enter number")
  val WordNumber = scala.io.StdIn.readInt()
  var b = 0
  while( b < WordNumber) {
    WordCalc
    b+=1
  }
}
