class numbers 
{
    int num[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
}
class single extends numbers
{
    int even[]=new int[num.length/2];
    void even_num()
    {
        int count=0;
        for(int i=0;i<num.length;i++)
        {
            if(num[i]%2==0)
            {
                even[count]=num[i];
                count+=1;
            }
        }
        for (int i=0;i<even.length;i++)
        {
            System.out.print(even[i]+" ");
        }
    }
    
}
public class multilevel extends single 
{
    int odd[]=new int[num.length/2];
    void odd_num()
    {
        int count=0;
        for(int i=0;i<num.length;i++)
        {
            if(num[i]%2!=0)
            {
                odd[count]=num[i];
                count+=1;
            }
        }
        for (int i=0;i<odd.length;i++)
        {
            System.out.print(odd[i]+" ");
        }
    }
    public static void main(String[] args) 
    {
        multilevel m1 = new multilevel();
        m1.even_num();
        System.out.println();
        m1.odd_num();

    }
}
