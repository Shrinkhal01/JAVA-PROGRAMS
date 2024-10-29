import java.util.*;
public class SubsetGenerator {
    public static void generateSubsets(int[] set, int index, List<Integer> currentSubset) {
        if (index == set.length) {
            System.out.println(currentSubset);
            return;
        }
        generateSubsets(set, index + 1, currentSubset);
        currentSubset.add(set[index]);
        generateSubsets(set, index + 1, currentSubset);
        currentSubset.remove(currentSubset.size() - 1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements in the set: ");
        int n = s.nextInt();
        int[] set = new int[n];
        System.out.println("Enter the elements of the set:");
        for (int i = 0; i < n; i++) {
            set[i] = s.nextInt();
        } 
        System.out.println("All subsets of the set:");
        generateSubsets(set, 0, new ArrayList<>());
        s.close();
    }
}
