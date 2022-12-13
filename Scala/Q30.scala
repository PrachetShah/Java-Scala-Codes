abstract class Shape{
    def RectangleArea(a:Int, b:Int)
    def SquareArea(a:Int)
    def CircleArea(a:Int)
}
class Area extends Shape{
    def RectangleArea(a:Int, b:Int){
        println("Area of rectangle is : "+a*b)
    }
    def SquareArea(a:Int){
        println("Area of square is : "+a*a)
    }
    def CircleArea(a:Int){
        println("Area of circle is : "+3.14*a*a)
    }
}
object Main{
    def main(args: Array[String]):Unit={
        var a = new Area()
        a.RectangleArea(20,10)
        a.SquareArea(10)
        a.CircleArea(100)
    }
}