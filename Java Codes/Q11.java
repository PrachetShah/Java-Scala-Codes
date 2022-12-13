import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String s = sc.nextLine();
        int vow=0, con=0, dig=0, sp=0, n=s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch==' ')
            sp++;
            else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                ch=Character.toLowerCase(ch);
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                vow++;
                else
                con++;
            }
            else if(ch>='0' && ch<='9')
            dig++;
        }
        System.out.println("Alphabets: " + (vow+con));
        System.out.println("Digit: " + dig);
        System.out.println("Special Character: " + (n-vow-con-sp-dig));
        System.out.println("Space: " + sp);
        System.out.println("Words: " + (sp+1));
		System.out.println("Vowels: " + vow);
		System.out.println("Consonant: " + con);
    }
}