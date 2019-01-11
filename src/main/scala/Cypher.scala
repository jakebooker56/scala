object Cypher extends App{
    val chars =  "zyxwvutsrqponmlkjihgfedcba"
    val chars2 = "abcdefghijklmnopqrstuvwxyz"


    println("please enter a word")
    val word = scala.io.StdIn.readLine()
    println(word)
    var i = 0
    var a = 1
    var k = 0
    var t = 1
    while( i < word.length){
      if(word.substring(0,t) == chars2.substring(0,a)) {
        print(chars(k))
        t +=1
        i +=1
        a = 1
        k = 0
      }
      else  {
        a +=1
        k  +=1
        print(chars(k))
      }
    }


}
