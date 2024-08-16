import java.util.*;

public class nxtgrtstel {
    public static void main(String[] args) {
        int length;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        length = s.nextInt();
        int arr[] = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = s.nextInt();
        }
        nextgreaterelement(arr);
    }

    public static void nextgreaterelement(int a[]) {
        Stack<Integer> nx = new Stack<>();
        int ans[] = new int[a.length];
        int l = a.length;

        for (int i = l - 1; i >= 0; i--) {
            while (!nx.empty() && nx.peek() <= a[i]) {
                nx.pop();
            }
            if (nx.empty()) {
                ans[i] = -1;
            } else {
                ans[i] = nx.peek();
            }
            nx.push(a[i]);
        }
        int u = ans.length;
        for (int i = 0; i < u; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
