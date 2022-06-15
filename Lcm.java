import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a= sc.nextInt();
        System.out.println("enter the value of b");
        int b= sc.nextInt();
        int lcm;
        if (a>b){
            lcm=a;
        }
        else {
            lcm=b;
        }
        while (true){
            if (lcm%a==0 && lcm%b==0){
                break;
            }
            lcm++;
        }
        System.out.println(lcm);
    }
}
