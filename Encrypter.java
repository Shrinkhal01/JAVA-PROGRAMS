import java.util.*;

public class Encrypter {

    public int[] encrypt(String forlk,int k1,int k2,int m){
        int l=forlk.length();
        String s[]=new String[l];
        char[] str=forlk.toCharArray();
        int lk[]=new int[l];

        for(int i=0;i<l;i++){
            lk[i]=(int)str[i];
        }
        
        for(int i=0;i<l;i++){
            lk[i]=fun(m,k1,k2,lk[i]);
        }
        
        for(int i=0;i<l;i++){
            System.out.println(lk[i]+"");
        }
        return lk;
    }

    int fun(int m,int k1,int k2,int n){
        int cipher=(k1*n+k2)%m;
        return cipher;
    }
    public static void main(String [] args){
        int k1,k2;
        String str;
        int m=26;//depicting the total alphabets from which we encrypt
        Scanner s=new Scanner(System.in);
        Encrypter encrypter = new Encrypter();
        
        
        System.out.println("Enter the string to encrypt:");
        str=s.nextLine();
        int l=str.length();
        
        System.out.println("Enter the keys the secret and the public both : ");
        k1=s.nextInt();
        k2=s.nextInt();

        s.nextLine();
        
        System.out.println("The string to encrypt is : "+str);

        
        int[] encrypted = encrypter.encrypt(str,k1,k2,m);
        
        for(int i=0;i<l;i++)
            System.out.println("The string after encryption looks like : "+(char)encrypted[i]);
    }    
}
