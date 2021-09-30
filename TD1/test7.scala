object Test7 {
    def main(args: Array[String]) = {
        def impair() = {
            val impairList = List(1,2,3,4,5,6,7,8,9,10)
                for (i <- impairList){
                    if(i==10){
                        println("Ended")
                    }
                    if(i%2 != 0){
                        println(i)
                    }
                }
        }
        impair()
    }
}