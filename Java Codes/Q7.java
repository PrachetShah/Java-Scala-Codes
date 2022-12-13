import java.util.*;

class Q7{
    public static void main(String[] args) {
        int shift = 3;
        Scanner s = new Scanner(System.in);
        String data = "abcdefghijklmnopqrstuvwxyz";
        System.out.print("Enter Plain Text: ");
        String arr = s.nextLine();
        String ans = "";
        for(int i=0; i<arr.length(); i++){
            int idx = data.indexOf(arr.charAt(i));
            ans += data.charAt((idx+shift)%26);
        }
        System.out.println("Encrypted text: "+ ans);
        s.close();
    }
}