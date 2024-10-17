import java.util.Scanner;
import java.util.*;
public class java_methods {
//    public static int mult(int a ,int b){
//        int product=a*b;
//        return product;
//
//    }
//    public static int factorial(int n){
//        int f=1;
//        for(int i=1;i<=n;i++)
//        {
//            f=f*i;
//        }
//        return f;
//
//    }


//    public static int bincoef(int n,int r){
//        int fact_n=factorial(n);
//        int fact_r=factorial(r);
//        int nmr=factorial(n-r);
//        int coe=fact_n/(fact_r*nmr);
//        return coe;
//    }



//    public static boolean isPrime(int n){
//        boolean isPrime=true;
//        for(int i=2;i<=n-1;i++){
//            if(n%i==0){
//                isPrime=false;
//                break;
//            }
//        }
//
//        return isPrime;
//    }

//
//    public static boolean isPrime(int  n){
//        for(int i=2;i<=Math.sqrt(n);i++){
//            if(n%i==0){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void Primerange(int n){
//        for (int i=2;i<=n;i++){
//            if(isPrime(i)){
//                System.out.print(i+ " ");
//
//            }
//
//        }
//        System.out.println();
//
//    }

//Binary To Decimal Conversion
//    public static void BintoDec(int n){
//        int bin=n;
//        int pow=0;
//        int dec=0;
//        while(n>0){
//            int lastdigit=n%10;
//            dec=dec + (lastdigit*(int)Math.pow(2,pow));
//            pow++;
//            n=n/10;
//        }
//        System.out.println("Binary "+bin +"="+"Decimal "+ dec);
//
//    }

    public static void DectoBin(int n){
        int dec=n;
        int pow=0;
        int bin=0;


        while(n>0){
            int  remainder=n%2;
            bin=bin+(remainder*(int)Math.pow(10,pow));
            pow++;
            n=n/2;

        }
        System.out.println(dec+"="+bin);
    }

    public static int LinearSearch(int numbers[] ,int key){
        for (int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int a= 5;
//        int b= 10;

//       int prod= mult(a,b);
//       System.out.println(prod);
//        System.out.println(factorial(7));

//        System.out.println(bincoef(2 ,2));
//
//        System.out.println(isPrime(7));
//        Primerange(100);
//        BintoDec(111);
//        DectoBin(10);


        //Linear Search of Array
        int numbers[]={2,4,6,8,10,12,14,16};
        int key=10;
        int index=LinearSearch(numbers,key);
        if(index==-1){
            System.out.println("Not Found");

        }
        else{
            System.out.println("Key index is "+ index);
        }





    }
}
