import java.util.Scanner;

public class removeCharFromString {
    public static void main(String[] args) {
//        StringBuilder sb=new StringBuilder(7);
//        sb.append("hello");
//       sb.deleteCharAt(4);
//       sb.deleteCharAt(0);
//        System.out.println(sb);

        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
//        String str=s.replaceAll(" ","");
//        System.out.println(str);
        char c[]=s.toCharArray();
//        c[0]=s.toUpperCase().charAt(0);//to capitalize
        for (int i=1;i<n;i++){ //just change the i value if i =1 removes 1st character
            System.out.print(c[i]);
        }
    }
}
