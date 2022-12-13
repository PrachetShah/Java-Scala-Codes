import java.util.Scanner;

public class Q10 {
    public boolean check(int a,int b,int c,int d,int n){
        if(((a*10+b)*(c*10+d))==n)
        return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter four digit number : ");
        int n = sc.nextInt();
        int d1=n%10;
        int d2=(n/10)%10;
        int d3=(n/100)%10;
        int d4=(n/1000)%10;
        Q10 obj = new Q10();
        if(obj.check(d1, d2, d3, d4, n))
        System.out.print("The number is a vampire number");
        else if(obj.check(d1, d2, d4, d3, n))
        System.out.print("The number is a vampire number");
        else if(obj.check(d2, d1, d3, d4, n))
        System.out.print("The number is a vampire number");
        else if(obj.check(d2, d1, d4, d3, n))
        System.out.print("The number is a vampire number");
        else if(obj.check(d1, d3, d2, d4, n))
        System.out.print("The number is a vampire number");
        else if(obj.check(d3, d1, d2, d4, n))
        System.out.print("The number is a vampire number");
        else if(obj.check(d1, d3, d4, d2, n))
        System.out.print("The number is a vampire number");
        else if(obj.check(d3, d1, d4, d2, n))
        System.out.print("The number is a vampire number");
        else if(obj.check(d1, d4, d2, d3, n))
        System.out.print("The number is a vampire number");
        else if(obj.check(d1, d4, d3, d2, n))
        System.out.print("The number is a vampire number");
        else if(obj.check(d4, d1, d2, d3, n))
        System.out.print("The number is a vampire number");
        else if(obj.check(d4, d1, d3, d2, n))
        System.out.print("The number is a vampire number");
        else
        System.out.print("The number is not a vampire number");
        sc.close();
    }
}