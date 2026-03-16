public class Matrix_row_col_sum {
    public static void main(String[] args) {

        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};

        // Row Sum
        System.out.println("Row Sum:");
        for(int i=0;i<3;i++){
            int sum = 0;
            for(int j=0;j<a[i].length;j++){
                sum += a[i][j];
            }
            System.out.println("Row " + (i+1) + " = " + sum);
        }
        System.out.println("Column Sum:");
        for(int j=0;j<a[0].length;j++){
            int sum = 0;
            for(int i=0;i<a.length;i++){
                sum += a[i][j];
            }
            System.out.println("Column " + (j+1) + " = " + sum);
        }
    }
}