public class SeconLargestElementInArray {



    public static int SecondLargest(int [] arr){
        int max=arr[0];
        int secondmax=arr[0];
        for(int i=0;i<arr.length;i++){

             if(arr[i]>max){
                 secondmax=max;
                 max=arr[i];
            }
        }
        return secondmax;
    }
    public static void main(String[] args) {
        int[] arr= {55,2,34,5,645,3654};
//        outputT:34
        System.out.println(SecondLargest(arr));

    }
}
