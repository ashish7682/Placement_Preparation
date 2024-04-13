import java.util.*;

class Nearest_Smaller {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) 
        {
            while (!stack.isEmpty() && stack.peek() >= arr[i])
            {
                stack.pop();
            }

            if (stack.isEmpty()) 
            {
                System.out.print("-1 ");
            } else
            {
                System.out.print(stack.peek() + " ");
            }

            stack.push(arr[i]);
        }
    }
}
