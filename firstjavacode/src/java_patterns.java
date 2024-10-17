import java.sql.SQLOutput;
import java.util.Scanner;
public class java_patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of Rows to Print:-");
        int n = sc.nextInt();
        // int m=sc.nextInt();

//        for(int i=1;i<=n;i++){                   //     Type of Patttern
//            for(int j=1;j<=n;j++){              //       ****
//                System.out.print("*");           //      ****
//            }                                   //       ****
//            System.out.println(" ");             //      ****
//
//        }
//

//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=m;j++){                        //    hollow Square or a rectangle
//                if(i==1 || j==1|| i==n||j==n) {            //     *************
//                    System.out.print("*");                 //     *           *
//                }                                          //     *           *
//                else{                                      //     *************
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println(" ");
//        }

//        for(int i=1;i<=n;i++){                       //Pyramid Star Pattern
//            for(int j=1;j<=i;j++) {                   //*
//                System.out.print("*");                //**
//            }                                         //***
//            System.out.println(" ");                  //****
//        }


//        for(int i=n;i>=1;i--){                       //Pyramid Star Pattern
//            for(int j=1;j<=i;j++) {                   //****
//                System.out.print("*");                //***
//            }                                         //**
//            System.out.println(" ");                  //*
//        }








//        for (int i = 1; i <= n; i++) {
//            for (int k = 1; k <= n - i; k++) {
//                System.out.print(" ");
//            }
//                for (int j = 1; j <= i; j++) {
//                    System.out.print("*");
//                }
//
//            System.out.println(" ");
//            //Pyramid Star Pattern
//            //    *
//            //   **
//            //  ***
//            // ****
//        }
//        System.out.println(" ");




//        Pattern Type
//               1
//               12
//               123
//               1234
//               12345
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//
//            }
//            System.out.println(" ");
//        }





//           Pattern Type
//        12345
//        1234
//        123
//        12
//
//        for(int i=n;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//
//            }
//            System.out.println(" ");
//        }


//       Pattern Type
//        1
//        23
//        456
//        78910

//
//        int num=1;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(num);
//                num++;
//
//            }
//            System.out.println(" ");
//        }
//






        //Pattern Type
      // A
      // BC
      // DEF
      // GHIJ
//        char ch='A';
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(ch);
//                ch++;
//
//            }
//            System.out.println(" ");
//        }






      //Pattern Type
    //    1
    //    01
    //    101
    //    0101
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                if((i+j)%2==0) {
//                    System.out.print(1);
//                }
//                else{
//                    System.out.print(0);
//                }
//
//            }
//            System.out.println(" ");
//        }



        /*     Pattern Type
           *
          ***
         *****
        *******
       *********

         */

//                for (int i = 1; i <= n; i++) {
//                    for (int k = 1; k <= (n - i); k++) {
//                        System.out.print(" ");
//                    }
//                    for (int j = 1; j <=(2*i)-1; j++) {
//                        System.out.print("*");
//                    }
//                    System.out.println(" ");
//                }




        /*
         *********
          *******
           *****
            ***
             *

         */

//        for (int i = n; i >= 1; i--) {
//
//            //for spaces
//            for (int k = 1; k <= (n - i); k++) {
//                System.out.print(" ");
//            }
//
//            //for stars
//            for (int j = 1; j <=(2*i)-1; j++) {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//




    }




}
