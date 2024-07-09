import java.util.*;
public class Bubblesort {
    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the length of array:");
        n=s.nextInt();
        int [] ar=new int[n];
        System.out.println("Enter the elements for the array:");
        for(int i=0;i<n;i++){
            ar[i]=s.nextInt();
        }
        System.out.print("The array initially : ");
        for(int i=0;i<n;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println("Lets sort thhis as per bubble sort!");
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(ar[i]<ar[j]){
                    int temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }
        System.out.print("The array after applying the bubble sort:");
        for(int i=0;i<n;i++){
            System.out.print(ar[i]+" ");
        }
    }
}
