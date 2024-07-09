import java.util.*;

public class posteval {
    public int postfixEval(String s) {
        Stack<Integer> st = new Stack<>();
        int l = s.length();
        for (int i = 0; i < l; i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {//this seeemed different but actually was easy
                st.push(s.charAt(i) - '0');
            } else {
                int op2 = st.pop();
                int op1 = st.pop();
                switch (s.charAt(i)) {
                    case '+':
                        st.push(op1 + op2);
                        break;
                    case '-':
                        st.push(op1 - op2);
                        break;
                    case '*':
                        st.push(op1 * op2);
                        break;
                    case '/':
                        st.push(op1 / op2);
                        break;
                }
            }
        }
        return st.peek();
    }

    public static void main(String[] args) {
        posteval p = new posteval();
        System.out.println("46+8/2*9-55 = " + p.postfixEval("46825/+*9-"));
    }
}