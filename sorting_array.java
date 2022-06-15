public class sorting_array {
    public static void main(String[] args) {
    int a[]={1,4,-6,3,-2,5,2,0,0};
    int n=a.length;
    int temp=0;
    //sorting an array
    for (int i=0;i<n;i++){
        for (int j=i+1;j<n;j++){
//            if (a[i]>a[j])//ascending order
            if (a[j]>a[i]){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
            System.out.print(a[i]+",");
    }
   }
}
