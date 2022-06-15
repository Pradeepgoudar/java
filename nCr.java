import java.util.Scanner;

public class nCr {
    public static int fact(int num){
        int fact=1;
        for (int i=1;i<=num;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,r,ncr;
        System.out.println("enter the value of n:");
        n=sc.nextInt();
        System.out.println("enter the value of r:");
        r=sc.nextInt();

        ncr=(fact(n))/(fact(r)*fact(n-r));
        System.out.println("ncr is:"+ncr);
    }
}
