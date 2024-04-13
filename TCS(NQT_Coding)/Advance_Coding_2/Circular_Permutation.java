import java.util.*;
class Circular_Permutation
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mul=1;
        for(int i=1;i<n;i++)
        {
          mul=mul*i; 
        }
        int result=mul*2;
        System.out.println(result);
    }
}