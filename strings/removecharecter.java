public class removecharecter{
    public static void main(String [] args){
        String str="halloween";
        int l=str.length();
        //remove 1st character of the string
        String output=str.substring(1);
        System.out.print(output+"\n");
        //remove last character of the string
        String out=str.substring(0,l-1);
        System.out.print(out+"\n");
        // remove both 1st and last character
        String outt=str.substring(1,l-1);
        System.out.print(outt+"\n");
        //capitalize 1st charecter
        String c=str.substring(0,1).toUpperCase()+str.substring(1);
        System.out.print(c+"\n");
        //capitalize entire string
        String d= str.toUpperCase();  //use .toLowerCase for low case letters
        System.out.print(d+"\n");
        //print 1st and last character
        String f=str.substring(0,1)+str.substring(l-1);
        System.out.print(f+"\n");
        //string concat
        String str2=str.concat(" event");
        System.out.print(str2);
    }
}

