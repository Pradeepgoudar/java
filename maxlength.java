public class maxlength{
    public static String longString(String []array){
        String longstring=null;
        int maximum=0;
        for(String s:array){
            if(s.length()>maximum){
                maximum=s.length();
                longstring=s;
            }
        }
        return longstring;
    }
    public static void main(String[] args){
        String[] str={"big bird","how are you","well done"};
        String longstring=longString(str);
        System.out.println("longest string:"+longstring);
    }
}