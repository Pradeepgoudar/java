
//sum of diagonal elements
public class matrix {
    public static void main(String[] args) {
        int [][]arr={{2,3,4,1},
                     {5,3,2,3},
                     {5,6,7,3},
                     {2,5,8,1}};
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i][i]+arr[i][n-i-1];
        }
        System.out.println(sum);
    }
}
