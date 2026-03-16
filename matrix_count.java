public class matrix_count {
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,-5,6},{7,8,9}};
        int ec=0;
        int  oc=0;
        int pc=0;
        int nc=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]>=0){
                    pc++;}
                else{
                    nc++;
                }
                
            }
        }
        System.err.println("even count--" +pc);
        System.out.println("odd count--" +nc);
    }
}
