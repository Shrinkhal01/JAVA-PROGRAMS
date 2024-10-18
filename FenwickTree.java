import java.util.Scanner;

public class FenwickTree {
    int[] fenwickTree;
    int n;
    public FenwickTree(int n) {
        this.n = n;
        fenwickTree = new int[n + 1]; 
    }
    public void update(int index, int value) {
        while (index <= n) {
            fenwickTree[index] += value;
            index += index & (-index);
        }
    }
    public int query(int index) {
        int sum = 0;
        while (index > 0) {
            sum += fenwickTree[index];
            index -= index & (-index);
        }
        return sum;
    }
    public int rangeQuery(int left, int right) {
        return query(right) - query(left - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n + 1];
        FenwickTree fenwickTree = new FenwickTree(n);

        System.out.println("Enter the array elements: ");
        for (int i = 1; i <= n; i++) {
            arr[i] = scanner.nextInt();
            fenwickTree.update(i, arr[i]);
        }
        while (true) {
            System.out.println("\nFenwick Tree Operations:");
            System.out.println("1. Update Element");
            System.out.println("2. Query Prefix Sum");
            System.out.println("3. Query Range Sum");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter index and value to update: ");
                    int index = scanner.nextInt();
                    int value = scanner.nextInt();
                    int diff = value - arr[index]; // Get the difference to update
                    arr[index] = value; // Update the array
                    fenwickTree.update(index, diff); // Update the Fenwick Tree
                    break;
                case 2:
                    System.out.print("Enter index to query prefix sum: ");
                    index = scanner.nextInt();
                    int result = fenwickTree.query(index);
                    System.out.println("Prefix sum up to index " + index + " is: " + result);
                    break;
                case 3:
                    System.out.print("Enter range (left right) to query sum: ");
                    int left = scanner.nextInt();
                    int right = scanner.nextInt();
                    int rangeSum = fenwickTree.rangeQuery(left, right);
                    System.out.println("Sum in range [" + left + ", " + right + "] is: " + rangeSum);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }
}
