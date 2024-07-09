import java.util.*;
public class solid {
    static double sa(double l){
        double s;
        s=6*l*l;
        return s;
    }
    static double vol(double l){
        double v;
        v=l*l*l;
        return v;
    }
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        double l,sarea,volum;
        System.out.println("Enter the dimenstion of any side of the solid : ");
        l=s.nextInt();
        sarea=sa(l);
        volum=vol(l);
        System.out.println("The surface area of the solid = "+sarea+" and the volume = "+volum);
    }
}
