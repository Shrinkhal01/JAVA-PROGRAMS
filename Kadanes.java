import java.util.*;
public class Kadanes {
    public static void main(String[] args) {
        int ar[]={12,32,43,534,534,6546,456,-2323,123,-65,-45,53,54,4553,54,-54,-2343,32432,43242,-1232142};
        int l=ar.length;
        int sum=0;
        int start=0,ansStart=-1,ansEnd=-1,max=Integer.MIN_VALUE;
        for(int i=0;i<l;i++){
            if(sum==0){
                start=i;
            }
            sum+=ar[i];
            // Check if the current sum is greater than the maximum sum found so far
            if(sum > max){
                // Update the maximum sum and the corresponding subarray indices
                max = sum;
                ansStart = start;
                ansEnd = i;
            }
            if(sum<0){
                sum=0;
            }
        }
        System.out.println();
        System.out.println("THE MAXIMUM SUBARRAY IS : ");
        for(int i=ansStart;i<ansEnd;i++){
            System.out.print(ar[i]+" ");
        }
    }
}
