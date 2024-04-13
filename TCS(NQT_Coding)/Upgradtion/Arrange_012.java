import java.util.*;
/*class Arrange_012
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
        int count0=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
            {
                count0++;
            }else if(a[i]==1)
            {
                count1++;
            }else if(a[i]==2)
            {
                count2++;
            }
        }
      
        for(int i=0;i<count1;i++)
        {
            System.out.print(1+" ");
        }
        for(int i=0;i<count0;i++)
        {
            System.out.print(0+" ");
        }
        for(int i=0;i<count2;i++)
        {
            System.out.print(2+" ");
        }
    }
}*/
class Arrange_012
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
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
           if(a[i]==0)
           {
            list1.add(0);
           }else if(a[i]==1)
           {
            list2.add(1);
           }else if(a[i]==2)
           {
            list3.add(2);
           }
        }
        list2.addAll(list1);
        list2.addAll(list3);
        for(int x:list2)
        {
            System.out.print(x+" ");
        }
    }
}