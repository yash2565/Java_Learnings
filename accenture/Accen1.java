import java.util.*;

public class Accen1 {

//    static int lightbulbs(int arr[]){
//        int count=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==0) {
//                arr[i] = 1;
//
//                for (int j = i+1; j <arr.length ; j++) {
//                    if(arr [j]==1){
//                        arr[j]=0;
//                    }
//                    else{
//                        arr[j]=1;
//                    }
//
//                }
//                count ++;
//
//            }
//        }
//        return count;
//
//    }
    public static void main(String[] args) {
//        int arr[]={1,0,1,0,1,0,0,1};
//        System.out.println(lightbulbs(arr));


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first word:- ");
        String s1=sc.nextLine();
        System.out.println("Enter second word:- ");
        String s2=sc.nextLine();

        char arr1[]=s1.toCharArray();
        char arr2[]=s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
}
