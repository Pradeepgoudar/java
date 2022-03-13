public class matrix{
    public static void main(String []args){
        int [][]arr={{2,3,4},{5,3,2},{5,6,7}};
        int n=arr.length;
        for(int i=0;i<n;i++){
        int rowsum=0; int colsum=0;
            for(int j=0;j<n;j++){
                rowsum=rowsum+arr[i][j];
                colsum=colsum+arr[j][i];
            }
            System.out.println("sum of row "+i+" :"+rowsum);
        System.out.println("sum of column "+i+" :"+colsum);
        }

        //sum of diagonal elements
        int diagonalsum=0, oppdiag=0;
        for(int i=0;i<n;i++){
            diagonalsum=diagonalsum+arr[i][i];
            oppdiag=oppdiag+arr[i][n-i-1];
        }
        System.out.println("daigonal sum:"+diagonalsum);
        System.out.println("opposite diagonal sum:"+oppdiag);

        //sum of two matrix
        int [][]arr2={{1,2,3},{2,3,4},{4,5,6}};
        int [][]result={{0,0,0},{0,0,0},{0,0,0}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr2.length;j++){
                result[i][j]=arr[i][j]+arr2[i][j];
            System.out.print(result[i][j]+" ");
            }
        }
    }
}