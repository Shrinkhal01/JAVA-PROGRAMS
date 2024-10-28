import java.util.*;
class Item {
    int weight;
    int value;
    Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}
public class FractionalKnapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = sc.nextInt();
        Item[] items = new Item[n];
        System.out.println("Enter weight and value of each item:");
        for (int i = 0; i < n; i++) {
            int weight = sc.nextInt();
            int value = sc.nextInt();
            items[i] = new Item(weight, value);
        }
        System.out.print("Enter the maximum weight of the knapsack: ");
        int maxWeight = sc.nextInt();
        Arrays.sort(items, (a, b) -> Double.compare((double) b.value / b.weight, (double) a.value / a.weight));
        double totalValue = 0.0;
        int currentWeight = 0;
        for (Item item : items) {
            if (currentWeight + item.weight <= maxWeight) {
                totalValue += item.value;
                currentWeight += item.weight;
            } else {
                int remainingWeight = maxWeight - currentWeight;
                totalValue += item.value * ((double) remainingWeight / item.weight);
                break;
            }
        }
        System.out.println("Maximum value achievable in the knapsack: " + totalValue);
        sc.close();
    }
}
