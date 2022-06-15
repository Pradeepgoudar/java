import java.util.Scanner;

public class simple_calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("choose 1 for addition: ");
        System.out.println("choose 2 for subtraction: ");
        System.out.println("choose 3 for multiplication: ");
        System.out.println("choose 4 for division: ");
        System.out.println("choose 5 for reminder: ");
        int n=sc.nextInt();
        float res=0;
        float a,b;
        switch (n){
            case 1:
                System.out.println("enter any two numbers:");
                 a=sc.nextInt();
                 b=sc.nextInt();
                res=a+b;
                break;
            case 2:
                System.out.println("enter any two numbers:");
                 a=sc.nextInt();
                 b=sc.nextInt();
                res=a-b;
                break;
            case 3:
                System.out.println("enter any two numbers:");
                a=sc.nextInt();
                b=sc.nextInt();
                res=a*b;
                break;
            case 4:
                System.out.println("enter any two numbers:");
                a=sc.nextInt();
                b=sc.nextInt();
                if (n!=0) {
                   res=a/b;
                }else {
                    System.out.println("invalid number");
                }
                break;
            case 5:
                System.out.println("enter any two numbers:");
                a=sc.nextInt();
                b=sc.nextInt();
                if(b==0){
                    System.out.println("Invalid number");
                }
                else{
                    res=a%b;
                }
                break;
        }
        System.out.println(res);
    }
}
