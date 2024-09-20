import java.util.*;
class smallerself{
    public static void main(String[] args) {
        smallerself solution = new smallerself();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length=s.nextInt();
        int nums[]=new int[length];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<length;i++){
            nums[i]=s.nextInt();
        }
        System.out.println(solution.Countsml(nums)); // Output: [2, 1, 1, 0]
    }
    List<Integer> Countsml(int[] nums){
        int n=nums.length;
        Integer[] result=new Integer[n];
        Arrays.fill(result,0);//this initializes the array with 0
        int[] indices=new int[n];
        for(int i=0;i<n;i++){
            indices[i]=i;
        }
        mergeSort(nums,indices,result,0,n-1);
        return Arrays.asList(result);
    }

    private void mergeSort(int[] nums,int[] indices,Integer[] result,int left,int right){
        if(left>=right){
            return;
        }
        int mid=left+(right-left)/2;
        mergeSort(nums, indices, result, left, mid);
        mergeSort(nums, indices, result, mid+1, right);
        merge(nums,indices,result,left,mid,right);
    }

    private void merge(int[] nums,int[] indices,Integer[] result,int left,int mid,int right){
        int[] temp=new int[right-left+1];
        int i=left;
        int j=mid+1;
        int k=0;
        int rightCount=0;
        while(i<=mid && j<=right){
            if(nums[indices[j]]<nums[indices[i]]){
                temp[k]=indices[j];
                rightCount++;
                j++;
            }else{
                temp[k]=indices[i];
                result[indices[i]]+=rightCount;
                i++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=indices[i];
            result[indices[i]]=rightCount;
            i++;
        }
        while(j<=right){
            temp[k++]=result[j++];
        }
        System.arraycopy(temp, 0, indices, left, right - left + 1);
    }
}
