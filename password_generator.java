import java.util.Random;

public class password_generator {
    static char[] password(int len){
        System.out.println("generating password...");
        String s="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String l="abcdefghijklmnopqrstuvwxyz";
        String numbers="0123456789";
        String symbol="<>+@#$%^&*!?/";
        String values=s+l+numbers+symbol;

        Random random=new Random();
        char[] pass=new char[len];
        for (int i=1;i<len;i++){
            pass[i]=values.charAt(random.nextInt(values.length()));
        }
        return pass;
    }
    public static void main(String[] args) {
        int len=10;
        System.out.println("your password is-"+password(len)+"]");
    }
}
