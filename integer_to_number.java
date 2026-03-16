public class integer_to_number {

    public static String check(int num){

        int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romans={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        String res ="";

        for(int i=0;i<values.length;i++){
            while(num>=values[i]){
                res=res+romans[i];
                num=num-values[i];
            }
        }

        return res;
    }

    public static void main(String[] args) {

        int num=12;

        System.out.println("The roman number is " + check(num));
    }
}