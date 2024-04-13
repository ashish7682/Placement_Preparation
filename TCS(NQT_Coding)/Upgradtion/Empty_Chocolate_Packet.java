import java.util.*;
class Empty_Chocolate_Packet
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
        int b[]=new int[n];
        int k=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=0)
            {
                b[k]=a[i];
                k++;
            }
        }
        for(int num:b)
        {
            System.out.print(num+" ");
        }
    }
}