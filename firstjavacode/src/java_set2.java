import java.util.Scanner;
public class java_set2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
////   Problem 1
//        int n=6;
//        for(int i=0;i<n;i++){
//            for(int j=n-i;j>1;j--){
//                System.out.print(" ");
//
//            }
//            for (int j=0;j<=i;j++) {
//                    System.out.print("*");
//            }
//            System.out.print("\n");
//        }
//

//    Problem 2 Sum of n even no using while loop
//        int n=0;
//        int sum=0;
//        while(n<2){
//            sum=sum+(2*n);
//            n++;
//        }
//        System.out.println(sum);


//     Problem 3
//        int a=4;
//
//        for(int i=1;i<=10;i++){
//            System.out.printf("%d X %d = %d ",a,i,a*i);
//            System.out.println(" ");
//        }
//
        //Problem 4 Reverse Table
//        int b=10;
//        for(int i=10;i>=1;i--){
//            System.out.printf("%d X %d = %d ",b,i,b*i);
//            System.out.println(" ");
//
//        }

        //Problem 5
//        int a=5;
//        int factorial=1;
//        for(int i=1;i<=5;i++){
//            factorial *=i;
//        }
//        System.out.println(factorial);

        //Problem 9 sum of table
//        int a=sc.nextInt();
//        int sum=0;
//        for(int i=1;i<=10;i++){
//            sum+=(a*i);
//
//        }
//        System.out.println(sum);




        int row, i, j, space = 1;
        System.out.print("Enter the number of rows you want to print: ");
        row = sc.nextInt();
        space = row - 1;
        for (j = 1; j<= row; j++)
        {
            for (i = 1; i<= space; i++)
            {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j<= row - 1; j++)
        {
            for (i = 1; i<= space; i++)
            {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i<= 2 * (row - j) - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }








    }

}
