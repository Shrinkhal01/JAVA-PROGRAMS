import java.util.*;
class queueint{
    public static void main(String[] args){
        Queue <Integer>  q=new LinkedList<>();
        q.add(19);
        q.add(92);
        q.add(47);
        q.add(65);
        q.add(32);
        q.add(89);

        Queue <Integer> p=new LinkedList<>();
        p.add(9);
        p.add(31);
        p.add(54);
        p.add(75);
        p.add(85);
        p.add(89);

        queinter(q,p);
    }

    public static void queinter(Queue<Integer> a,Queue <Integer> b){
        int x,y;
        while(!a.isEmpty() && !b.isEmpty()){
            x=a.poll();//the poll function retreives 
            y=b.poll();//and removes the head of the queue
            if(x==y){
                System.out.println("The intersecting element is "+x);
                return;
            }
        }
        System.out.println("There is no intersecting element!!");
    }
}