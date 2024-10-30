import java.util.*;
public class PermutationGenerator {
    public static void generatePermutations(int[] set, List<Integer> currentPermutation, boolean[] used) {
        if (currentPermutation.size() == set.length) {
            System.out.println(currentPermutation);
            return;
        }
        for (int i = 0; i < set.length; i++) {
            if (!used[i]) {
                used[i] = true;
                currentPermutation.add(set[i]);
                generatePermutations(set, currentPermutation, used);
                used[i] = false;
                currentPermutation.remove(currentPermutation.size() - 1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the set: ");
        int n = sc.nextInt();
        int[] set = new int[n];
        System.out.println("Enter the elements of the set:");
        for (int i = 0; i < n; i++) {
            set[i] = sc.nextInt();
        }
        System.out.println("All permutations of the set:");
        generatePermutations(set, new ArrayList<>(), new boolean[set.length]);
        sc.close();
    }
}
