import java.util.Arrays;
// public class sort_with_loop {
//     public static void main(String[] args) {
//         int a[]={9,5,7,4,2,3};
//         int temp;
//         for(int i=0;i<a.length;i++){
//             for(int j=0;j<a.length;j++)
//             {
//                 if(a[i]<a[j]){
//                     temp=a[i];
//                     a[i]=a[j];
//                     a[j]=temp;
//                     System.out.println(Arrays.toString(a));

//                 }
//             }
//         }
//         System.out.println("Final sorted array:"+Arrays.toString(a));
//     }
// }
public class sort_with_loop{
    public static void main(String[] args) {
        int a[]={9,8,74,1,5,3};
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}