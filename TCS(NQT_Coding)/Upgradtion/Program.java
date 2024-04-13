import java.util.*;
class Program
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<=s.length();j++)
            {
                String s1=s.substring(i,j);
                int a=Integer.parseInt(s1);
                sum=sum+a;
            }
        }
        System.out.println(sum);
    }
}