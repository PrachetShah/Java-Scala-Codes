class Employee (val n : String , val eid : String , val d : String , val s : Int) {
    val name = n
    val empID = eid
    val designation = d
    val salary = s
    def display_grade(){
        print(s" Welcome , $name ")
        if (salary < 10000){
            println("D grade")
        }
        else if (salary < 25000 && salary>=10000){
            println("C grade")
        }
        else if (salary < 50000 && salary>=25000){
            println("B grade")
        }
        else if (50000<salary){
            println("A grade")
        }
    }
}
object Main {
def main(args: Array[String]): Unit = {
    var emp = new Employee("ABC" , "4252" , "COO" , 40000)
    emp.display_grade()
    }
}