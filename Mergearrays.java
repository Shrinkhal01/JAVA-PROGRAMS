import java.util.*;
public class Mergearrays {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int m,n,t;
        System.out.println("Enter the size of the two arrays : ");
        m=s.nextInt();
        n=s.nextInt();
        t=m+n;
        int A[]=new int[m];
        int B[]=new int[n];
        System.out.println("Enter the elements for the first array  : ");
        for(int i=0;i<m;i++){
            A[i]=s.nextInt();
        }
        System.out.println("Enter the elements for the second array : ");
        for(int i=0;i<m;i++){
            B[i]=s.nextInt();
        }
        int C[]=new int[t];
        for(int i=0;i<m;i++){
            C[i]=A[i];
        }
        for(int i=m;i<(m+n);i++){
            C[i]=B[i];
        }
        Arrays.sort(C);
        System.out.println("The sorted array combined including both the arrays : ");
        for(int i=0;i<m;i++){
            System.out.print(C[i]+"");
        }
        System.out.println();
    }
}
