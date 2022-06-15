import java.util.Scanner;

public class amstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem,res=0;
        int temp=n;
        while (temp!=0){
            rem=temp%10;
            temp=temp/10;
            res=res+(rem*rem*rem);

        }
       if (n==res){
           System.out.println("amStrong number");
       }
       else {
           System.out.println("not amStrong number");
       }
    }
}
