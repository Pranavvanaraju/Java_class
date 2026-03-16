public class spiral {
    public static void main(String[] args) {

        int a[][]={{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0;i<3;i++)      // top row
            System.out.print(a[0][i]+" ");

        for(int i=1;i<3;i++)      // right column
            System.out.print(a[i][2]+" ");

        for(int i=1;i>=0;i--)     // bottom row
            System.out.print(a[2][i]+" ");

        for(int i=1;i>0;i--)      // left column
            System.out.print(a[i][0]+" ");

        System.out.print(a[1][1]); // center
    }
}
