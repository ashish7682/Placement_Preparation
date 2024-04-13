import java.util.*;
class Check_Contains_Word
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        int res=0;
        if(str1.contains(str2))
        {
            res=str1.indexOf(str2);
        }else
        {
            res=-1;
        }
        System.out.print(res);
    }
}