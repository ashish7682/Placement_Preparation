import java.util.*;

class Even_NumberOfTimes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                int count = map.get(a[i]);
                map.put(a[i], ++count);
            } else {
                map.put(a[i], 1);
            }
        }

        ArrayList<Integer> list=new ArrayList<>();
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            if(e.getValue() % 2 == 0)
            {
                list.add(e.getKey());
            }
        }

        for(int x:list)
        {
            System.out.print(x+" ");
        }
    }
}
