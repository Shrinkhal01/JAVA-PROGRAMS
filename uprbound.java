import java.util.*;
class uprbound{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        System.out.println("Enter the element to find the upper bound");
        int x=s.nextInt();
        int ub=upperbound(a,n,x);
        System.out.println("The upper bound of the element is at index "+ub+" and the element is "+a[ub]);
    }
    public static int upperbound(int a[],int n,int x){
        int l=0;
        int h=n-1;
        int mid=0;
        while(l<=h){
            mid=(l+h)/2;
            if(a[mid]<=x){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return l;
    }
}
