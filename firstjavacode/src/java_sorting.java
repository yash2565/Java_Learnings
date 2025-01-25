import java.util.*;
public class java_sorting {

    public static void bubblesort(int arr[]){   //O(n^2) time complexity
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];   //swapping logic
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

//    public static void selectionsort(int arr[]){  //O(n^2) time complexity
//        for(int i=0;i<arr.length-1;i++){
//            int minpos=i;
//            int maxpos=arr.length-1;
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[minpos]>arr[j]){     //Acending order
//                    minpos=j;
//                }
//                if(arr[maxpos]<arr[j]){   //Decending order
//                    maxpos=j;
//                }
//
//            }
//            //swap
//            int temp=arr[minpos];
//            arr[minpos]=arr[i];
//            arr[i]=temp;
//        }
//    }

//    public static void insertionsort(int arr[]){
//        for(int i=1;i<arr.length;i++){
//            int curr=arr[i];
//            int prev=i-1;
//
//            while(prev>=0 && arr[prev]>curr){
//                arr[prev+1]=arr[prev];
//                prev--;
//
//            }
//            //insertion
//            arr[prev+1]=curr;
//        }
//
//    }


//    public static void countingsort(int arr[]){
//        int largest=Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//            largest=Math.max(largest,arr[i]);
//        }
//        int count[]=new int[largest+1];
//        for(int i=0;i<arr.length;i++) {
//            count[arr[i]]++;
//        }
//        //sorting
//        int j=0;
//        for(int i=0;i<count.length;i++){
//            while(count[i]>0){
//                arr[j]=i;
//                j++;
//                count[i]--;
//            }
//        }
//    }


    public static void main(String[] args) {

        //Bubble sort
        int arr[]={5,4,2,3,1};
        bubblesort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


        //Selection Sort
//        int arr[]={5,4,2,3,1};
//        selectionsort(arr);
//        for (int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }

        //Insertion sort
//        int arr[]={5,4,1,3,2};
//        insertionsort(arr);
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }

        //Inbuilt Sort
//        Integer arr[]={5,-5,4,-4,1,-1,3,-3,2,-2,0};                     //ReverseOrder function work on Object Type variable
//        Arrays.sort(arr);
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        Arrays.sort(arr,0,4);
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }


        //Counting sort
//        int arr[]={5,4,1,3,2};
//        countingsort(arr);
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }






    }
}
