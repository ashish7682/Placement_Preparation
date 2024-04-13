import java.util.*;
class CheckPower4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=Integer.toString(n);
        int pow=(int)Math.pow(n,4);
        String s1=Integer.toString(pow);
        // StringBuilder sb=new StringBuilder(s);
        // String rev=sb.reverse().toString();
        if(n>0)
        {
                if(s.charAt(s.length()-1)==s1.charAt(s1.length()-1))
                {
                 System.out.println("True");
                }else
                {
                System.out.println("False");
                }
        }else
        {
            System.out.println("Wrong input");
        }
        
    }
}