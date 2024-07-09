import java.util.*;
public class plnmladd{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a,b,c;
        int d,e,f;
        System.out.println("Enter the terms for the first polynomial equation:");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        System.out.println("The first equation thus is :"+a+"x^2 + "+" "+b+"x + "+c);
        System.out.println("Enter the coefficient for the second equation :");
        d=s.nextInt();
        e=s.nextInt();
        f=s.nextInt();
        System.out.println("The second equation thus is :"+d+"x^2 + "+" "+e+"x + "+f);
        System.out.println("After adding both equation we get the equation like :");
        a+=d;
        b+=e;
        c+=f;
        System.out.println(a+"x^2 +"+" "+b+"x +"+c);
        s.close();
    }
}