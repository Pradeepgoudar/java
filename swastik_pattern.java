public class swastik_pattern {
    public static void main(String[] args) {
        int n=11;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i==(n+1)/2||j==(n+1)/2||i==1&&j>=(n+1)/2||
                        i<=(n+1)/2&&j==1||i==n&&j<=(n+1)/2||i>=(n+1)/2&&j==n) {
                    System.out.print(" *");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
