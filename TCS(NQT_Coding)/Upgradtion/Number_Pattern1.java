import java.util.*;
class Number_Pattern1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        int k=0;
        int l=0;

        for(int i=1;i<=n;i++)
        {
            if(isPrime(i))
            {
                int ans=(int)Math.pow(2,k);
                k++;
                list.add(ans);
            }else if(isPerfectSquare(i))
            {
                int ans=(int)Math.pow(3,l);
                l++;
                list.add(ans);
            }else
            {
                int ans=list.get(list.size()-1)+list.get(list.size()-2);
                list.add(ans);
            }
        }
        for(int x:list)
        {
            System.out.print(x+" ");
        }
    }

    public static boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<=num/2;i++)
        {
            if(num % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static boolean isPerfectSquare(int num)
    {
        double sqrt=Math.sqrt(num);
        if(sqrt==Math.floor(sqrt))
        {
            return true;
        }
        return false;
    }
}