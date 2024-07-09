import java.util.*;
public class majority {
    public static void main(String[] args){
        int arr[]={1,2,5,5,12,2,3,1,21,12,11,2,2,3,1,1,1,1,1,1,1,12,2,2,2,2,222,1,1,1,1,1,1,1,1,11,1,1,1,1,1,1,11,1,1,1};
        int n=arr.length;
        System.out.println(n);
        int half=n/2;
        for(int i=0;i<n;i++){
            int temp=arr[i];
            int y=0;
            for(int j=i;j<n;j++){
                if(arr[j]==temp){//looks simple but  a bit tricky little bit
                    y++;
                }
            }
            if(y>half){
                System.out.println(temp+" appears more than half times with the count being "+y);
            }else{
                System.out.println("Neh not this one......");
            }
        }
    }
}