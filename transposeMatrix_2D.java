import java.util.Scanner;

public class transposeMatrix_2D {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        System.out.println("enter the value of m");
        int m=sc.nextInt();
        int matrix[][]=new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
            for (int j=0;j<m;j++) {
                for (int i=0;i<n;i++){
                    System.out.print(matrix[i][j]+" ");
            }
                System.out.println();
        }
    }
}
