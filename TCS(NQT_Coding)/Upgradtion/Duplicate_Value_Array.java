import java.util.*;
/*class Duplicate_Value_Array
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
        Arrays.sort(a);
        
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    set.add(a[j]);
                }
            }
        }
        for(int x:set)
        {
            System.out.print(x+" ");
        }

    }
}*/
class Duplicate_Value_Array
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
        for(int i=0;i<a.length;i++)
        {
            if(map.containsKey(a[i]))
            {
                int count=map.get(a[i]);
                map.put(a[i],++count);
            }else
            {
                map.put(a[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            if(e.getValue()>1)
            {
                System.out.print(e.getKey()+" ");
            }

        }
    }
}