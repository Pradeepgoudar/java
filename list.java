import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class list {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for (int i=0;i<size;i++){
            a.add(sc.nextInt());
        }
        Collections.sort(a);
        System.out.println(a);
        int c=a.get(size-3);
        System.out.println(c);
    }
}
