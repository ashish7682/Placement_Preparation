import java.util.*;
class Game_Developemnt
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=Integer.toString(n);
        String res="";
        if(n<1000000)
        {
             for(int i=0;i<s.length();i++)
             {
              int dig=s.charAt(i)-'0';
              int n1=9-dig;
              String s1=Integer.toString(n1);
              res=res+s1;
             }
             int result=Integer.parseInt(res);
             System.out.println(result);
        }else
        {
            System.out.println("Wrong Input");
        }
       
    }
}