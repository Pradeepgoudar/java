import java.util.Scanner;

public class array_3D {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[][][]=new int[3][2][2];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                for (int k=0;k<arr[j].length;k++){
                    System.out.println("enter the company:"+i+": ,branch :"+j+": and salary of employee :"+k);
                    arr[i][j][k]=sc.nextInt();
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.println("the company :"+i);
            for (int j=0;j<arr[i].length;j++){
                System.out.println("the branch:"+j);
                for (int k=0;k<arr[j].length;k++){
                    System.out.print("salary of employee "+ k +"is :"+arr[i][j][k]+",");
                    System.out.println();
                }
            }
        }
    }
}
