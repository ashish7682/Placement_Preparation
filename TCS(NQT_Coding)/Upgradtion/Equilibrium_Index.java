import java.util.*;
class Equilibrium_Index
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

        int leftsum[]=new int[n];
        int rightsum[]=new int[n];
        
        int sum1=0;
        for(int i=0;i<leftsum.length;i++)
        {
           leftsum[i]=sum1;
           sum1=sum1+a[i];
        }
        int sum2=0;
        for(int i=rightsum.length-1;i>=0;i--)
        {
           rightsum[i]=sum2;
           sum2=sum2+a[i];
        }
        for(int x:leftsum)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        for(int x:rightsum)
        {
            System.out.print(x+" ");
        }
        int ans=0;
        for(int i=0;i<n;i++)
        {
            if(leftsum[i]==rightsum[i])
            {
               ans=i;
               break;
            }
        }
        System.out.println();
        System.out.println(ans);

    }
}