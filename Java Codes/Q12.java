import java.util.Scanner;
import java.util.Vector;

public class Q12 {
    static void printVector(Vector <String> v, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(v.get(i)+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Vector<String> v = new Vector<>();
        System.out.print("Enter size of list : ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element "+(i+1)+" : ");
            v.add(sc.next());
        }
        System.out.print("Enter element to be inserted : ");
        String e=sc.next();
        System.out.print("Enter position : ");
        int p=sc.nextInt();
        System.out.println("The list is : ");
        v.insertElementAt(e, p);
        n++;
        printVector(v,n);
        System.out.print("Enter element to be deleted : ");
        String d=sc.next();
        v.remove(d);
        n--;
        printVector(v,n);
    }
}