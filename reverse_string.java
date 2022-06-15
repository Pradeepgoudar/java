public class reverse_string {
    public static void main(String[] args) {
        String s="raduog peedarp";
        int n=s.length();
        char []c=s.toCharArray();
        int count=0;
        for (int i=n-1;i>=0;i--){
            System.out.print(c[i]);
            count++;
        }
        System.out.println();
        System.out.println("number of char in the string:"+count);
    }
}
