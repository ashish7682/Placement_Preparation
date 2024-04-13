import java.util.*;
class Matrix_Index_Position
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
               a[i][j]=sc.nextInt();
            }
        }
        int x=sc.nextInt();

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(a[i][j]==x)
                {
                    System.out.println("Element at {"+i+","+j+"} is "+ a[i][j]);
                    break;
                }
            }
        }
    }
}