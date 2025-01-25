import java.util.Arrays;

public class Patterns {
    static void pyramid_stars(int rows) {

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    static void decreasing_rightangle(int rows) {
        for (int i = rows; i >= 1; i--) {

            // inner loop to handle columns
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // printing new line for each row
            System.out.println();
        }
    }
    static void pyramid_increasing_no(int rows) {
        int p=1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(p++ +" ");
            }
            System.out.println();

        }
    }
    public static void diamond_pattern(int rows)

    {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        for (int i = rows; i >= 1; i--) {
            for (int j = rows-i; j >=1; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
            /*
                     *
                   * * *
                 * * * * *
               * * * * * * *
             * * * * * * * * *
             * * * * * * * * *
               * * * * * * *
                 * * * * *
                   * * *
                     *
             */
        }
    }

    static void palindrome_triangle(int rows) {
        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= 2 * (rows - i); j++) {
                System.out.print(" ");
            }


            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }


            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            // printing new line for each row
            System.out.println();
        }
    }
    static void asds(int[] arr){

    }
    public static void main(String[] args) {
//        decreasing_rightangle(5);
//        pyramid_stars(5);
//        pyramid_increasing_no(3);
//        diamond_pattern(5);
//        palindrome_triangle(5);









        }
    }

