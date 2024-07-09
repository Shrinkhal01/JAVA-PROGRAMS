import java.util.Scanner;
public class threesum {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the length of the array:");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            ar[i] = s.nextInt();
        }
        boolean found = false;
        for (int i = 0; i < n - 2; i++) {
            int a = ar[i];
            for (int j = i + 1; j < n - 1; j++) {
                int b = ar[j];
                for (int k = j + 1; k < n; k++) {
                    int c = ar[k];
                    if (a + b + c == 0) {
                        if (!found || (found && (a != b || b != c))) {
                            System.out.println(a + " " + b + " " + c);
                            found = true;
                        }
                    }
                }
            }
        }
        if (!found) {
            System.out.println("No unique triplets found.");
        }
    }
}
