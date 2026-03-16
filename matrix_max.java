public class matrix_max {
    public static void main(String[] args) {
        int a[][] = {{1,5,3},{1,5,2},{9,1,2}};
        int max=a[0][0];
        int min=a[0][0];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]> max){
                    max=a[i][j];
                }
            }
        }
        System.out.println("max = " +max);

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]< min){
                    min=a[i][j];
                }
            }
        }
        System.out.println("min = " +min);
    }
}
