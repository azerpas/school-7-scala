object Test1 {
    def main(args: Array[String]) = {
        var i = 0
        while(i <= 10) {
            println(i)
            i += 1
        }

        do {
            println(i*2)
            i += 1
        } while(i <= 20)
    }
}