
import java.util.Scanner;

public class evenOddInArray {
    public static void main(String[] args) {
        //count even and odd in an array
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[8];
        int even=0,odd=0;
        System.out.println("enter array elements");
        for (int i=0;i<8;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<8;i++){
            if (arr[i]%2==0){
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println("even numbers:"+even+", odd numbers:"+odd);
    }
}
