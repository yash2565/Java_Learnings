import java.util.*;
public class java_arrays {
//    public static int LinearSearch(int numbers[] ,int key){
//        for (int i=0;i<numbers.length;i++){
//            if(numbers[i]==key){
//                return i;
//            }
//        }
//        return -1;
//  }

    public static int binarysearch(int numbers[],int key){
        int start=0;
        int end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
               return mid;
            }
            if(numbers[mid]<key){
                start=mid+1;

            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
//        public static int getlargest(int numbers[]){
//            int largest=Integer.MIN_VALUE;
//            int smallest=Integer.MAX_VALUE;
//            for (int i=0;i<numbers.length;i++){
//                if(largest<numbers[i]){
//                    largest=numbers[i];
//                }
//                if(smallest>numbers[i]){
//                    smallest=numbers[i];
//                }
//
//            }
//            System.out.println("Smallest no is "+ smallest);
//            return largest;
//        }

//
//    public static void reverse(int numbers[]){
//        int first=0; int last=numbers.length-1;
//
//        while(first<last){
//
//            int temp=numbers[last];
//            numbers[last]=numbers[first];
//            numbers[first]=temp;
//
//            first++;
//            last--;
//
//        }
//    }
//
//
//    public static int BinarySearch(int numbers[],int key){
//        int start =0, end =numbers.length-1;
//        while(start<=end){
//            int mid=(start+end)/2;
//
//            if(numbers[mid]==key){
//                return mid;
//
//            }
//            if(numbers[mid]<key){ //right  i.e 2nd half
//                start=mid+1;
//
//            }
//            else{                  //left i.e 1st half
//                end=mid-1;
//            }
//        }
//        return -1;
//    }


    //Pairs of the no
//    public static void printpair(int numbers[]){
//        for(int i=0;i<numbers.length;i++){
//            int current=numbers[i];
//            for(int j=i+1;j<numbers.length;j++){
//                System.out.print("(" +current +","+ numbers[j] +") ");
//            }
//            System.out.println();
//        }
//
//    }

  //  Subarray
//    public static void subarray(int numbers[]){
//        for (int i=0;i<numbers.length;i++){
//            int start =i;
//            for (int j=i;j<numbers.length;j++){
//                int end =j;
//                for(int k=start;k<=end;k++){
//                    System.out.print(numbers[k]+" ");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }
//    }

//    //Maximum Sum of Subarray                               //bruteforce method
//    public static void maxsubarray(int numbers[]){
//        int cursum=0;
//        int maxsum=Integer.MIN_VALUE;
//
//        for (int i=0;i<numbers.length;i++){
//            int start =i;
//            for (int j=i;j<numbers.length;j++){
//                int end =j;
//                cursum=0; //inorder to make new array start with zero always while entering in the loop
//                for(int k=start;k<=end;k++){
//                    cursum+= numbers[k];
//
//                }
//                System.out.println(cursum);
//                if(maxsum<cursum){
//                    maxsum=cursum;
//                }
//            }
//        }
//        System.out.println("maximum subarray sum = "+maxsum);
//    }



    //Prefix Sum
//    public static void maxsubarray_prefixsum(int numbers[]){
//        int cursum=0;
//        int maxsum=Integer.MIN_VALUE;
//        int prefix[]=new int[numbers.length];
//
//        //prefix array
//        for (int i=1;i<prefix.length;i++){
//            prefix[i]=prefix[i-1] + numbers[i];
//        }
//        for (int i=0;i<numbers.length;i++){
//            int start =i;
//            for (int j=i;j<numbers.length;j++){
//                int end =j;
//                cursum=start ==0 ? prefix[end]:prefix[end]-prefix[start-1];
//                if(maxsum<cursum){
//                    maxsum=cursum;
//                }
//            }
//        }
//        System.out.println("maximum subarray sum = "+maxsum);
//    }


    public static void maxsubarray_kedanes(int numbers[]){         //time complexity O(n) i.e least
        int ms=Integer.MIN_VALUE;
        int cs=0;

        for (int i=0;i<numbers.length;i++){
            cs=cs+numbers[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("Maximum sum of the subarray is = "+ ms);
    }


//    public static int trappedrainwater(int height[]){
//        int leftmax[]=new int[height.length];
//        leftmax[0]=height[0];
//        for(int i=1;i<height.length;i++){
//            leftmax[i]=Math.max(height[i],leftmax[i-1]);
//        }
//        int rightmax[]=new int[height.length];
//        rightmax[height.length-1]=height[height.length-1];
//        for (int i=height.length-2;i>=0;i--){
//            rightmax[i]=Math.max(height[i],rightmax[i+1]);
//        }
//        int trappedwater=0;
//        for(int i=0;i<height.length;i++){
//            int waterlevel=Math.min(leftmax[i],rightmax[i]);
//            trappedwater +=waterlevel - height[i];
//        }
//        return trappedwater;
//    }

//    public static int buysellstocks(int prices[]){ //O(n)
//        int buyPrice=Integer.MAX_VALUE;
//        int maxprofit=0;
//
//        for(int i=0;i<prices.length;i++){
//            if(buyPrice<prices[i]){
//                int profit=prices[i]-buyPrice;
//                maxprofit=Math.max(profit,maxprofit);
//            }
//            else{
//                buyPrice=prices[i];
//            }
//        }
//        System.out.println("Time to buy the stock = "+buyPrice); //minimum value at which we should buy the stock
//        return maxprofit; //maximum value at which we should sell the stock
//
//    }



    //Decreasing subarray
//static  int sub(int [] arr ,int n){
//        int len=1;
//        int count=0;
//        for(int i=0;i<n-1;i++){
//     if(arr[i+1]  < arr[i]){
//         len++;
//     }
//     else{
//         count += (((len-1)*len)/2);
//         len=1;
//     }
//
//        }
//       if(len>1){
//           count += (((len-1)*len)/2);
//       }
//       return count;
//}






    public static void main(String[] args) {

//        int [] arr={100,3,1,13};
//        int n = arr.length;
//        System.out.println(sub(arr,n));
// Array index start from 0
//        there are 3 ways to declare array
//        1. int [] marks= new int [5];    Declration and Memory Allocation

//        2. int [] marks;   Declaration and then
//         marks=new int[6];   Memory Allocation

//        3.int [] rollno={1,2,3,4,5}; //Declaration , Memory Allocation and initlaization and automatically index detection
//
//        marks [1]=90;
//        System.out.println(marks [1]);
//        System.out.println(rollno [2]);




        //Printing array using for loop
//         int [] marks={1,2,3,4,5,6};
//        System.out.println(marks.length);
//        for(int i=0;i<marks.length;i++)
//        {
//            System.out.println(marks[i]);
//        }
//        //Reverse order
//        for(int i=marks.length-1;i>=0;i--)
//        {
//            System.out.println(marks[i]);
//        }
//        //brings elements or values from any given array to store
//        int [] rollno={1,2,3,4,5};
//        for(int element:rollno){
//            System.out.println(element);
//        }

        //Linear Search in Array
//        int numbers[]={2,4,6,8,10,12,14,16};
//        int key=10;
//        int index=LinearSearch(numbers,key);
//        if(index==-1){
//            System.out.println("Not Found");
//
//        }
//        else{
//            System.out.println("Key index is "+ index);
//        }

          //Largest Number

//        int numbers[]={1,2,6,3,5};
//        System.out.println("Largest no is "+ getlargest(numbers));



        //Binary Serach if returns index is -1 then element does not exist
      //  int numbers[]={2,4,6,8,10,12,14,16};
        //int key=16;
        //System.out.println("key is present at index "+binarysearch(numbers,key));


        //  Reverse Array
//        int numbers[]={1,2,3,4,5,6,7,8,9};
//        reverse(numbers);
//        for(int i=0;i<numbers.length;i++){
//            System.out.print(numbers[i]+" ");
//        }
//        System.out.println(" ");


//        //Pairs Printing together
//        int numbers[]={2,4,6,8,10,12,14,16};
//        printpair(numbers);


        //Subarray
//        int numbers[]={2,4,6,8,10,12,14,16};
//        subarray(numbers);


//        int numbers[]={1,4,-1,-5,6};
//        maxsubarray(numbers);


//        int numbers[]={1,-2,6,-1,3};
//        maxsubarray_prefixsum(numbers);

        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        maxsubarray_kedanes(numbers);

//        int height[]={4,2,0,3,2,5};
//        System.out.println(trappedrainwater(height));

//        int prices[]={7,1,5,3,6,4};
//        System.out.println("Maximum profit will be at = " +buysellstocks(prices));


    }
}

