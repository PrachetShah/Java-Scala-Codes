import scala.io.StdIn._

object Q26{
    def fact(n:Int):Int={
        if(n==1) return 1
        return n*fact(n-1)
    }
    def func(a:Int, n:Int, f:Int=>Int):Double={
        if(n==1) return a
        else{
            var m = Math.pow(a, n)/f(n)
            m + func(a, n-1, f)
        }
    }
    def main(args: Array[String]):Unit = {
        println(func(2, 2, fact))
    }
}