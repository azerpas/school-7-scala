object Test4{
    def main(args: Array[String]) = {
        var i = 0
        val randLetters = "ABCDEFGHIJKLMNOPQRSTUVXYZ"
        for(i<-0 until randLetters.length)
            println(randLetters(i))
    }
}