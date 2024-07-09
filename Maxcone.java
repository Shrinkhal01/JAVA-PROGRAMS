import java.util.*;
public class Maxcone{
    public static void main(){
        int count=0;
        int[] ar=new int[10];
        for(int i=0;i<10;i++)
        for(int j=1;j<10;j++){
            if(ar[i]==1&&ar[j]==1){
                count+=2;
                i+=2;
            }
        }
        System.out.println("The maximum number of ones :"+count);
    }
}