object Q18{
    def main(args: Array[String]) : Unit = {
        print("Enter number1: ")
        var num = scala.io.StdIn.readInt()
        
        while(num != 0){
            var rem = num%10
            num = num/10
            rem match{
                case 0 => println("Zero")
                case 1 => println("One")
                case 2 => println("Two")
                case 3 => println("Three")
                case 4 => println("Four")
                case 5 => println("Five")
                case 6 => println("Six")
                case 7 => println("Seven")
                case 8 => println("Eight")
                case 9 => println("Nine")
                case _ => println("Invalid")
            }
        }
    }
}