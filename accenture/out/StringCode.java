package out;

import java.util.Scanner;

public class StringCode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        String []str=new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.nextLine();


        }
        String s=sc.nextLine();
        String c=str[1];
//        System.out.println(c);
        for(int j=0;j<=n;j++){
            String d= str[j];
            if(d.equals(s)){
                System.out.println(j+1);
            }
        }
        System.out.println(-1);
    }
}
