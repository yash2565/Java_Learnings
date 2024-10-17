public class Java_Searching_Algorithms {
    public static void main(String[] args) {
        int[] arr={3,5,7,9,10,12,14,16,18};
        int target=1;

        char[] letters={'c','f','j'};
        char target1='j';


        int ans=orderAgnosticBS(arr,target);
        System.out.println(ans);

        int ans2=CelingofaNumber(arr,target);
        System.out.println(ans2);

        char ans4=GreatestLetter(letters,target1);
        System.out.println(ans4);


        int ans3=FloorofaNumber(arr,target);
        System.out.println(ans3);


    }
    //Binary Search all Optimized
    static int orderAgnosticBS(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

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

    static int CelingofaNumber(int[] arr,int target){
        if(target>=arr[arr.length-1]){
            return -1;
        }
        int start=0;
        int end=arr.length-1;
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
        return arr[start];
    }


    static char GreatestLetter(char[] letters,char target){

        int start=0;
        int end=letters.length-1;
        while(start<=end){
            int mid=(start+end)/2;

            if(target<letters[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }


        return letters[start % letters.length];
    }

    static int FloorofaNumber(int[] nums,int target){

        int start=0;
        int end=nums.length-1;
        if(target<=nums[start]){
            return -1;
        }
        boolean isAsc=nums[start]<=nums[end];

        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            if (isAsc){
                if(target<nums[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else {
                if(target>nums[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return nums[end];
    }
}
