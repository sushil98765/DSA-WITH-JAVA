package cristiano;
import java.util.*;

public class cr8 {
    public static int calculate(int a, int b){
        //int sum=a+b;
        return a*b;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        //int sum= calculate(a,b );
        System.out.println("mul of two numbers "+calculate(a,b));

    }

    
}
