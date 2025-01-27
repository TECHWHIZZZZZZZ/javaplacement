import java.util.Scanner;

public class sessionq5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        double d = obj.nextDouble();
        obj.nextLine();
        String j = obj.nextLine();
        System.out.println("my name is " + s +".G");
        System.out.println("my score is " + d/10 +"/10");
        System.out.println("my department is " + j +"(AIML)");
    }
}

