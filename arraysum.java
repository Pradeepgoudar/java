public class arraysum{
    public static void main(String [] args){
        int []arr={2,3,4,5,6};
        int n=arr.length;
        int sum=0;
        int avg=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        avg=sum/n;
        System.out.println(sum);
        System.out.println(avg);
    }
}