import java.util.Scanner;
public class comparison {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int b=sc.nextInt();

        System.out.println(d+b);

        if (d==b) {
            System.out.println("it is equal");
        } else {
            System.out.println("it is not eqaul");
        }
    }
}
