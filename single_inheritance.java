class numbers
{
    int num[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
}


public class single_inheritance extends numbers
{
    void even_num()
    {
        int ev[]=new int[num.length/2];
        int count=0;
        for(int i=0;i<num.length;i++)
        {
            if(num[i]%2==0)
            {
                ev[count]=num[i];
                count+=1;
            }
        }
        System.out.println("even count:" +count);
        for(int i=0;i<ev.length;i++)
        {
            System.out.print(ev[i]+ " ");
        }
    }

    
    public static void main(String[] args) 
    {
        single_inheritance s1 = new single_inheritance();
        s1.even_num();
    }
}
