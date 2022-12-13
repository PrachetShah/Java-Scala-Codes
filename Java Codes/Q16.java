import java.util.*;

public class Q16 {
    public static void main(String[] args) {
        int valid=0, invalid=0;
        for(int i=0; i<3; i++){
            try{
                int num = Integer.parseInt(args[i]);
                valid++;
            }catch(NumberFormatException e){
                invalid++;
            }
        }
        System.out.println("Number of Valid: "+valid);
        System.out.println("Number of invalid: "+invalid);
    }
}
