import java.util.*;
public class Digits {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("Enter the number");
        n=s.nextInt();
        int ans=ndgt(n);
        System.out.println("The number of digits in the number is "+ans);
    }
    public static int ndgt(int n){
        int a=0;
        int q=0;
        int r=0;
        int temp=n;
        while(temp>0){
            r=temp%10;
            q=temp/10;
            temp=q;
            a++;
        }
        return a;
    }
}
