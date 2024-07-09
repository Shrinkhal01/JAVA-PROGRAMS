import java.util.*;
class binarysearch{
    static int bs(int arr[], int target){
        int s = arr.length;
        int start=0;
        int end=s-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target) end=mid-1;
            else start=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int n,arr[];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        n=s.nextInt();
        arr=new int[n];
        System.out.println("Enter the array elements:");
        int i=0;
        while(i<n){
            arr[i]=s.nextInt();
            i++;
        }
        System.out.println("Enter the target element to search:");
        int target=s.nextInt();
        int ans=bs(arr, target);
        if(ans==-1) System.out.println("Element not found");
        else System.out.println("Element found at index: "+(ans+1));
    }
}