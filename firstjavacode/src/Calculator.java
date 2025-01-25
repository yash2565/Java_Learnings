import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ans=0;

        System.out.print("Enter the operator : ");
        while(true){
            char op=sc.next().trim().charAt(0);
            if(op =='+' || op=='-'|| op=='*'||op=='/'||op=='%'){
                //Enter two no
                System.out.print("Enter number 1 : ");
                int a=sc.nextInt();

                System.out.print("Enter number 2 : ");
                int b=sc.nextInt();


                if(op=='+'){
                    ans = a+b;

                }
                if(op=='-'){
                  ans=a-b;
                }
                if(op=='*'){
                    ans=a*b;

                }
                if(op=='/') {
                    if(b!=0){
                        ans = a / b;
                    }

                }
                if(op=='%'){
                     ans=a%b;
                }

                }
            System.out.print(ans);
            break;
                }

                }
            }




