public class pyramid {
    public static void main(String[] args) {
        int n = 4;
        for(int i = n; i >= 1; i--) {
            for(int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= (2*i - 1); k++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}