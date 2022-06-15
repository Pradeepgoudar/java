import java.util.Scanner;

public class sumOfDigits {
    public static String[]getInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        System.out.println("enter string into array");
        String []s=new String[n];
        for (int i=0;i<n;i++){
            s[i]=sc.next();
        }
        return s;
    }
    public static  void sum(){
        String []str=sumOfDigits.getInput();
        int sum=0;
        for (int i=0;i<str.length;i++){
            char []c=str[i].toCharArray();
            for (int j=0;j<c.length;j++){
                if (Character.isDigit(c[j])) {
                    sum += Integer.parseInt(c[j] + "");
                }
            }
        }
        System.out.println("sum is:"+sum);
    }
    public static void main(String[] args) {
        sumOfDigits.sum();
    }
}
