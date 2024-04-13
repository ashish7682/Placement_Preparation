import java.util.*;
class Number_InRange
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        
        int count=0;
        for(int i=n1;i<=n2;i++)
        {
            String s=Integer.toString(i);
            HashSet<Character> set=new HashSet<>();
            for(int j=0;j<s.length();j++)
            {
                set.add(s.charAt(j));
            }
            if(set.size()==s.length())
            {
                count++;
            }
        }
        System.out.println(count);
    }
}