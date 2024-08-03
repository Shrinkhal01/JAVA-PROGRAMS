import java.util.*;
public class reversell{
    public static void main(String[] args){
        LinkedList<Integer> ll=new LinkedList<>();
        int length;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of list");
        length=s.nextInt();
        for(int i=0;i<length;i++){
            ll.add(s.nextInt());
        }
        System.out.println("The linkedlist initially is ");
        System.out.println(ll);
        //now let us begin reversing the linkedlist
        int start = 0;
        int end = ll.size() - 1;
        while (start < end) {
            int temp = ll.get(start);   // store the first element in the temp variable
            ll.set(start, ll.get(end)); // set the value at the start to the value at the end
            ll.set(end, temp);          // set the value at the end to the value stored in temp
            start++;
            end--;
            // reduce the size for the further reversal process
        }

        System.out.println("the reversed list is:");
        System.out.println(ll);

    }
}