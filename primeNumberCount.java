public class primeNumberCount {
    public static void main(String[] args) {
     int n=100;
     for (int i=2;i<n;i++){
         int count =0;
         for (int j=2;j<=i-1;j++){
             if (i%j==0) {
                 count++;
             }
         }
         if (count==0){
             System.out.println(i+" ");
         }
     }
    }
}
