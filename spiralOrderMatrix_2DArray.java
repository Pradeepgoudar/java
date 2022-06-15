import java.util.Scanner;

public class spiralOrderMatrix_2DArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int matrix[][]=new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                matrix [i][j]=sc.nextInt();
            }
        }
        int row_start=0;
        int row_end=n-1;
        int col_start=0;
        int col_end=m-1;

       /* . First of all, we will traverse in the row row_start from column_start
        to column_end and we will increase the row_start with 1 as we have
        traversed the starting row.
        3. Then we will traverse in the column column_end from row_start to
        row_end and decrease the column_end by 1.
        4. Then we will traverse in the row row_end from column_end to
        column_start and decrease the row_end by 1.
        5. Then we will traverse in the column column_start from row_end to
        row_start and increase the column_start by 1.
        6. We will do the above steps from 2 to 5 until row_start <= row_end
        and column_start <= column_end.
*/

        while (row_start<=row_end&&col_start<=col_end) {

            for (int col = col_start; col <= col_end; col++) {
                System.out.print(matrix[row_start][col]+" ");
            }
            row_start++;
            for (int row=row_start;row<=row_end;row++){
                System.out.print(matrix[row][col_end]+" ");
            }
            col_end--;
            for (int col=col_end;col>=col_start;col--){
                System.out.print(matrix[row_end][col]+" ");
            }
            row_end--;
            for (int row=row_end;row>=row_start;row--){
                System.out.print(matrix[row][col_start]+" ");
            }
            col_start++;
        }
        System.out.println();
    }
}
