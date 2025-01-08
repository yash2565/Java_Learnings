
import java.util.Arrays;
import java.util.Scanner;
public class Accen4 {

//    public static int Logical_Operations(String str, int n){
//        int c=str.charAt(0);
//        if(n==0){
//            return -1;
//        }
//        for(int i=1;i<n-1; i+=2){
//
//            int b=Integer.parseInt(String.valueOf(str.charAt(i+1)));
//            if(str.charAt(i)=='A'){
//                c&=b;
//
//            }
//            else if(str.charAt(i)=='B'){
//                c|=b;
//
//            }
//            else if(str.charAt(i)=='C'){
//                c^=b;
//
//            }
//            System.out.println(c);
//
//
//        }
//        return c;
//    }

//    public static int Maxnumber(int [] arr){
//
//        int max=Integer.MIN_VALUE;
//        if(arr.length==0){
//            return 0;
//        }
//        for(int i=0;i< arr.length;i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//
//        }
//        return max;
//    }

//    public static int Secondmax(int arr[]){
//
//        int max=Integer.MIN_VALUE;
//        int secondmax=arr[0];
//        for (int i = 0; i < arr.length ; i++) {
//            if(arr[i]>max){
//                secondmax=max;
//                max=arr[i];
//
//            }
//
//
//        }
//        return secondmax;
//    }

//    public static void Return_k_words(String str,int k){
//
//
//        String [] str2=str.split(" ");
//
//        for(int i=0;i<k;i++){
//
//            if(i==k-1){
//                System.out.print(str2[i]);
//                break;
//
//
//            }
//            System.out.print(str2[i] +" ");
//        }
//
//
//    }
//
//sum of prime no using inbuilt function in java
//   public static int sumofprimenos(int n){
//       int sum=0;
//       for(int i=2;i<=n;i++){
//           if(isprime(i)){
//               sum+=i;
//               System.out.println(sum);
//           }
//       }
//       return sum;
//   }
//    public static boolean isprime(int n){
//        if(n<=1){
//            return false;
//        }
//        for(int i=2;i<=n/2;i++){
//            if(n%i==0){
//                return false;
//            }
//        }
//        return true;
//    }

//    public static boolean isprime(int n){
//        if(n<=1){
//            return false;
//        }
//        for(int i=2;i>Math.sqrt(n);i++){
//            if(n%i==0){
//                return false;
//            }
//
//        }
//        return true;
//    }

//    public static void rotate(int[] arr, int k) {
//        int n = arr.length;
//        k = k % n; // In case k is larger than n
//        reverse(arr, 0, n - 1);
//        reverse(arr, 0, k - 1);
//        reverse(arr, k, n - 1);
//    }
//    private static void reverse(int[] arr, int start, int end) {
//        while (start < end) {
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//    }




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr={1,2,3,4,5};

//        rotate(arr,2);
//        System.out.println(Arrays.toString(arr));

        int n=sc.nextInt();
        String []str=new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.nextLine();
            System.out.println(str[i]);

        }
        String s=sc.nextLine();
        String c=str[1];
        System.out.println(c);
        for(int j=0;j<n;j++){
            String d= str[j];
            if(d.equals(s)){
                System.out.println(j);
            }
        }
        System.out.println(-1);



//        int a=sc.nextInt();
//        int sum=0;
//
//        while(a!=0){
//            sum+=a%10;
//            a=a/10;
//
//        }
//
//
//        if(isprime(sum)){
//            System.out.println("Yes");
//        }
//        else{
//            System.out.println("No");
//        }

        //String str=sc.nextLine();
        //int n=str.length();
       // System.out.println(Logical_Operations(str,n));
        //int arr[]={1,2,3,4,5,6,7,8};
       // System.out.println(Maxnumber(arr));

//        int arr[]={1,2,3,4,5,6,7,8};
//        System.out.println(Secondmax(arr));


        //repeat the string
//        int n=sc.nextInt();
//        String str="Yash";
//        String a="";
//        for(int i=0;i<n;i++){
//            a+=str;
//        }
//        System.out.println(a+" ");
//

//        String str="Yash Sanjay Musmade";
//        Return_k_words(str,2);


        //switches bulbs on off
//        int count=0;
//        int []arr={1,1,0,1,1,1,1,1};
//        for(int i=0;i<arr.length;i++){
//            if(count%2==0){
//                if(arr[i]==0){
//                    count++;
//                }
//            }
//            else{
//                if(arr[i]==1){
//                    count++;
//
//                }
//            }
//        }
//        System.out.println(count);



        //sum of all primenos code using function
//       int n=sc.nextInt();
//       System.out.println(sumofprimenos(n));
//
//       int sum=0;
//       for(int i=2;i<=n;i++){
//           int count=0;
//           for(int j=2;j<=i/2;j++){
//               if(i%j==0){
//                   count++;
//                   break;
//               }
//           }
//           if(count==0 && i!=1){
//               sum+=i;
//           }
//       }
//       System.out.println(sum);

//        int arr[]={1,2,1,3,2};
//        int count=0;
//
//        if(arr.length<=1){
//            System.out.println(0);
//
//        }
//        for (int i = 0; i <arr.length-1 ; i++) {
//            if(arr[i]>arr[i+1]){
//                count++;
//            }
//        }
//        System.out.println(count);
//


//        int arr[]= {12,16,21,20};
//        int count=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]%3==0){
//                count++;
//                System.out.println(arr[i]);
//            }
//        }
//        System.out.println(count);




    }
}