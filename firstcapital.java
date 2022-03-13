import java.util.Scanner;
public class firstcapital{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.next();
        String output=str.substring(0,1).toUpperCase()+str.substring(1);    
        // substring(int startindex,int endindex)
        System.out.println(output);
    }
}