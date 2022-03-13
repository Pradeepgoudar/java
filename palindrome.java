import java.util.Scanner;
public class palindrome{
    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String rev="";
        int l=s.length();
        for(int i=l-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        if(s.toLowerCase().equals(rev.toLowerCase())){
            System.out.println(s+" is palindrome");
        }
        else{
            System.out.println(s+" is not palindrome");
        }

    }
}