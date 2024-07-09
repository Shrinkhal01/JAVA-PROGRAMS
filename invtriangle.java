import java.util.*;
public class invtriangle {
    public static void main(String[] args){
        int n;
        Scanner s=new Scanner(System.in);
        System.out.print("enter the number of rows and we will make a diamond of twice that number : ");
        n=s.nextInt();
        for(int i=0;i<n;i++){
            int k=n-i;
            while(k>=0){
                System.out.print("  ");
                k--;
            }
            int j=0; 
            do{
                System.out.print("* ");
                j++;
            }while(j<=2*i);
            System.out.println();
        }
        for(int i=n;i>=0;i--){
            int k=n-i;
            while(k>=0){
                System.out.print("  ");
                k--;
            }
            int j=0;
            do{
                System.out.print("* ");
                j++;
            }while(j<=2*i);
            System.out.println();
        }
    }
}
