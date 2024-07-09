import java.util.*;
class Over{
    public int overloading(int a , int b){
        return a+b;
    }
    public String overloading(String a,String b){
        return a+b;
    }
}
public class operatorovr {
    public static void  main(String[]args){ 
        Over o=new Over();
        System.out.println(o.overloading(45,54));
        System.out.println(o.overloading("Sachin"," Tendulkar"));
    }
}
