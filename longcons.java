import java.util.*;

public class longcons {
    public static void main(String[] args){
        int ar[]={4,5,6,52,3,3,56,5,11,59,6,6,6,3,34,973,5,4,6,4,5,31,354,6,43,54,564,4,65,46,35,3};
        int l=ar.length;
        int[] sub=new int[l];
        int k=0;
        for(int i=1;i<l;i++){
            int temp=ar[i];
            for(int j=i;j<l;j++){
                while(ar[j]>temp){
                    temp=ar[j];
                    j++;                    
                }
            }
        }

    }    
}
