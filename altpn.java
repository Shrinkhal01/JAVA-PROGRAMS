import java.util.*;

class altpn{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        System.out.println("Enter length array : ");
        int n = s.nextInt();
        System.out.println("Enter array elements : ");
        for(int i=0;i<n;i++){
            ar.add(s.nextInt());
        }
        altpn obj = new altpn();
        obj.alterpn(ar);//function to alternate positive and negative numbers
        System.out.println("The array after the setting of positive numbers is:");
        for(int i=0;i<ar.size();i++){
            System.out.print(ar.get(i)+" ");
        }
        s.close();//close the scanner
    }
    void alterpn(ArrayList<Integer> ar){
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i=0;i<ar.size();i++){
            if(ar.get(i)<0){
                neg.add(ar.get(i));
            }//populate the neg array with negative numbers
            else{
                pos.add(ar.get(i));
            }//populate the pos array with positive numbers
        }
        ar.clear();
        int i=0,j=0,k=0;
        boolean turn = true;
        while(i<pos.size() && j<neg.size()){
            if(turn){
                ar.add(pos.get(i));
                i++;
            }//add positive number if turn is true
            else{
                ar.add(neg.get(j));
                j++;
            }//add negative number if turn is false
            turn = !turn;
        }
        while(i<pos.size()){
            ar.add(pos.get(i));
            i++;
        }//add remaining positive numbers
        while(j<neg.size()){
            ar.add(neg.get(j));
            j++;
        }//add remaining negative numbers
    }
}
