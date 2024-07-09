import java.util.*;
public class stock121 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of the array you enter :");
        int l=s.nextInt();
        int[] array=new int[l];
        System.out.println("Enter the element of the array: ");
        for(int i=0;i<l;i++){
            array[i]=s.nextInt();
        }
        int result=stock(array);
        System.out.println("The max profit we can get is in the stock number "+result);
    }
    public static int stock(int [] ar){
        int l=ar.length;
        int[] profit=new int[l];
        int[] dup=new int[l];
        for(int i=0;i<l;i++){
            int a=ar[i];
            dup[l]=ar[l];
            int k=i;
            for(int j=i;j<l;j++){
                if(dup[j]<dup[k]){
                    profit[i]-=dup[j];
                }else{
                    profit[i]+=dup[j];
                }
            }
        }
        int maxe=Arrays.stream(profit).max().orElse(0);
        int maxi=Arrays.binarySearch(profit,maxe);
        return maxi;
    }
}