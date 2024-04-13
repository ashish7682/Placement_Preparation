import java.util.*;
class Reduce_String
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                int count=map.get(s.charAt(i));
                map.put(s.charAt(i),++count);
            }else
            {
                map.put(s.charAt(i),1);
            }
        }
       
        String num="";
        StringBuilder sb=new StringBuilder(num);
        for(Map.Entry<Character,Integer> e:map.entrySet())
        {
            sb.append(e.getKey());
            sb.append(e.getValue());
        }
        System.out.println(sb.toString());
        
    }
}