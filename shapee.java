import java.util.*;
enum shape{
    square,rectangle,circle,triangle;shapes
}

class shapee{
    public static double pcircle(int x){
        double p=22/7;t
        double a=2*p*x;
        return a;
    }
    public static double acircle(int x){
        double p=22/7;
        double a=p*x*x;
        return a;
    }
    public static double prect(int x,int y){
        double p=2*(x+y);
        return p;
    }
    public static double arect(int x,int y){
        double a=x*y;
        return a;
    }
    public static double asqr(int x){
        double a=x*x;
        return a;
    }
    public static double psqr(int x){
        double p=4*x;
        return p;
    }
    public static double atrng(int x,int y,int z){
        double s=(x+y+z)/2;
        double a=Math.sqrt(s*(s-x)*(s-y)*(s-z));
        return a;
    }
    public static double ptrng(int x,int y,int z){
        double p=x+y+z;
        return p;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String snm=s.nextLine().toLowerCase();
        if(snm.equals(shape.circle.toString())){
            System.out.println("Enter radius : ");
            int r=s.nextInt();
            double p=pcircle(r);
            double a=acircle(r);
            System.err.println("The area = "+a+"\n The circumference = "+p);
        }else if(snm.equals(shape.rectangle.toString())){
            System.out.println("Enter length and breath : ");
            int l=s.nextInt();
            int b=s.nextInt();
            double p=prect(l,b);
            double a=arect(l,b);
            System.err.println("The area = "+a+"\n perimeter = "+p);
        }else if(snm.equals(shape.square.toString())){
            System.out.println("Enter side : ");
            int r=s.nextInt();
            double p=psqr(r);
            double a=asqr(r);
            System.err.println("The area = "+a+"\n The perimeter = "+p);
        }else if(snm.equals(shape.triangle.toString())){
            System.out.println("Enter sides : ");
            int a=s.nextInt();
            int b=s.nextInt();
            int c=s.nextInt();
            double p=ptrng(a,b,c);
            double ar=atrng(a,b,c);
            System.err.println("The area = "+a+"\n The perimeter = "+p);
        }
    }
}