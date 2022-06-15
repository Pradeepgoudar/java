public class longestString {
    public static void main(String[] args) {
        String [] arr={"cow","moneyHeist","blackCat","treeOfGoldenTreasure"};
        String s=longest(arr);
        System.out.println(s);
    }
    public static String longest(String[] array){
        int max=0;
        String longer=null;
        for (String s:array) {
            if (s.length()>max){
                max=s.length();
                longer=s;
            }
        }
        return longer;
    }
}
