import java.util.*;
public class segregatezo {
    public static void main(String[] args) {
        int ar[]={1,0,0,1,0,1,0,1,0,1,0,1,0,1,0,0,0,1,1,0,1,0,1,1,1,1,1,0,0,0,1,1,0,0,0,1,1,0,1,1,0,0,1,0,1,1,1,0};
        int l=ar.length;
        for(int i=0;i<l;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        sortZO(ar, l);
        System.out.println("The array after sortion:");
        for(int i=0;i<l;i++){
            System.out.print(ar[i]+" ");
        }
    }
    public static void sortZO(int arr[],int length){
        int low =0,high=length-1,mid=0;
        while(mid<=high){
            while(mid<=high){
                if(arr[mid]==0){
                    swap(arr,low,mid);
                    low++;
                    mid++;
                }
                else if(arr[mid]==1){
                    mid++;
                }
                else{
                    int a=arr[mid];
                    int b=arr[high];
                    swap(arr,mid,high);
                    high--;
                }
            }
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
