import java.util.*;
class Number_Affix_Zero
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int length=0;
        if(m>n)
        {
            String s=Integer.toString(m);
            length=s.length();
        }else
        {
            String s=Integer.toString(n);
            length=s.length();
        }
        for(int i=m;i<=n;i++)
        {
            String s1=Integer.toString(i);
            StringBuilder sb=new StringBuilder(s1);
            String res=sb.toString();
            while(sb.toString().length()!=length)
            {
                 sb.insert(0,'0');
                 res=sb.toString();
            }
            int k=Integer.parseInt(res);
            System.out.print(k+" ");            
        }
    }
}