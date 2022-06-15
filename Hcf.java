import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int hcf=a;
        while (true){
            if (a%hcf==0 && b%hcf==0){
                break;
            }
            else{
                hcf--;
            }
        }
        System.out.println("hcf is :"+hcf);
    }
}
