import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class java_Arraylist {
    public static void main(String[] args) {
//        ArrayList<Integer> list =new ArrayList<>();  //Constructor
        Scanner sc = new Scanner(System.in);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//
//        System.out.println(list.contains(54));
//        list.set(0,2);
//        list.remove(2);
//
//        for (int i = 0; i < 6; i++) {
//            list.add(sc.nextInt());
//
//        }
//        for (int i = 0; i <6 ; i++) {
//            System.out.println(list.get(i));
//        }
//
//
//
//
//        System.out.println(list);
        //Initialitation of a multi dimenstional ArrayList
//        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//        for (int i = 0; i < 3; i++) {
//            list.add(new ArrayList<>());
//
//
//        }
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                list.get(i).add(sc.nextInt());
//            }
//
//        }
//        System.out.println(list);
//

        //swap
//        int[] arr = {1, 2, 3, 4, 5, 6};
//        reverse(arr);
//
//        System.out.println(Arrays.toString(arr));
//    }
//    static void reverse(int []arr){
//
//        int start=0;
//        int end=arr.length-1;
//
//        while(start<end){
//            swap(arr,start,end);
//            start++;
//            end--;
//
//        }

        int[]arr1={1,2,3,4,9,10,11,12};
        int[]arr2={5,6,7,8};
        merge(arr1,arr2);


//    }
//       static void swap(int[] arr,int start,int end) {
//           int temp = arr[start];
//           arr[start] = arr[end];
//           arr[end] = temp;
//       }

    }

    static void merge(int[] arr1, int[] arr2) {
        int b = arr1.length + arr2.length;
        int a=arr1.length;
        int[] arr = new int[b];
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];

        }
        for (int j = a; j < b; j++) {
            arr[j] = arr2[j-a];
        }
        System.out.println(Arrays.toString(arr));


        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
