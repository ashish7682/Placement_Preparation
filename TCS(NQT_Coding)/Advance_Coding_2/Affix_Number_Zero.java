import java.util.*;
class Affix_Number_Zero
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int maxLen=Math.max(Integer.toString(m).length(),Integer.toString(n).length());

        for(int i=m;i<=n;i++)
        {
            String formatNumber=String.format("%0"+maxLen+"d",i);
            System.out.print(formatNumber+" ");
        }
    }
}