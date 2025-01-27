import java.util.Scanner;
public class sessionq11 {
    public static void main(String[]args){
        Scanner v=new Scanner(System.in);
        int age=v.nextInt();
        System.out.println("enter the salary");
        long salary=v.nextLong();

        if(salary>=20000 || age<=25){
            System.out.println("loan eligible");
            int loan=v.nextInt();
            if(loan<=50000){
                System.out.println("eligible for loan");
            }
            else{
                System.out.println("maximum amount is 50000");
            }
        }
        else{
            System.out.println("loan not available");
        }
    }
}
