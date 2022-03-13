import java.util.Scanner;
public class reversestring{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
            String s=sc.next();
            char [] arr=s.toCharArray();
            for(int i=arr.length-1;i>=0;i--){
                System.out.print(arr[i]);
            }
        
    }
}