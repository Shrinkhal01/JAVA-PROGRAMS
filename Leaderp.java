import java.util.*;

class Leaderp {
    public static void main(String[] args) {
        int arr[] = {7, 4, 6, 9, 5, 2, 1, 56, 3, 5, 1, 5, 4};
        int l = arr.length;
        int[] ldr = new int[l];
        int k = 0;
        for (int i = 0; i < l; i++) {
            int id = l - i - 1;  
            for (int j = id + 1; j < l; j++) {
                if (arr[id] < arr[j]) {
                    break;  
                } else {
                    if (j == l - 1) { 
                        ldr[k] = arr[id];
                        System.out.println("Index of leader element: " + id);
                        k++;
                    }
                }
            }
        }
        ldr = Arrays.copyOfRange(ldr, 0, k);
        System.out.println("Leaders in the array: ");
        for (int i = 0; i < k - 1; i++) {
            System.out.print(ldr[i] + " ");
        }
        if (k > 0) {
            System.out.println(ldr[k - 1]);
        }
    }
}
