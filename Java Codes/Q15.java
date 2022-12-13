import java.util.Scanner;
 
class MarksOutOfBoundsException extends Exception {
    public MarksOutOfBoundsException(String S) {
        super(S);
    }
}
 
public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        getResult(sc);
        sc.close();
    }
 
    static void getResult(Scanner sc) {
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter seat number");
        int seatNum = sc.nextInt();
        System.out.println("Enter date");
        int date = sc.nextInt();
        System.out.println("Enter center number");
        int centerNum = sc.nextInt();
        System.out.println("Enter marks");
        try {
            int marks = sc.nextInt();
            if (marks < 0 || marks > 100) {
                throw new MarksOutOfBoundsException("Error: Marks out of range");
            }
        } catch (MarksOutOfBoundsException e) {
            System.out.println(e.getMessage());
            getResult(sc);
        }
        System.out.println("-------RESULT-------");
        System.out.println("Name: " + name);
        System.out.println("Seat number: " + seatNum);
        System.out.println("Date: " + date);
        System.out.println("Center number: " + centerNum);
    }
}
