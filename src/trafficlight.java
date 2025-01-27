import java.util.Scanner;
public class trafficlight {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String r=sc.nextLine();

        if(r.equals("red")){
            System.out.println("stop");
        }
        else if(r.equals("yellow")){
            System.out.println("get ready");
        }
        else if(r.equals("green")){
            System.out.println("go!");
        }

    }
}
