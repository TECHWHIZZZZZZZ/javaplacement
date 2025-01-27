import java.util.Scanner;
public class Userinput {
    public static void main(String []args){

        Scanner shenba =new Scanner(System.in);

        int sh =shenba.nextInt();


        double ra =shenba.nextDouble();
        float m=shenba.nextFloat();

        double s =ra+sh+m;


        System.out.print("addition:"+s);
shenba.nextLine();
        String v= shenba.nextLine();
        shenba.nextLine();
        String h= shenba.nextLine();
        String c=h+v;
        System.out.print("string:"+c);
    }

}
