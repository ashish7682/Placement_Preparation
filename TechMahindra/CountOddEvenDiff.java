import java.util.*;
class CountOddEvenDiff
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        int even=0;
        int odd=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2!=0)
            {
                odd++;
            }else
            {
                even++;
            }
        }
        System.out.println(odd-even);
    }
}