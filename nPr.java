import java.util.Scanner;

public class nPr {
    public static int fact(int num){
        int fact=1;
        for (int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,r,npr;
        System.out.println("enter the value of n:");
        n= sc.nextInt();
        System.out.println("enter the value of r:");
        r=sc.nextInt();
        npr=(fact(n))/(fact(n-r));
        System.out.println("npr is:"+npr);
    }
}
