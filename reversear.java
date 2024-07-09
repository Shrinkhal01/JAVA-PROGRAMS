import java.util.*;
public class reversear {
    public static void main(String[] args) {
        int arr[]=new int[10];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int l=s.nextInt();
        for(int i=0;i<l;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("The array is : ");
        for(int i=0;i<l;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        //now begins the reversing of the array

        for(int a=0; a<l/2; a++) {
            int temp = arr[a];
            arr[a] = arr[l-a-1];
            arr[l-a-1] = temp;
        }
        

        System.out.println("The reversed array now should look like ");
        for(int i=0;i<l;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
