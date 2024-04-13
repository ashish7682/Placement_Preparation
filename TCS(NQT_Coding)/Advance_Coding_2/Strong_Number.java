import java.util.*;
class Strong_Number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n!=0)
        {
            int rem=n%10;
            int mul=1;
            for(int i=1;i<=rem;i++)
            {
                mul=mul*i;
            }
            n=n/10;
            sum=sum+mul;
            
        }
            if(sum==temp)
            {
                System.out.println("Strong Number");
            }else
            {
                System.out.println("Not a strong number");
            }
    }
}