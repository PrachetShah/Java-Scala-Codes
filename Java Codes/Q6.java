import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();
        Set<Integer> s = new LinkedHashSet<Integer>();
        for(int i=0;i<n;i++){
            System.out.print("Enter element "+(i+1)+" : ");
            s.add(sc.nextInt());
        }
        int i=1;
        while(true) {
            if(s.contains(i))
                i++;
            else{
                System.out.println("Smallest positive element not present is "+i);
                break;
            }
        }
    }
}