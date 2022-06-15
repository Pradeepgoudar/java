import java.util.Scanner;

public class numberOfWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        char ch[]=str.toCharArray();
        int count=0;
        for (int i=0;i<ch.length;i++){
            if (ch[i]==' '&&ch[i+1]!=' '){
                count++;
            }
        }
        System.out.println("Number of words present in the string :"+(count+1));
    }
}
