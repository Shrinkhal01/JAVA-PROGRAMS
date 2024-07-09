import java.util.*;
public class findduplicate {
    public static void main(String[] args) {
        int arr[]={2,3,3,4,5,45,3242,123,32,2,53,45,3456,4,6,456,54,645,654,64,123};
        int l=arr.length;
        Arrays.sort(arr);
        System.out.println("Before : ");
        for(int i=0;i<l;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        remdup(arr,l);
        System.out.println("After : ");
        for(int i=0;i<l;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int remdup(int ar[],int l){
        int i=0;
        for(int j=1;j<l;j++){
            if(ar[i]!=ar[j]){
                ar[i+1]=ar[j];
                i++;
            }
        }
        return i+1;
    }
}
