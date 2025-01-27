import java.util.Scanner;
public class evenodd {
    public static void main(String [ ] args){
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        if (v%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
