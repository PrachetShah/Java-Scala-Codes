import java.util.*;

class Q4{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Numbers for Array: ");

        String strArr[] = s.nextLine().split(" ");
        List<Integer> arr = new ArrayList<Integer>();

        for(String a: strArr){
            arr.add(Integer.parseInt(a));
        }

        System.out.println("Which Operation to be performed:\n1.Search Element\n2.Sort in Decreasing\n3.Delete Duplicate Element");
        System.out.print("Enter Choice: ");
        int choice = s.nextInt();

        switch(choice){
            case 1:
            System.out.print("Enter Number to be Searched: ");
            int num = s.nextInt();
            if(arr.indexOf(num)==-1){
                System.out.println("Not Found");
            }else{
                System.out.println("Number found at "+ arr.indexOf(num));
            }
            break;

            case 2:
            arr.sort(Comparator.reverseOrder());
            System.out.println("Sorted Array: ");
            for(int a: arr){
                System.out.print(a + " ");
            }
            break;

            case 3:
            Set<Integer> x = new HashSet<>();
            x.addAll(arr);
            System.out.println("Duplicate Elements Removed");
            for(int a: x){
                System.out.print(a + " ");
            }
            break;

            default:
            break;
        }
        s.close();
    }
}
