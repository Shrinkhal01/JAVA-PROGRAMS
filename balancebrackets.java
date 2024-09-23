import java.util.*;
public class balancebrackets {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string of brackets any random string accepted:");
        String str=s.nextLine();
        boolean value=bchkr(str);
        if(value){
            System.out.println("Balanced string of bracekts entered");
        }else{
            System.out.println("Unnbalanced String of brackets entered");
        }
    }
    public static boolean bchkr(String s){
        Stack<String> st = new Stack<>();
        int l=s.length();
        String[] ar = s.split("");
        for(int i=0;i<l;i++){
            if(ar[i].equals("[") || ar[i].equals("{") || ar[i].equals("(")){
                st.push(ar[i]);
            }
            else{
                if(st.isEmpty()) return false;
                String c = st.pop();
                if((ar[i].equals("]") && !c.equals("[")) ||
                   (ar[i].equals("}") && !c.equals("{")) ||
                   (ar[i].equals(")") && !c.equals("("))) {
                    return false;
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }else{
            return true;
        }

    }
}
