import java.util.*;
public class lastoccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int key = sc.nextInt();
        int index = lastOccurence(arr, key);
        if(index == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index: "+index);
        }
        sc.close();
    }
    public static int lastOccurence(int[] arr, int key){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==key){
                if(mid==arr.length-1 || arr[mid+1]!=key){
                    return mid;
                }
                else{
                    low=mid+1;
                }
            }
            else if(arr[mid]>key){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
}
