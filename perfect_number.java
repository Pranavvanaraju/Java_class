public class perfect_number {
    public boolean check(int num){
        if(num<=1){
            return false;
        }
        int sum=0;
        for(int i =1;i<num;i++)
        {
            if(num%i==0){
                sum=sum+i;
            }
        }
        return sum==num;
    }
    public static void main(String[] args) {
        perfect_number obj=new perfect_number();
        int num=29;
        if(obj.check(num)){
            System.out.println("It is perfect number");
        }
        else{
            System.out.println("It is not a perfect number");
        }

    }
}
