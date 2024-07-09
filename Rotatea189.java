import java.util.*;
public class Rotatea189 {
    public void rotate(int[] nums, int position) {
        int length = nums.length;
        int[] nums2 = new int[length];
        int k=0;

        for (int i = 0; i < length; i++) {
            nums2[(i + position) % length] = nums[i];
        }

        for (int i = 0; i < k; i++) {
            nums2[k] = nums[i];
            k++;
        }
    }

    public static void main(String[] args) {
        int a, b;
        Rotatea189 cake = new Rotatea189();
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        a = s.nextInt();
        int arr[] = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("The initial array : ");
        for (int i = 0; i < a; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Enter the position you want to change from : ");
        b = s.nextInt();
        cake.rotate(arr, b);

        System.out.println("The array after the rotation : ");
        for (int i = 0; i < a; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
