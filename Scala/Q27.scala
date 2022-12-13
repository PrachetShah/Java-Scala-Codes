import scala.io.StdIn._

object Q27{
    def sum(a:Int, b:Int):Int={
        return a+b
    }
    def main(args: Array[String]):Unit = {
        print("Enter a: ")
        var a = readInt()
        print("Enter b: ")
        var b = readInt()
        if(a==b){
            print("Triple of Sum is: "+3*sum(a,b))
        }else{
            print("Sum is: "+sum(a,b))
        }
    }
}