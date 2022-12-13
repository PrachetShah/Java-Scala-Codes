import scala.io.StdIn.readLine
import scala.io.StdIn.readInt
class Member{
    var name=""
    var age = 0
    var number = ""
    var address = ""
    var salary = 0
    def getInfo():Unit= {
        print("Enter name : ")
        name = readLine()
        print("Enter age : ")
        age = readInt()
        print("Enter number : ")
        number = readLine()
        print("Enter address : ")
        address = readLine()
        print("Enter salary : ")
        salary = readInt()
    }
    def showInfo():Unit={
        println("Name is "+name)
        println("Age is "+age)
        println("Number is "+number)
        println("Address is "+address)
        println("Salary is "+salary)
    }
}
class Employee extends Member{
    var specialization = ""
    var department = ""
    override def getInfo():Unit= {
        super.getInfo()
        print("Enter specialization : ")
        specialization = readLine()
        print("Enter department : ")
        department = readLine()
    }
    override def showInfo():Unit= {
        super.showInfo()
        println("Specialization is "+specialization)
        println("Department is "+department)
    }
}

class Manager extends Member{
    var specialization = ""
    var department = ""
    override def getInfo():Unit= {
        super.getInfo()
        print("Enter specialization : ")
        specialization = readLine()
        print("Enter department : ")
        department = readLine()
    }
    override def showInfo():Unit= {
        super.showInfo()
        println("Specialization is "+specialization)
        println("Department is "+department)
    }
}

object Main{
    def main(args: Array[String]):Unit={
        var e = new Employee();
        e.getInfo();
        e.showInfo();
        
        var m = new Manager();
        m.getInfo();
        m.showInfo();
    }
}