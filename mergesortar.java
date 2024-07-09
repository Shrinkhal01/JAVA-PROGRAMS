import java.util.*;

public class mergesortar {
    public static void swapifGreater(int ar1[], int ar2[], int ind1, int ind2) {
        if (ar1[ind1] > ar2[ind2]) {
            swap(ar1, ar2, ind1, ind2);
        }
    }

    public static void swap(int ar1[], int ar2[], int a, int b) {
        int c = ar1[a];
        ar1[a] = ar2[b];
        ar2[b] = c;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int ar1[] = {23, 43, 54, 99, 21, 32, 1, 1, 21, 0, 1, 54, 12, 3};
        int ar2[] = {12, 23, 34, 4, 5, 6, 7, 7, 7, 87, 88, 9, 8, 9, 8, 9788, 7, 6, 7, 6, 554, 54, 5, 4};
        int n = ar1.length;
        int m = ar2.length;
        int len = m + n;
        int gap = (len / 2) + len % 2;

        System.out.println("Initial arrays:");
        printArray(ar1);
        printArray(ar2);

        while (gap > 0) {
            int l = 0;
            int r = l + gap;
            while (r < len) {
                if (l < n && r < n) {
                    swapifGreater(ar1, ar1, l, r);
                } else if (l >= n && r >= n) {
                    swapifGreater(ar2, ar2, l - n, r - n);
                } else {
                    swapifGreater(ar1, ar2, l % n, r % n);
                }
                l++;
                r++;
            }
            System.out.println("Final arrays:");
            printArray(ar1);
            printArray(ar2);

            if (gap == 1) break;
            gap = (gap / 2) + (gap % 2);
        }
    }
}
