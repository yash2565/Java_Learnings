import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;



public class repeatition_of_no {
    public static void main(String[] args) {
 //       Scanner sc= new Scanner(System.in);
//        int[] n={1,2,33,44,55,677,879,99};
//
////        int count=0;
////        while(n>0){
////            int rem=n%10;
////            if(rem == 6){
////                count++;
////            }
////            n=n/10;
////        }
////        System.out.println(count);
//        Arrays.sort(n);
//        for(int i=0;i<n.length;i++){
//            System.out.print(n[i]+" ");
//        }

        //counting no of 2's repeated
//        int num=2123242324212;
//        int count=0;
//        while(num>0){
//            int remainder=num%10;
//            if(remainder==2) {
//                count++;
//            }
//            num/=10;
//        }
//        System.out.println(count);



        //reverse of the number
         int num1=1234;
         int ans=0;
         while(num1>0){
             int rem=num1%10;
             num1/=10;
             ans=ans*10+rem;

         }
        System.out.println(ans);
    }
}
