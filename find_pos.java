public class find_pos {
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int flag=0;
        int key=5;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]==key){
                    System.out.println("Element found at "+i+ "," +j);
                    flag=1;
                }
            }
        }
        if(flag==0){
            System.out.println("element not found");
        }
    }
}
