import java.util.*;
class Arrange_According_Rank
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
         
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(a[i],i);
        }
        Arrays.sort(a);
        
        int ranks[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ranks[map.get(a[i])]=i+1;
        }
        
        for(int x:ranks)
        {
            System.out.println(x+" ");
        }
    }
}