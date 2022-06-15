import java.io.IOException;

public class sutdown {
    public static void main(String[] args) {
        Runtime runtime=Runtime.getRuntime();
        try{
            System.out.println("shutting down the pc after 5 seconds");
            runtime.exec("shutdown -s -t 5");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
