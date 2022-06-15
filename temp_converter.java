import java.util.Scanner;

public class temp_converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        float f=sc.nextFloat();
//        float c=(f-32f)*5f/9f;
//        System.out.println(c);

        // celsius to Fahrenheit
        float c=sc.nextFloat();
        float f=(9f/5f)*c+32f;
        System.out.println(f);
    }
}
