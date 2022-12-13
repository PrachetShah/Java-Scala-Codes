import java.util.*;

class Q1{
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Quantity: ");
        int quantity = s.nextInt();
        double price = quantity*100;
        if(quantity>1000){
            price = price - (price*0.1);
        }
        System.out.println("Price of products is: "+price);
    }
}