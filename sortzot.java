import java.util.*;

public class sortzot {
    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        int f1, f2, f3;
        int size;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        size = s.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements in the array out of 0/1/2 only: ");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        int k = 0;
        int k2 = 0;
        int k3 = 0;
        int[] arr0 = new int[size];
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        for (int i = 0; i < size; i++) {
            if (arr[i] == 0) {
                arr0[k] = arr[i];
                k++;
            } else if (arr[i] == 1) {
                arr1[k2] = arr[i];
                k2++;
            } else {
                arr2[k3] = arr[i];
                k3++;
            }
        }

        int i = 0;
        int t = 0;
        while (i < k) {
            arr[ t] = arr0[i];
            i++;
            t++;
        }

        int j = 0;
        while (j < k2) {
            arr[t] = arr1[j];
            j++;
            t++;
        }

        int k_ = 0;
        while (k_ < k3) {
            arr[t] = arr2[k_];
            k_++;
            t++;
        }

        System.out.println("The final array after all elements of the array are sorted : ");
        for (int o = 0; o < size; o++) {
            System.out.print(arr[o] + " ");
        }
    }
}