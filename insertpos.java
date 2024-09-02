import java.util.*;
public class insertpos {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the element "+(i+1));
            arr[i]=s.nextInt();
        }
        System.err.println("Enter the element to find the position");
        int x=s.nextInt();
        int pos=pos(arr,x);
        System.out.println("The position of the element is "+(pos+1));
    }
    public static int pos(int arr[],int x){
        int l=arr.length;
        int h = -1; // Initialize h with a default value
        for(int i=0;i<l;i++){
            if(arr[i]>x){
                h=i;
                break;
            }
        }
        return h;
    }
}
