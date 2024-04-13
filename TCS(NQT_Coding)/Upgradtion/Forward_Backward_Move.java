import java.util.*;
class Forward_Backward_Move
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();                  //abcd
        StringBuilder sb1=new StringBuilder(s);
        StringBuilder sb2=new StringBuilder(s);
        sb1.append(s.charAt(0));
        String s1=sb1.deleteCharAt(0).toString();
        // System.out.println(s1);                 //bcda
        
        sb2.insert(0,s.charAt(s.length()-1));
        String s2=sb2.deleteCharAt(s.length()).toString();
        // System.out.println(s2);             //dabc
                                  
        if(s1.equals(s2))
        {
            System.out.println(1);
        }else
        {
            System.out.println(0);
        }
        
    }
}