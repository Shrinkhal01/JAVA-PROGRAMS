import java.util.*;
class firstmissing{
    public static void main(String[] args) {
        firstmissing object=new firstmissing();
        int array[]={1,5,6,8,9,12,15};
        System.out.print("The present array is : ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Kth position of the element of want : ");
        int k=s.nextInt();
        int answer=object.missing(array,k);
        System.out.println("The missing element at "+k+"th position is : "+answer);
    }
    int missing(int arr[],int k){
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            int mis=arr[mid]-(mid+1);
            if(mis<k){low=mid+1;}
            else{high=mid-1;}
        }
        return (low+k);
    }
}
