import java.util.*;
//inplace reversal of array
public class arrayrev {
    public static void main(String[] args) {
        int ar[]={34,43,2,532,4,5,35,346,35,6,234,2,34,23,5,53,45,34,534,5,3534,53,534,21};
        int l=ar.length;
        System.out.println("The intial array :");
        for(int i=0;i<l;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        for(int i=0; i<l/2; i++){
            swap(ar, i, l-i-1);
        }
        System.out.println();
        System.out.println("The array after swapping :");
        for(int i=0;i<l;i++){
            System.out.print(ar[i]+" ");
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}