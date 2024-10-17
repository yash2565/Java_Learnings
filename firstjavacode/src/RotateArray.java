import java.util.ArrayList;
import java.util.Arrays;
import  java.util.Collections;

class RotateArray {
     public static void rotate(int[] nums, int k) {

        ArrayList point = new ArrayList();
        for (int i = nums.length -1; i>=k ; i--) {
            point.add(nums[i]);
        }
         System.out.println(point.toString());
        Collections.reverse(point);
         System.out.println(point.toString());
        for (int i = 0; i < nums.length-k ; i++) {
            point.add(nums[i]);
        }
        point.toArray();
         System.out.println(point);
    }

    public static void main(String[] args) {
        int[] nums ={-1,-100,3,99};
        int key =2;
        rotate(nums,key);
    }
}