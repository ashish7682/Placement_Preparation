import java.util.*;
class Maximum_Car
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int a[][]=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int max=0;
        int result=0;
        for(int i=0;i<row;i++)
        {
            int count=0;
            for(int j=0;j<col;j++)
            {
                if(a[i][j]==1)
                {
                    count++;
                }
            }
            if(count>max)
            {
                max=count;
                result=i+1;
            }
        }
        System.out.println(result);
    }
}