package cristiano;

import java.util.*;

public class cr14 {
    static int factorial(int n){
        if(n==0|| n==1){
            return 1;
        } 
        else{
            return n*factorial(n-1);

        }
    }
    static int iter(int n){
        if(n==0|| n==1){
            return 1;
        } 
        else{
            int product=1;
            for(int i=1;i<=n;i++){
                product *=i;

            }

            return product;

        }
    }

    
    public static void main(String[] args){
       // int x=0;
        System.out.println(factorial(4));
        System.out.println(iter(4));
        
   
}
}




nmnmnnmnmnmnmnmhjhjyuyuyuyuhjnmnmhjyuyuhjnmyuhjnmyuhjnmyuhjnmyuhjmrtfgrtfgrtfgyuyurtfgvbvbxsxswwsxedcp