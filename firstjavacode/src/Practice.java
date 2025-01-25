import com.sun.xml.internal.ws.util.StringUtils;

import java.util.*;
import java.util.Random;


public class Practice {

//    static boolean isPrime(int n){
//        //prime no program
//        //no divided by 1 and itself only is a prime no
//            for( int i=2;i<=Math.sqrt(n);n++){
//                if(n%i==0) return false;
//                return true;
//            }
//
//        return true;
//    }

    static int fibonnaci(int n){

        return n+fibonnaci( n-1);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rd=new Random();
        //Convert first letter of string to uppercase

//        String a="yash";
//        String b=a.substring(0,1).toUpperCase()+a.substring(1); //method 1
//        System.out.println(StringUtils.decapitalize(a));  //method 2
//        System.out.println(b);
//        int d =6;
//

        //fibonacci series
//        int n=sc.nextInt();
//        int count=1;
//        int ab=0;
//        int bc=1;
//        while(n>=count){
//            System.out.print(ab+" ");
//            int temp=bc;
//            bc+=ab;
//            ab=temp;
//            count++;
//        }


//      prime no practice
 //       System.out.println(isPrime(17));


        int a=rd.nextInt(5);
        System.out.println(a);






    }
}
