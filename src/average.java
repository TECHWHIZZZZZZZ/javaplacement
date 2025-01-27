import java.util.Scanner;
public class average {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        int s=a+b+c+d+e/50;
        System.out.println(s);
        if (a<35){
            System.out.println("additional class required");
        }
        else{
            System.out.println("you are good to go");
        }
    }
}
