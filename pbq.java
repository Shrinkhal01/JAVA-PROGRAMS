import java.util.*;
//implementing the bracket balancing using stacks in java
public class pbq {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Now enter some brackets so i can check them ");
        String t=s.nextLine();
        String[] ar=t.split("");       
        for(String str : ar){
            System.out.print(str+" ");
        }   
        System.out.println();
        int a1=0;
        int b1=0;
        int c1=0;
        Stack<String> stack=new Stack<>();
        for(String shabd : ar){
            stack.push(shabd);
        }
        for(String test:stack){
            if(test.compareTo("(")==0){a1++;}
            else if(test.compareTo("[")==0){b1++;}
            else if((test.compareTo("{")==0)){c1++;}
        }
        for(String test:stack){
            if(test.compareTo(")")==0){a1--;}
            else if(test.compareTo("]")==0){b1--;}
            else if((test.compareTo("}")==0)){c1--;}
        }
        System.out.println();
        if(a1==0 && b1==0 && c1==0){
            System.out.println("The parenthesis is balanced ");
        }else{
            System.out.println("The parenthesis are not balanced");
        }
    }
}
