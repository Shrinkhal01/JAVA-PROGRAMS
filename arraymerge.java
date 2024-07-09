import java.util.*;
import java.util.Scanner;
class  arraymerge {
    public static int [] amerge(int[] a,int[] b){
        int x=a.length;
        int y=b.length;
        int z=x+y;
        int n=0;
        int[] c=new int[z];//create a new array to store the merged array
        while(n<z){
            for(int i=0;i<x;i++){
                c[n]=a[i];
                n++;
            }
            for(int j=0;j<y;j++){
                c[n]=b[j];
                n++;
            }
        }
        return c;
    }
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int x,y;
        System.out.print("Enter the length of the two arrays :");
        x=s.nextInt();
        y=s.nextInt();
        int[] a=new int[x];
        int[] b=new int[y];
        System.out.println("Enter the elements for the first array :");
        for(int i=0;i<x;i++){
            a[i]=s.nextInt();
        }
        System.out.println("Enter the elements for the second array : ");
        for(int i=0;i<y;i++){
            b[i]=s.nextInt();
        }
        int[] c;
        c=amerge(a,b);
        System.out.println("The merged array is :");
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
        Arrays.sort(c);
        System.out.println("\nThe sorted array is :");
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
    }
}
