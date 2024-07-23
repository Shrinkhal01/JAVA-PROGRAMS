import java.util.*;
class anagram{
    public static boolean checkana(String a ,String b){
        if(a.length()!=b.length()){
            return false;
        }
        char sa[]=a.toCharArray();
        char sb[]=b.toCharArray();
        Arrays.sort(sa);
        Arrays.sort(sb);
        return Arrays.equals(sa,sb);
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the two strings:");
        String a=s.nextLine();
        String b=s.nextLine();
        boolean ans=checkana(a,b);
        if(ans){
            System.out.println("They are anagram");
        }else{
            System.out.println("They are not anagram");
        }
    }
}