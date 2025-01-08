
import java.util.*;
public class Accen2 {


    public static boolean isPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            } else if (str.charAt(i)==str.charAt(j)) {
                i++;
                j--;


            }

        }
        return true;
    }

//    public static int bakesale(int []arr){
//        int product=1;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]%7==0){
//                product*=arr[i];
//            }
//        }
//        if(product>1){
//            return product;
//        }
//        return 0;
//    }
//
//    static int maximumproduct(int []arr){
//       int product=1;
//       Arrays.sort(arr);
//       for(int i=0;i<arr.length;i++){
//
//               product*=arr[i];
//
//
//       }
//       return product;
//    }

//    static int sumofnnaturalnumbers(int n){
//        int sum=0;
//        for(int i=0;i<=n;i++){
//
//            sum+=i;
//        }
//        return sum;
//    }


//    static int sumofmaximumele(int []arr){
//        int sum=arr[arr.length-1];
//        int m=arr[arr.length-1];
//        for(int i= arr.length-2;i>=0;i--){
//            if(arr[i]>m){
//                sum+=arr[i];
//                m=arr[i];
//            }
//        }
//
//        return sum;
//
//    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //for clock 12hrs conversion problem
//        int x=sc.nextInt();
//        int y=sc.nextInt();
//        if(x*y>12){
//            System.out.println((x*y)-12);
//        }
//        else{
//            System.out.println(x*y);
//        }

        //for dog age question
//        int age=sc.nextInt();
//        int result=7*age;
//        System.out.println(result);

        //area of cylinder
//        double radius=sc.nextInt();
//        double height=sc.nextInt();
//        double area=Math.round(3.14*radius*radius*height);
//        System.out.print(area);

        //The charity bake sale
//        int []arr={11,10,8};
//        System.out.println(bakesale(arr));


        //cars speed




//        int arr[]={-11,-10,3,1,2};
//
//        System.out.print(maximumproduct(arr));

       // System.out.println(sumofnnaturalnumbers(25));

        //diwali contest

//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int ans=(a*60)-(b);
//        if(c>60){
//            System.out.println(a-2);
//        }
//        else if(){
//            System.out.println(a-1);
//        }


//        int []arr111={62,66,64,45,33,22,12};
//
//        System.out.println(sumofmaximumele(arr111));

        //sum of only even elements and only odd elements
//        int []newarr={11,10,9};
//        int even=0;
//        int odd=0;
//        for (int i = 0; i <newarr.length ; i++) {
//            if(newarr[i]%2==0){
//                even+=newarr[i];
//            }
//            else {
//                odd+=newarr[i];
//            }
//
//        }
//        System.out.println(even+" "+odd);


         // N rows of Floyad’s Triangle
//        int n=sc.nextInt();
//        int var=0;
//        for(int i=1;i<=n;i++){
//            for (int j=1;j<=i ;j++ ){
//                var++;
//                System.out.print(var+" ");
//            }
//            System.out.println();
//        }

        //longest string in the given list of strings
//        String str="My name is Yash Musmade";
//        int maxcount=0;
//        String finals="";
//        int count=0;
//        String temp="";
//        for (int i = 0; i <str.length() ; i++) {
//            char ch=str.charAt(i);
//
//            if(ch==' ' ){
//                temp="";
//                count=0;
//            }
//            else{
//                temp+=ch;
//                count++;
//            }
//            if(count>maxcount){
//                finals=temp;
//                maxcount=count;
//            }
//        }
//
//        System.out.println("Longest word is:- "+finals);



//        int [] arr={1,4,2,3,4,5,0,2,3};
//        int [] ar1=new int[10];
//
//        int max=0;
//        for(int i=0;i<arr.length-1;i++){
//            int sum=0;
//            System.out.println(arr[i]);
//
//                System.out.println(arr[i]);
//
//                for(int j=0;j<arr.length;j++){
//                    if(arr[i]>arr[i+1]){
//                        ar1[j]=arr[i];
//
//                    }
//
//                }
//
//
//
//                }
////            else if (arr[i]<arr[i+1]) {
////
////
////
////                }
//        System.out.println(Arrays.toString(ar1));
//

//        int [] arr={1,4,2,3,4,5,0,2,3};
//        int ms=Integer.MIN_VALUE;
//        int cs=0;
//
//        for (int i=0;i<arr.length;i++){
//            cs=cs+arr[i];
//
//            if(cs<0){
//                cs=0;
//            }
//            ms=Math.max(cs,ms);
//        }
//        System.out.println("Maximum sum of the subarray is = "+ ms);


//        int a=54321;
//        String str=Integer.toString((a));
//        StringBuilder sb=new StringBuilder(str);
//        sb=sb.reverse();
//        int ac=Integer.parseInt(sb.toString());
//        System.out.println(ac);


//        int [] arr={1,2,3,4,5,6,7,8,9,10};
//        int temp;
//        for(int i=arr.length-1;i>=0;i--){
//            System.out.print(arr[i]+" ");
//        }
//

//        int [] arr={1,2,3,4,5,6,7,8,9,10};
//        int sum=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]%2!=0){
//                sum+=arr[i];
//            }
//
//        }
//        System.out.println(sum);
//
//        int ab=sc.nextInt();
//        if(ab%2!=0){
//            System.out.println(ab/2);
//        } else if (ab%2==0) {
//            System.out.println((ab-1)/2);
//        } else if (ab<10 && ab>0) {
//            System.out.println(ab);
//        }



//        int []arr1={7,9,5,2,8,7};
//        int max=arr1[arr1.length-1];
//        int count=1;
//        for(int i=arr1.length-2;i>=0;i--){
//
//
//            if(arr1[i]>max){
//                count++;
//                max=arr1[i];
//
//            }
//
//        }
//        System.out.println(count);


        //sum of n natural numbers
//        int n=sc.nextInt();
//        int sum=0;
//        for(int i=0;i<=n;i++){
//            sum+=i;
//        }
//        System.out.println(sum+1);
//
//


//        int []arr={1,2,3,4,5};
//        int count=0;
//        for(int i=0;i< arr.length-1;i++){
//            for(int j=1;j< arr.length;j++){
//                if(arr[i]>arr[j]){
//
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
//


        //Palindrome
        String str="naman";
        System.out.println(isPalindrome(str));









    }
}
