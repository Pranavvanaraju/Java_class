class numbers 
{
    int num[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
}
class prime extends numbers
{
    int p_num[]=new int[num.length];
    void prime_num()
    {
        int pos=0;
        for(int i=0;i<num.length;i++)
        {
            
            int count=0;
            for (int j=2;j<num[i];j++)
            {
                if(num[i]%j==0)
                {
                    count++;
                }
            }
            if(count==0)
            {
                p_num[pos]=num[i];
                pos+=1;
            }
        }
    }
    void display()
    {
        for(int i=0;i<p_num.length;i++)
        {
            System.err.print(p_num[i]+" ");
        }
    }
}
class composite extends numbers
{
    int c_num[]=new int[num.length];
    void composite_num()
    {
        int pos=0;
        for(int i=0;i<num.length;i++)
        {
            
            int count=0;
            for (int j=2;j<num[i];j++)
            {
                if(num[i]%j==0)
                {
                    count++;
                }
            }
            if(count!=0)
            {
                c_num[pos]=num[i];
                pos+=1;
            }
        }
    }
    void display()
    {
        for(int i=0;i<c_num.length;i++)
        {
            System.err.print(c_num[i]+" ");
        }
    }
}
public class hierarchical 
{
    public static void main(String[] args) 
    {
        prime p = new prime();
        p.prime_num();
        p.display();
        composite c = new composite();
        c.composite_num();
        c.display();
    }    
}
