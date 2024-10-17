import java.util.Arrays;

public class java_set3 {
    public static void main(String[] args) {

        //                                    Array set problem 1 sum using array
//        float [] arr =new float[6];
//        arr[1]=1.2f;
//        arr[2]=1.0f;
//        arr[3]=1.4f;
//        arr[4]=1.5f;
//        arr[5]=1.6f;
//        float sum=0;
//        for(float element :arr){
//            sum=sum+element;
//
//        }
//        System.out.println(sum);

        int [] yash={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(yash));


        //                                        check no present in array
//        int [] array={10,20,320,40,50};
//        int num =30;
//        boolean isInArray=false;
//        for(int element:array) {
//            if (num == element) {
//                isInArray = true;
//                break;
//            }
//        }
//        if(isInArray){
//            System.out.println("present");
//
//        }
//        else{
//            System.out.println("not present");
//
//        }

//                                                               average of the marks
//        int [] arr =new int[5];
//        arr[0]=45;
//        arr[1]=66;
//        arr[2]=76;
//        arr[3]=80;
//        arr[4]=92;
//        float sum=0;
//        float average =0;
//        for(float element :arr){
//            sum=sum+element;
//            average=sum/arr.length;
//
//        }
//        System.out.println(average);


//                                                    multidimensional array addition
//        int [][] mat1={{1,2,3},
//                       {4,5,6}};
//        int [][] mat2={{2,4,6},
//                       {8,10,12}};
//        int [][] result={{0,0,0},
//                         {0,0,0}};
//
//        for (int i=0;i<mat1.length;i++){
//            for(int j=0;j< mat1[i].length;j++){
//                result[i][j]=mat1[i][j]+mat2[i][j];
//                System.out.print(result[i][j] +" ");
//
//
//            }
//            System.out.println("");
//
//        }


                                                 //Reverse array
//        int [] arr={1,2,3,4,5};
//        int temp;
//        int l=arr.length;
//        int n=Math.floorDiv(l,2);
//
//        for(int i=0;i<n;i++){
//
//            temp=arr[i];
//            arr[i]=arr[l-i-1];                //swapping logic
//            arr[l-i-1]=temp;
//
//        }
//        for( int element:arr){
//            System.out.println(element + " ");
//        }




//        int [] arr={1,2,9,4,5};
//        int temp=arr[0];                          //Maximum no in an array
//        for(int i=0;i< arr.length;i++){
//            if(arr[i]>temp)
//                temp=arr[i];
//
//        }
//        System.out.println(temp);

//        int [] arr={1,2,9,4,5};
//        int temp=arr[0];                          //Minimum no in an array
//        for(int i=0;i< arr.length;i++){
//            if(arr[i]<temp)
//                temp=arr[i];
//
//        }
//        System.out.println(temp);


//        boolean isSorted=true;
//        int [] arr={1,2,3,4,5,6};
//        for(int i=0;i< arr.length-1;i++){                       checking whether the array is sorted or not
//            if(arr[i]>arr[i+1]){
//                isSorted=false;
//                break;
//            }
//        }
//        if(isSorted)
//        {
//            System.out.println("sorted");
//        }
//        else
//            System.out.println("no");










    }
}
