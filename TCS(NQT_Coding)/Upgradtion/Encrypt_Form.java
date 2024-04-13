import java.util.*;
class Encrypt_Form
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int key=sc.nextInt();
        String res="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isUpperCase(c))
            {
               int ascii=(int) c + key;
                if(ascii>90)
                {
                    ascii=65+(ascii % 91);
                }
                char c1=(char) ascii;
                res=res+c1;
            }else if(Character.isLowerCase(c))
            {
                int ascii=(int) c + key;
                if(ascii>122)
                {
                    ascii=97+(ascii % 123);
                }
                char c1=(char) ascii;
                res=res+c1;
            }
            else if(Character.isDigit(c))
            {
                int ans= s.charAt(i)-'0';
                ans=ans+key;
                if(ans>=10)
                {
                    ans=ans%10;
                }
                res=res+Integer.toString(ans);
            }else
            {
                res=res+c;
            }
        }
        System.out.println(res);
    }
}