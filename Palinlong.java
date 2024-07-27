import java.util.*;
public class Palinlong {
    public static String palong(String s){
        if(s.length()==0||s==null) return "";
        int n=s.length();
        boolean[][] dp=new boolean[n][n];
        int start=0,maxLength=1;
        //since substring of length 1 are palindrome
        for(int i=0;i<n;i++){
            dp[i][i]=true;
        }

        //chaeck substring of length 2
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1]=true;
                start=i;
                maxLength=2;    
            }
        }

        //check for substring of length greater than 2
        for(int length=3;length<=n; length++){
            for(int i=0;i<n-length+1;i++){
                int j=i+length-1;
                if(s.charAt(i)==s.charAt(j)&& dp[i+1][j-1]){
                    dp[i][j]=true;
                    start=i;
                    maxLength=length;
                }
            }
        }
        return s.substring(start,start+maxLength);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String input=s.nextLine();
        System.out.println("The longest palindromic substring is "+Palinlong.palong(input));
        s.close();
    }
}
