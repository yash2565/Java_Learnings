import java.util.*;

public class java_2D_Array {
//    public static boolean search(int matrix[][],int key){
//        for(int i=0;i<matrix.length;i++){
//            for(int j=0;j<matrix[0].length;j++){
//                if(matrix[i][j]==key){
//                    System.out.println("present at ["+i+"th row"+","+j+"th column"+"]" );
//                    return true;
//                }
//            }
//        }
//        System.out.println("NOT FOUND");
//        return false;
//    }

//    public static void spiralmatrix(int matrix[][]){
//        int startrow=0;
//        int endrow=matrix.length-1;
//        int startcolumn=0;
//        int endcolumn=matrix[0].length-1;
//
//        while(startrow<=endrow && startcolumn<=endcolumn){
//
//            //top
//            for(int j=startcolumn;j<=endcolumn;j++){
//                System.out.print(matrix[startrow][j]+" ");
//            }
//
//
//            //right
//            for(int i=startrow+1;i<=endrow;i++){
//
//                System.out.print(matrix[i][endcolumn]+" ");
//            }
//
//            //bottom
//            for(int j=endcolumn-1;j>=startcolumn;j--){
//                if(startcolumn==endcolumn){
//                    break;
//                }
//                System.out.print(matrix[endrow][j]+" ");
//            }
//
//            //left
//            for(int i=endrow-1;i>=startrow+1;i--){
//                if(startrow==endrow){
//                    break;
//                }
//                System.out.print(matrix[i][startcolumn]+" ");
//            }
//
//            startcolumn++;
//            endcolumn--;
//            startrow++;
//            endrow--;
//
//        }
//        System.out.println();
//    }


    //Diagonal Sum
//    public static int DiagonalSum(int matrix[][]){
//        int sum=0;
//
//        for(int i=0;i<matrix.length;i++){            //Primary Diagonal logic i==j
//            for(int j=0;j<matrix[0].length;j++){
//                if(i==j){
//                    sum+=matrix[i][j];
//
//                } else if (i+j==matrix.length-1) {
//                    sum+=matrix[i][j];
//
//                }
//            }
//        }
//        return sum;


//
//        int sum=0;
//        for(int i=0;i<matrix.length;i++){
//            //pd
//            sum+=matrix[i][i];
//            //sd
//            if(i!=matrix.length-1-i)
//                sum+=matrix[i][matrix.length-i-1];
//
//        }
//        return sum;
//    }


    public static boolean SearchinSortedMatrix(int matrix[][],int key){
        int row=0 , column=matrix[0].length-1;
        while(row<matrix.length && column>=0){
            if(matrix[row][column]==key){
                System.out.println("Found key at ("+row+","+column+")");
                return true;
                
            } else if (key<matrix[row][column]) {
                column--;
                
                
            } else if (key > matrix[row][column]) {
                row++;

            }
        }
        System.out.println("Not found the key");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][]=new int [3][3];
        int n=matrix.length;
        int m=matrix[0].length;

        Scanner sc=new Scanner(System.in);
        int max = matrix[0][0];
        int min = matrix[0][0];
        for(int i=0;i<n;i++){

            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
                if(max<matrix[i][j]) {            //maximum no in matrix logic
                    max = matrix[i][j];
                }
                if(min>matrix[i][j]) {            //minimum no in matrix logic
                    min = matrix[i][j];
                }
            }
        }
        System.out.println();
 //       System.out.println("Maximum number in the matrix is "+ max);
 //       System.out.println(min);




        //for output
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }

//        search ANY number in the matrix
//        search(matrix,4);



        //Spiral Matrix
//        System.out.println("GENERATED SPIRAL MATRIX IS");
//        spiralmatrix(matrix);


        //Diagonal Sum of Matrix
//        System.out.println(DiagonalSum(matrix));


        //Search in Sorted Matrix by Staircase Method

//        SearchinSortedMatrix(matrix,40);





//        MULTIDIMENSIONAL ARRAY  2D ARRAY
//
//        int [] marks1;
//        int [][] flats;
//        flats = new int[2][3];
//        int [][] members;
//        members=new int[2][1];
//        members [0][1]=10;
//        members [1][1]=2;
//
//
//
//        flats [0][0]=101;
//        flats [0][1]=102;
//        flats [0][2]=103;
//        flats [1][0]=201;
//        flats [1][1]=202;
//        flats [1][2]=203;
//
//        for(int i=0;i<flats.length;i++){
//            for(int j=0;j<flats[i].length;j++){
//                System.out.print(flats[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println("");
//        }
//


    }
}
