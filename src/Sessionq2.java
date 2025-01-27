import java.util.Scanner;
public class Sessionq2 {
    public static void main(String[] args) {

        Scanner shenba = new Scanner(System.in);
        int b = shenba.nextInt();
        int a = shenba.nextInt();
        int c = shenba.nextInt();
        int d = a * b * c;

        int e = a + b + c;

        System.out.println("multiplication " + d);

        System.out.println("division " + d/e);

    }
}