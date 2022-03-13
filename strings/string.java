public class string{
    public static void main(String[] args){
        //number of words in a string
        String s="basic java tutorials";
        int l=s.length();  //length of the string
         System.out.println(l);
        int count=0;
        for(int i=1;i<l;i++){
            // if(s.charAt(i)==' ')  //for word count
            if(s.charAt(i)!=' ')   //for character count
                count++;
        }
        System.out.println(count+1);

        //print character of the strings
          for(int i=0;i<l;i++){
              System.out.print(s.charAt(i)+",");
          }
    }
}