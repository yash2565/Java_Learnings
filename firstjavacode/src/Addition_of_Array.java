public class Addition_of_Array {
    //Recursion Problems
    //Summation of Array using Recursion

    public static int addition(int[] arr,int n,int sum) {
        if (n == 0) {
            return sum;
        } else if (arr.length == n) {
            sum += arr[n - 1];
            return addition(arr, n - 1, sum);
        } else {
            sum += arr[n - 1];
            return addition(arr, n - 1, sum);
        }

    }
    static int fibonacci(int n){
//        if(n==1){
//            return 0;
//
//        }
//        else if(n==2){
//            return 1;
//        }
        if(n==1 || n==2){
            return n-1;
        }
        return fibonacci(n-1)+fibonacci(n-2);

    }

    
    public static void main(String[] args) {
        int [] arr={11,1,2,3,4,5,6,7,8,9,10};

        System.out.println(addition(arr,11,0));

        System.out.println(fibonacci(7));




    }
}
