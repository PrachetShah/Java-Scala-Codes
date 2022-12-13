import scala.io.StdIn.readLine
import scala.io.StdIn.readInt

trait Marks{
    def getPercentage()
}
class A(a:Int, b:Int, c:Int) extends Marks{
    def getPercentage(){
        println("Percentage for student A is : "+(a+b+c)/3.0)
    }
}
class B(a:Int, b:Int, c:Int, d:Int) extends Marks{
    def getPercentage(){
        println("Percentage for student B is : "+(a+b+c+d)/4.0)
    }
}
object Main{
    def main(args: Array[String]){
        var a = new A(50,50,50)
        var b = new B(60,60,60,60)
        a.getPercentage()
        b.getPercentage()
    }
}