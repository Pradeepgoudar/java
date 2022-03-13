import java.util.Scanner;
public class pattern{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter the value of n:");
        int n=sc.nextInt();
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                // System.out.print("");
                System.out.print(" ");
            }
            for(int k=2*i;k<n;k++){
                System.out.print("*");
            }
             System.out.println();
        }
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                // System.out.print(" ");
                System.out.print(" ");
            }
            for(int k=n;k>2*i;k--){
                System.out.print("*");
            }
             System.out.println();
        }

          for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                // System.out.print(" ");
                System.out.print(" ");
            }
            for(int k=i;k<n;k++){
                System.out.print("* ");
            }
             System.out.println();
        }
        // // pyramid reverse
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=n;k>i;k--){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
    }
}