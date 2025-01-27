import java.util.Scanner;

public class sessionq9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long income=sc.nextLong();
        if(income>7000){
            System.out.println("scholarship is available");
        }
        else{
            System.out.println("not eligible for the scholarship");
        }
    }
}
