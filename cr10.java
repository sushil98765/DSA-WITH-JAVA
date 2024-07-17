package cristiano;
import java.util.*;
public class cr10 {
    public static void main (String[] args){
        // int [] marks=new int[3];
        //  marks[0]=97;
        //  marks[1]=81;
        //  marks[2]=45;
        // int[] marks={97,45,67};
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] numbers=new int[size];
        

        for(int i=0;i<size; i++){
            numbers[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        
        for(int i=0; i<numbers.length;i++){
            if(numbers[i]==x){
                System.out.println("jjjjjj");
            }
        }

    }
}