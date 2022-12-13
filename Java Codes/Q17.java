import java.util.*;

class Movie extends Thread{
    int vacant = 3, required;
    Movie(int x){
        required = x;
    }
    public synchronized void run(){
        if(vacant >= required){
            System.out.println("Ticket Booked for: "+Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
            vacant -= required;
        }
        else{
            System.out.println("Housefull " + Thread.currentThread().getName());
        }
    }
}

class Q17{
    public static void main(String[] args) {
        Movie m = new Movie(2);
        Thread t1 = new Thread(m);
        Thread t2 = new Thread(m);
        t1.setName("Prachet");
        t2.setName("XYZ");
        t1.start();
        t2.start();
    }
}