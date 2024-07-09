import java.util.*;
public class selectionsort {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void main(String[] args) {
        int ar[]=new int[10];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the 10 array elements:");
        for(int i=0;i<10;i++){
            ar[i]=s.nextInt();
        }
        System.out.println("The array you entered is :");
        for(int i=0;i<10;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        for(int i=0;i<10;i++){
            int min=i;
            for(int j=i+1;j<10;j++){
                if(ar[min]>ar[j]){
                    min=j;
                }
            }
            swap(ar, min, i);
        }
        System.out.println("The array after applying the sorting technique is:");
        for(int i=0;i<10;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
}
