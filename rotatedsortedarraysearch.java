import java.util.*;

public class rotatedsortedarraysearch {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid;
            }
            
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        
        return -1; // Target not found
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the target element: ");
        int target = scanner.nextInt();
        
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();
        
        int[] arr = new int[length];
        
        System.out.println("Enter the array elements:");
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int result = search(arr, target);
        
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
        
        scanner.close();
    }
}
