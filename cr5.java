package cristiano;

public class cr5 {
    public static void main(String[] args){
        int n=4;

       // int m=5;
        
    //     for(int i=1;i<=n;i++){
    //         for(int j=1; j<=m;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
   // hollow rectangle 
//    for(int i=1;i<=4;i++){
//     for(int j=1;j<=5;j++){
//         if(i==1||j==1||i==n||j==m){
//             System.out.print("*");
//         }
//         else{
//             System.out.print(" ");
//         }
//     }
//half pyramid
     for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
   }
}
}

