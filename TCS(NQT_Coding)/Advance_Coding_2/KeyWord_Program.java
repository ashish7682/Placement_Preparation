import java.util.*;
class KeyWord_Program
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String a[]={"break","case","continue","default","defer","else","for","fun","goto","if","range","return","struct","type","var"};
        int flag=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i].equals(s))
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println(s + " is a keyword");
        }else
        {
            System.out.println(s +" is not a keyword");
        }
        

    }
}