import java.util.*;
public class simplestack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        boolean r=st.isEmpty();
        System.out.println("Is the stack empty? "+r);
        st.push(23);
        st.push(90);
        st.push(21);
        st.push(35);
        System.out.println("The stack elemenst are : "+st);
        r=st.isEmpty();
        System.out.println("Is the stack empty? "+r);
    }
}
