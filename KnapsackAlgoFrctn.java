import java.util.Arrays;
import java.util.Scanner;
class Item {
    int value, weight;
    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}

public class KnapsackAlgoFrctn {
    public static double fractionalKnapsack(int W, Item[] items, int n) {
        Arrays.sort(items, (a, b) -> Double.compare((double) b.value / b.weight, (double) a.value / a.weight));
        double maxValue = 0.0;
        for (int i = 0; i < n; i++) {
            if (W >= items[i].weight) {
                W -= items[i].weight;
                maxValue += items[i].value;
            } else {
                maxValue += (double) items[i].value * W / items[i].weight;
                break;
            }
        }
        return maxValue;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n = scanner.nextInt();
    Item[] items = new Item[n];
        System.out.println("Enter weights and values of items:");
        for (int i = 0; i < n; i++) {
            System.out.print("Item " + (i + 1) + " Weight: ");
            int weight = scanner.nextInt();
            System.out.print("Item " + (i + 1) + " Value: ");
            int value = scanner.nextInt();
            items[i] = new Item(value, weight);
        }
        System.out.print("Enter maximum weight capacity of the knapsack: ");
        int W = scanner.nextInt();
        double maxValue = fractionalKnapsack(W, items, n);
        System.out.println("Maximum value: " + maxValue);
        scanner.close();
    }
}
