import java.util.*;
//rotate the array by the given positions
public class rotatear {
    public static void main(String[] args) {
        int ar[]={23,34,546,5,676,75,87,876,876,86,79,6,3,45,3453,5346,34,654,454};
        int pos;
        int l=ar.length;
        int [] arr=new int[l];
        arr=ar;
        System.out.println("The initial array : ");
        for(int i=0;i<l;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the position you want to rotate the array by : ");
        pos=s.nextInt();
        int k=0;
        for(int j=pos+1;j<l;j++){
            arr[k]=ar[j];
            k++;
        }
        for(int j=0;j<pos;j++){
            arr[k]=ar[j];
            k++;
        }
        ar = arr;
        System.out.println("The final array : ");
        for(int i=0;i<l;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
