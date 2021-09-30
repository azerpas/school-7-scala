import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object Test8{
    def main(args: Array[String]) = {
        var nombre = 0;

        while(nombre != 20)
            println("Donnez un nombre:")
            nombre = readLine.toInt

        printf("Vous avez tapé: %d\n", nombre)
    }
}