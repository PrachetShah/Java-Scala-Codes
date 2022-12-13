import java.util.*;

class Q2 {
    public static void main(String[] args) {
        int arr[] = {4, 3, 1, 5, 2};
        int max=arr[0], min=arr[0], sum=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
            sum += arr[i];
        }
        System.out.println("Max Value of Summing 4: "+Integer.toString(sum-min));
        System.out.println("Min Value of Summing 4: "+Integer.toString(sum-max));
    }
}
