import java.util.*;
public class arrayduplicatecheck {
    public static void main(String[] args) {
        int a[]={1,12,3,4};
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            if(a[i]==a[i+1]){
                System.out.println("True");
                break;
            }
            else{
                System.out.println("False");
                break;
            }
        }
        
    }
}
