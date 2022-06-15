import java.util.Scanner;

public class max2OfTheArrray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array :");
        int size=sc.nextInt();
        int []arr=new int[size];
        System.out.println("enter the elements of the array :");
        for (int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        int temp=0;
        for (int i=0;i<size;i++){
            for (int j=i+1;j<size;j++){
                if (arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("the third large number is:"+arr[size-3]);
    }
}