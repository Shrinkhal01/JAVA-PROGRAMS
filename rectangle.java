import java.util.*;
public class rectangle {
    public static void main(String [] args){
        int [] top=new int[2];
        int [] left=new int[2];
        int [] bottom=new int[2];
        int [] right=new int[2];
        int [] leftP=new int[2];
        int [] botmR=new int[2];
        double [] areaperimeter=new double[2];
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the topleft,left,bottomright,right coordinates of the rectangle : ");
        for(int i=0;i<2;i++){
            top[i]=s.nextInt();
        }
        for(int i=0;i<2;i++){
            left[i]=s.nextInt();
        }
        for(int i=0;i<2;i++){
            bottom[i]=s.nextInt();
        }
        for(int i=0;i<2;i++){
            right[i]=s.nextInt();
        }
        for(int i=0;i<2;i++){
            int l=top[i]-bottom[i];
            int b=left[i]-right[i];
        }
        System.out.println("Enter the uniform length you want to deflate the rectangle by : ");
        double d=s.nextDouble();
        topLeft(left[0],left[1]);//return the top left point of the rectangle
        bottomR(bottom[0],bottom[1]);//returns the bottom right coordinates of the rectangle
        cPoint(top[0],top[1],bottom[0],bottom[1]);//prints the center point of the rectangle
        deflateRect(d, top[1], left[1], bottom[1], right[1]);//decrements the coordinates by d as entered by the user
        int h=height(top[0],top[1],left[0],left[1]);//returns the height of the valid rectangle
        int w=width(top[0],top[1],right[0],right[1]);//returns the breadth of the valid rectangle
        areaP(h,w);//returns the area and the perimeter of the rectangle
        isRectEmpty(h,w);//checks if the rectangle is empty
        ptlnRect(4,5,top[0],top[1],right[0],right[1],left[0],left[1],bottom[0],bottom[1]);//tells if the point lies within the rectangle
        isRectNull(top[0],top[1],right[0],right[1],left[0],left[1],bottom[0],bottom[1]);//checks if the rectangle is null or not
        setRect(45,45);//sets the new height and breadth of the rectangle
        size(top[0],top[1],right[0],right[1],left[0],left[1],bottom[0],bottom[1]);//returns the valid length and breath of the rectangle
    }
    static void topLeft(int x,int y){
        if(x!=0&&y!=0){
            System.out.print("Top left coordinates :"+x+" "+y);
        }else{
            System.out.println("Invalid input!");
        }
    }
    static void bottomR(int x,int y){
        if(x!=0&&y!=0){
            System.out.print("Bottom right coordinates :"+x+" "+y);
        }else{
            System.out.println("Invalid input!");
        }
    }
    static void cPoint(int x,int y,int a,int b){
        double c,d;
        c=(x+a)/2;
        d=(y+b)/2;
        if(x!=0&&y!=0&&a!=0&&b!=0){
            System.out.print("Center point coordinates :"+c+" "+d);
        }else{
            System.out.println("Invalid input!");
        }
    }
    public static void deflateRect(double d, int top, int left, int bottom, int right) {
        top -= d;
        left -= d;
        bottom -= d;
        right -= d;
    }
    static int height(int x,int y,int a,int b){
        if(x==a)
            return Math.abs((y-b));
        else
            return Math.abs((x-a));
    }
    static int width(int x,int y,int a,int b){
        if(x==a)
            return Math.abs((y-b));
        else
            return Math.abs((x-a));
    }
    static void areaP(int x,int y){
        double a,p;
        a=x*y;
        p=2*(x+y);
        System.out.println("Area : "+a+"Perimeter : "+p);
    }
    public static void isRectEmpty(int x,int y){
        if(x!=0 && y!=0){
            System.out.println("The rectangle is not empty ");
        }else{
            System.out.println("The rectangle is empty");
        }
    }
    static void isRectNull(int a,int b,int c,int d,int e,int f,int g,int h){
        if(a!=0 &&b!=0&&c!=0&&d!=0&&e!=0&&f!=0&&g!=0&&h!=0){
            System.out.println("The rectangle is not empty");
        }else{
            System.out.println("The rectangle is empty");
        }
    }
    static int setRect(int h,int b){
        while(h!=0&&b!=0){
            System.out.println("The new height and breath of the rectangle are : "+h+b);
        }if(h==0&&b==0){
            System.out.println("Invalid input ");
        }
        return 0;
    }
    static void size(int a,int b,int c,int d,int e,int f,int g,int h){
        double p1=Math.abs(a-c);
        double p2=Math.abs(b-d);
        double p3=Math.abs(e-g);
        double p4=Math.abs(f-h);
        double l1=Math.pow(p1,2)-Math.pow(p2,2);
        double l2=Math.pow(p3,2)-Math.pow(p4,2);
        double b1=Math.pow(p1,2)-Math.pow(p2,2);
        double b2=Math.pow(p1,2)-Math.pow(p2,2);
        l1=Math.sqrt(l1);
        l2=Math.sqrt(l2);
        b1=Math.sqrt(b1);
        b2=Math.sqrt(b2);
        if(l1==l2){
            System.out.println("length : "+l1);
        }
        else{
            System.out.println("Wrong coordinates given ");
        }
        if(b1==b2){
            System.out.println("Breadth : "+b1);
        }
        else{
            System.out.println("Wrong coordinates given");
        }
    }
    static void ptlnRect(int x,int y,int a,int b,int c,int d,int e,int f,int g,int h){
        if((a < x && x < c && b < y && y < d) || (e < x && x < g && f < y && y < h)){
            System.out.println("Yes is within the rectangle ");
        }else{
            System.out.println("It does not lie within the rectangle!");
        }
    }
}