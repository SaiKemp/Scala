import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

object Solution {

    // Complete the reverseArray function below.
    def reverseArray(a: Array[Int]): Array[Int] = {
        val len = a.length
        for(i <- 0 until len/2){
            val temp = a(i)
            //out:+ a(len-i-1)
            a(i) = a(len-i-1)
           a(len-i-1) =temp
        }
        return a
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val arrCount = stdin.readLine.trim.toInt

        val arr = stdin.readLine.split(" ").map(_.trim.toInt)
        val res = reverseArray(arr)

        printWriter.println(res.mkString(" "))

        printWriter.close()
    }
}
