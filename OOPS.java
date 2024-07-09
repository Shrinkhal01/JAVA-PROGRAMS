class Pen{
    String colour;
    String type;//ball or gel pen ho skta h

    public void write(){
        System.out.println("write something");
    }
    public void printColor(){
        System.out.println(this.colour);
    }
}

class Student{
    String nm;
    int age;
    public void printInfo(){
        System.out.println(this.nm);
        System.out.println(this.age);  
    }
}

public class OOPS{
    public static void main(String args[]){
        Pen pen1=new Pen();
        pen1.colour="blue";
        pen1.type="gel";
        pen1.write();
        Pen pen2=new Pen();
        pen2.colour="black";
        pen2.type="ball";

        pen1.printColor();
        pen2.printColor();
        Student s1=new Student();
        s1.nm="Rohan";
        s1.age=89;
        s1.printInfo();
    }
}