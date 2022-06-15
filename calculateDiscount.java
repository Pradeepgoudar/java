import java.util.Scanner;

public class calculateDiscount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int price=sc.nextInt();
        float discount=0;
        if (price>0&&price<=800){
            System.out.println("no discount");
        }
        else if (price>800 && price<=1500){
            discount=price*0.10f;
            System.out.println(price-discount);
        }
        else if (price>1500 && price<=2500){
            discount=price*0.15f;
            System.out.println(price-discount);
        }
        else if(price>2500 && price<=5000){
            discount=price*0.20f;
            System.out.println(price-discount);
        }
        else {
            discount=price*0.30f;
            System.out.println(price-discount);
        }
    }
}
