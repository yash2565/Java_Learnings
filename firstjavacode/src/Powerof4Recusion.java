public class Powerof4Recusion {
    public static  boolean isPowerOfFour(int n) {
            double x=Math.log10(n)/Math.log10(4);
        System.out.println(x);
            if(Math.log10(n)==(int)x*Math.log10(4)){
                return true;
            }
            return false;

    }

    public static void main(String[] args) {
        int n=6;
        System.out.println(isPowerOfFour(n));
    }
}
