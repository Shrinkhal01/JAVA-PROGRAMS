import java.util.*;
public class kadanalgo{
    public static void main(String[] args) {
        int sum=0;
        int l;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array you will input:");
        l=s.nextInt();
        int [] ar=new int[l];
        System.out.println("Enter the elements into the array: ");
        for(int i=0;i<l;i++){
            ar[i]=s.nextInt();
        }
        int maxsum=0;
        for(int i=0;i<l;i++){
            sum=Math.max(ar[i],sum+ar[i]);
            maxsum=Math.max(sum,maxsum);
        }
        System.out.println("The max sum is : "+maxsum);
    }
}
