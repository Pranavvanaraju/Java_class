public class commonelements {
    public static void main(String[] args) {
        int a[]={1,2,3};
        int b[]={1,4,3};
        int [] c= new int[3];
        int k=0;

        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    c[k]=a[i];
                    k++;
                    break;

                }
            }
        }
        for(int i=0;i<k;i++){
            System.out.print( c[i] +" ");
        }
    }
}
