import java.util.Scanner;

public class array_2D_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][4];
        for (int j=0;j<arr.length;j++){
            for (int i=0;i<arr[j].length;i++){
                System.out.println("enter the salary of company:"+j+":and employee:"+i);
                arr[j][i]=sc.nextInt();
            }
        }
        for (int j=0;j<arr.length;j++){
            System.out.println("the salary of company: "+j);
            for (int i=0;i<arr[j].length;i++){
                System.out.print(arr[j][i]+",");
            }
        }
    }
}
