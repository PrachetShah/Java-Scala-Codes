import java.util.*;

class Q3{
    public static void main(String  []args){
        float DA,HRA,PF,gr_sal,net_sal;
        float CCA=240f,PT=100f;
    
    
        Scanner a= new Scanner(System.in);
        System.out.print("Enter EmpName: "); 
        String w=a.nextLine();

        System.out.print("Enter EmpID: ");
        int r=a.nextInt();

        System.out.print("Enter Basic Salary: ");
        float f=a.nextFloat();

        DA=(0.5f)*f;
        HRA=(0.25f)*f;
        PF=(0.1f)*f;
        
        gr_sal=(f + DA + HRA);
        net_sal=(gr_sal - CCA - PT - PF);
 
        System.out.println("\n"+ w + " Income");
        System.out.println("Gross Salary(basic + HRA + other allowances) : " + gr_sal);
        System.out.println("Net Salary(Gross Salary - all tax deductions) : " + net_sal);
    }
}