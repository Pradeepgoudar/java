import java.util.Scanner;

public class powerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x=sc.nextInt();
        System.out.println("Enter the exponent: ");
        int n=sc.nextInt();
        System.out.println(power(n,x));
    }

    public static int power(int n,int x){
        int m=1;
        for (int i=1;i<=n;i++){
            m=m*x;            //1*x*x.....up to n value
        }
        return m;
    }
}
