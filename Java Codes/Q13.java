import java.util.Scanner;

class Student {
    int rollno;
    void setno() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll number : ");
        rollno=sc.nextInt();
    }
}

class Test extends Student {
    int sem1=0,sem2=0;
    void setmarks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sem1 marks : ");
        sem1=sc.nextInt();
        System.out.print("Enter sem2 marks : ");
        sem2=sc.nextInt();
    }
}

interface Sports {
    void score();
}

class Result extends Test implements Sports {
    int sport=0;
    public void score() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter score in sports : ");
        sport=sc.nextInt();
    }
    void getTotal() {
        System.out.print("Total of student "+rollno+" is "+(sem1+sem2+sport));
    }
}

public class Q13 {
    public static void main(String[] args) {
        Result obj=new Result();
        obj.setno();
        obj.setmarks();
        obj.score();
        obj.getTotal();
    }
}