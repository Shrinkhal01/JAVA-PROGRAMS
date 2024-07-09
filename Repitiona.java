import java.util.*;
public class Repitiona {
    public static void main(String[] args){
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        n=s.nextInt();
        System.out.println("Enter the array elements : ");
        int[] arr=inputA(n);
        int limiter=n/3;
        for(int i=0;i<n;i++){
            int temp=arr[i];
            int flag=0;
            for(int j=i;j<n;j++){
                if(arr[j]==temp){
                    flag++;
                    if(flag>limiter){
                        System.out.print(arr[j]+" repeated more than 1/3rd times ");
                        System.out.println();
                    }
                }
            }
        }
    }
    public static int[] inputA(int n){
        Scanner s=new Scanner(System.in);
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=s.nextInt();
        }
        return ar;
    }
}
