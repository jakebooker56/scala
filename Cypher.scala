object Cypher extends App {
  val chars = " zyxwvutsrqponmlkjihgfedcba".toList
  val chars2 = " abcdefghijklmnopqrstuvwxyz".toList


  println("please enter a word")
  val word = scala.io.StdIn.readLine().toList
  var i = 0
  var x = 0
  var k = 0
  var y = 0
    while(i < word.length)
    if (word(y) == chars2(x)) {
      print(chars(k))
      i +=1
      x = 0
      k = 0
      y +=1
    }
    else {
      k += 1
      x += 1
    }



}