import java.util.Random;

public class otp {
    static char[] gen_otp(int len){
        System.out.println("generating otp...");
        System.out.println("Your otp is:");
        String s="0123456789";
        Random random=new Random();
        char[] value=new char[len];
        for (int i=0;i<len;i++){
           value[i]=s.charAt(random.nextInt(value.length));
        }
        return value;
    }
    public static void main(String[] args) {
        int len=4;
        System.out.println(gen_otp(len));
    }
}