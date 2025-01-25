import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Armstrong_no {

    static boolean armstrong(int n){
        int original=n;
        int sum=0;

        while(n>0){
            int rem =n%10;
            n=n/10;
            sum=sum+rem*rem*rem;
        }
        return sum==original;
    }



    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
//        reverse(arr);
//        System.out.println(Arrays.toString(arr));

        for (int i = 0; i <1000 ; i++) {
            if(armstrong(i)){
                System.out.print(i+" ");
            }

        }
    }




    //    static void reverse(int [] arr ){
//        int start=0;
//        int end=arr.length-1;
//        while(start<end){
//            swap(arr,start,end);
//            start++;
//            end--;
//        }
//
//    }
    static void swap(int [] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }
}
