import scala.io.StdIn.readLine
import scala.io.StdIn.readInt

trait Bank{
    def getBalance()
}
class A(a:Int) extends Bank{
    def getBalance(){
        println("Balance in bank A is : "+a)
    }
}
class B(a:Int) extends Bank{
    def getBalance(){
        println("Balance in bank B is : "+a)
    }
}
class C(a:Int) extends Bank{
    def getBalance(){
        println("Balance in bank C is : "+a)
    }
}
object Main{
    def main(args: Array[String]){
        var a = new A(200)
        var b = new B(350)
        var c = new C(400)
        a.getBalance()
        b.getBalance()
        c.getBalance()
    }
}