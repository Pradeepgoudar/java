import java.util.Scanner;

public class courierCharge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float weight= sc.nextFloat();
        float charge=0;
        if (weight<=5){
            charge=weight*6;
            System.out.println(charge);
        }
        else if (weight>5){
            charge=weight*(6+1.4f);
            System.out.println(charge);
        }
    }
}
