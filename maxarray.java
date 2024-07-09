import java.util.*;
//algorithm to find the maximum element in an  array
public class maxarray {
    public static void main(String[] args){
        int ar[]={1,2,36,4,53,5,43,643,65,34};
        int max=ar[0];
        for(int i=1;i<ar.length;i++){
            if(ar[i]>max){
                max=ar[i];
            }
        }
        System.out.println("The max element in the array is "+max);
    }
}
