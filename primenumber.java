import java.util.Scanner;
public class primenumber{
    public static void main(String []args){
        boolean isprime=true;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<n/2;i++){
            if(n%i==0){
               isprime=false;
               break;
            }
        }
        if(isprime){
                 System.out.println(n+" is prime number");
        }
        else{
             System.out.println(n+" is not a prime number");
        }
    }
}