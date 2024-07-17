package cristiano;
import java.util.Scanner;
public class cr9 {
    public static void Fact(int n){
        if(n<0){
            System.out.println("Invalid");
            return;
        }
        int factorial=1;
        for( int i=n; i>=1;i--){
            factorial=factorial*i;
        }
        System.out.println(factorial);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Fact(n);
    }
    
}
