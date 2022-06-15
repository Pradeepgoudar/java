import java.util.Locale;

public class capitalizeFirstLetter {
    public static void main(String[] args) {
        String str="happy birthday bro";

        String []words=str.split("\\s");
        String s="";
        for (String w:words) {
            String first=w.substring(0,1);
            String rest=w.substring(1);
            s=s+first.toUpperCase(Locale.ROOT)+rest+" ";
        }
        System.out.println(s.trim());
    }
}
