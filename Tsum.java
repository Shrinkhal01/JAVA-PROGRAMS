import java.util.*;
public class Tsum {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("Enter the length of the array you want:");
        n=s.nextInt();
        int target;
        System.out.print("Enter the target value for the 2sum: ");
        target=s.nextInt();
        int k=0,l=0;
        int[] A=inputA(n);
        for(int i=0;i<n;i++){
            int sum=0;
            int a=A[i];
            for(int j=i;j<n;j++){
                sum=a+A[j];
                if(sum==target){
                    System.out.println("YES for "+a+" & "+A[j]);
                    k++;
                }else{
                    System.out.println("NO for "+a+" & "+A[j]);
                    l++;
                }
            }
        }
        System.out.println("TOTAL "+k+" YES");
        System.out.println("TOTAL "+l+" NO");
    }
    public static int[] inputA(int n){
        int[] ar=new int[n];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the array contents ");
        for(int i=0;i<n;i++){
            ar[i]=s.nextInt();
        }
        return ar;
    }
}
