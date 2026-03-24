class Pattern
{
    Pattern(){

        int rows=5;
        int cols=5;

        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=cols;j++)
            {
                if(i==1||i==3||j==1||(j==5&&i==2))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

public class name_pattern {
    public static void main(String[] args) {

        Pattern p = new Pattern();

    }
}

// Pranav,