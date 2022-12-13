import scala.util.control.Breaks._
object Q19{

    def main(args: Array[String]) : Unit = {
        print("Enter number1: ")
        var num = scala.io.StdIn.readInt()
      var i = 2
      breakable{
        do{
        if(num%i==0){
          println("Not Prime Number")
          break
        }
        i = i+1
        }while(i < num)
        if(i==num){
          println("Prime Number")
        }
      }
    }
}