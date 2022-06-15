import java.util.Scanner;

public class quotient_reminder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int numerator=sc.nextInt();
        int denominator=sc.nextInt();
        int quotient=numerator/denominator;
        int reminder=numerator%denominator;
        System.out.println("quotient :"+quotient+" reminder:"+reminder);
    }
}
