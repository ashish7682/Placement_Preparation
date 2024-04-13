import java.util.*;
class PowerOf_2_StairCase
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=Integer.toBinaryString(n);
        System.out.println(s);
        int count=Integer.bitCount(n);
        System.out.println(count);
    }
} 