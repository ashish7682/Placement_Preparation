import java.util.*;
class NumberOf_Handshake
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int res= n * (n-1)/2;
            System.out.println(res);
        }
    }
}