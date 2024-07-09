import java.util.*;
class Printdvsr{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("Enter the number whose factors you want:");
        n=s.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }else{
                continue;
            }
        }
        System.out.println("These are the factors of "+n);
    }
}