public class array{
    public static void main(String[] args){
        int []a={1,3,555,77,9,7};
        int max=Integer.MIN_VALUE;
        for(int e:a){
           if(e>max)
            max=e;
        }
        System.out.println(max);

         int min=Integer.MAX_VALUE;
        for(int e:a){
           if(e<min)
            min=e;
        }
        System.out.println(min);
    }
}