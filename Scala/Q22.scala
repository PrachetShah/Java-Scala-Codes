class Racers {
    var s1=0.0
    var s2=0.0
    var s3=0.0
    var s4=0.0
    var s5=0.0
    def get_speeds() {
        print("Enter speed 1 : ")
        this.s1 = scala.io.StdIn.readFloat()
        print("Enter speed 2 : ")
        this.s2 = scala.io.StdIn.readFloat()
        print("Enter speed 3 : ")
        this.s3 = scala.io.StdIn.readFloat()
        print("Enter speed 4 : ")
        this.s4 = scala.io.StdIn.readFloat()
        print("Enter speed 5 : ")
        this.s5 = scala.io.StdIn.readFloat()
    }
    def show_winner() {
        var avg = (this.s1+this.s2+this.s3+this.s4+this.s5)/5.0
        if(this.s1>avg) {
            print("Racer 1 with speed "+this.s1+" will qualify\n")
        }
        if(this.s2>avg) {
            print("Racer 2 with speed "+this.s2+" will qualify\n")
        }
        if(this.s3>avg) {
            print("Racer 3 with speed "+this.s3+" will qualify\n")
        }
        if(this.s4>avg) {
            print("Racer 4 with speed "+this.s4+" will qualify\n")
        }
        if(this.s5>avg) {
            print("Racer 5 with speed "+this.s5+" will qualify\n")
        }
    }
}
object Main {
    def main(args: Array[String]) {
        var obj = new Racers()
        obj.get_speeds()
        obj.show_winner()
    }
}