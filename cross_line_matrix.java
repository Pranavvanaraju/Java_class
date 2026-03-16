// public class cross_line_matrix {
//     public static void main(String[] args) {
//         int a[][] = {{1,5,3},{1,5,2},{9,1,2}};
//         for(int i=0;i<a.length;i++){
//             System.out.print(a[i][a.length-1-i] +" ");
//         }
//     }
// }

//Sum of primary diagnol
public class cross_line_matrix {
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int sump=0;
        int sums=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(i==j){
                    sump+=a[i][j];
                }
            }
        }
        System.out.println("Sum of primary diagnol= " + sump);

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(j==a.length-1-i){
                    sums+=a[i][j];
                }
            }
        }
        System.out.println("Sum of secondary diagnol= " + sums);

        int diff=sump-sums;
        System.out.println("The diff between principal and seconday diagnol=" +diff);


    }
}
