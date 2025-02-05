import java.util.Scanner;
public class counteven {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the start number:");
        int start=sc.nextInt();
        System.out.println("enter the end number:");
        int end=sc.nextInt();
        int num=start;
        int count=0;
        while(num<=end){
            if(num%2==0){
                count++;
            }
       num++; }
        System.out.println("count of even:"+count);
    }
}
