import java.util.Arrays;

class Solution {
    int ans=-1;
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5,3,1};
        int target=3;

       //System.out.println(Arrays.toString(searchRange(nums, target)));
        int ans=mountain_array(nums,target);
        System.out.println(ans);





    }
    static int orderAgnosticBS(int[] arr, int target,int start,int end){

        boolean isAsc=arr[start]<=arr[end];

        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            if (isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else {
                if(target>arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }

    public static  int search (int [] nums,int target,boolean FirstStartIndex){
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]) {
                start=mid+1;
            }
            else{
                ans=mid;
                if(FirstStartIndex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }

    public static int findPeakElement(int[] nums) {
        int start =0;
        int end=nums.length-1;

        while(start<end){
            int mid=(start+end)/2;

            if(nums[mid]>nums[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;

    }
   public  static int[] searchRange(int[] nums, int target) {
        int [] ans={-1,-1};
        int start=search(nums,target,true);
        int end=search(nums,target,false);

       ans[0]=start;
       ans[1]=end;
       return  ans;
    }

    public  static int mountain_array(int [] nums,int target){
        int peak=findPeakElement(nums);
        int firstTry=orderAgnosticBS(nums,target,0,peak);
        if(firstTry!=-1){
            return firstTry;

        }
        return orderAgnosticBS(nums,target,peak+1,nums.length-1);

    }

    static int search1(int[] nums,int target){
        int pivot=findPivot(nums);

        if(pivot==-1){
            return binarySearch(nums,target,0,nums.length-1);
        }
        if(nums[pivot]==target){
            return pivot;
        }

        if(target>=nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }
        return binarySearch(nums,target,pivot+1,nums.length-1);
    }

    static int binarySearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;

            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }



    static int findPivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){

            int mid=start+(end-start)/2;

            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;

            }
            if(arr[mid]<arr[mid-1]){
                return mid-1;

            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}