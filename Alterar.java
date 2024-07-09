import java.util.*;
public class Alterar {
    public static void main(String[] args){
        int l;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        l=s.nextInt();
        int[] ar1=new int[l];
        System.out.println("Enter the elements into the array equal number of positive nd negative numbers");
        for(int i=0;i<l;i++){
            ar1[i]=s.nextInt();
        }
        int k=0;
        int k2=0;
        int[] A=new int[l];
        int[] B=new int[l];
        for(int i=0;i<l;i++){
            if(ar1[i]>=0){
                A[k]=ar1[i];
                k++;
            }else{
                B[k2]=ar1[i];
                k2++;
            }
        }    
        int e=0;
        int f=0;
        int[] C=new int[l];
        for(int i=0;i<l;i++){
            if(i%2==0){
                C[i]=A[e];
                e++;
            }else{
                C[i]=B[f];
                f++;
            }
        }    
        System.out.println("The final array after combo is :");
        for(int i=0;i<l;i++){
            System.out.print(" "+C[i]+" ");
        }
    }
}
