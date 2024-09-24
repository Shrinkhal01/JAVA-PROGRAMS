// Implement a solution to the "First Missing Positive" problem.
import java.util.*;
class missingpos{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of terms and then the array elements : ");
        int length=s.nextInt();
        System.out.println();
        int ar[]=new int[length];
        for(int i=0;i<length;i++){
            ar[i]=s.nextInt();
        }
        System.out.println("The initial array : ");
        for(int i=0;i<length;i++){
            System.out.print(ar[i]+"");
        }
        System.out.println();
        int missingposition = mispos(ar);
        System.out.println("The missing position and element is :"+missingposition);
        s.close();
    }
    public static int mispos(int[] array){
        int l=array.length;
        for(int i=0;i<l;i++){
            while((array[i]<=1 && array[i]<=l) && (array[array[i]-1]!=array[i])){
                swap(array[array[i]-1],array[i]);
            }
        }
        for(int i=0;i<l;i++){
            if(array[i]!=i+1)
                return (i+1);
        }
        return l+1;
    }
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
}
