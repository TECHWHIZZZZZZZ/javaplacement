import java.util.Scanner;

public class divisibility {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        if(d%3==0 && d%5==0){
            System.out.println("number is divisible by 3 and 5");
        }
        else{
            System.out.println("number is not divisible by 3 and 5");
        }
    }
}

