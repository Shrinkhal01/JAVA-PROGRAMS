import java.util.*;
public class secondlrg {
    public static void main(String[] args) {
        int ar[]={1,2,3,4,3,1,2,34,45,36,564,3,45,35,446456,45,645,6,456,45,64,56,45,0};
        int l=ar.length;
        int largest=0;
        int slargest=-1;
        for(int i=0;i<l;i++){
            if(ar[i]>largest){
                slargest=largest;
                largest=ar[i];
            }
        }
        System.out.println("The second largest element is "+slargest);
    }
}
