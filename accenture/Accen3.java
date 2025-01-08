public class Accen3{
    public static void main(String[] args) {
        //String st="acbcv";
        //String cd=longestPalindrome(st);
        //System.out.println(cd);


        //minimum bits of a no
//        int n = 12;
//        int c = 0;
//        while (n>0)
//        {
//            n = n&(n-1);
//            c++;
//        }
//        int p = 0;
//        int s = (int)Math.pow(2, c) - 1;
//        System.out.println(s);
//

       // System.out.println(rearrange(15));

//        String str ="Yash2565";
//        System.out.println(checkPassword(str,str.length()));

    }

//    public static int rearrange(int n) {
//        int calcSetBits = Integer.bitCount(n);
//        return (1<<calcSetBits) - 1;
//    }

//    public static boolean checkPassword(String str,int n) {
//        if (n <= 4) {
//            return false;
//        }
//        if (str.charAt(0) > '0' && str.charAt(0) < '9') {
//            System.out.println("first letter cannot be a number");
//            return false;
//        }
//
//        int num = 0;
//        int cap = 0;
//        int character = 0;
//        for (int i = 0; i < n; i++) {
//            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
//                cap++;
//            }
//            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
//                num++;
//            }
//            if (str.charAt(i) == ' ' || str.charAt(i) == '/') {
//                return false;
//            }
//            if (cap > 0 && num > 0 ) {
//                return true;
//            }
//
//        }
//        return false;
//    }

//    }
//        public static boolean checkPassword1(String str, int n)
//        {
//            if (n < 4)
//                return false;
//            if (str.charAt (0) >= '0' && str.charAt (0) <= '9')
//                return false;
//            int num = 0, cap = 0;
//            for (int i = 0; i < n; i++)
//            {
//                if (str.charAt (i) == ' ' || str.charAt (i) == '/')
//                    return false;
//
//                if (str.charAt (i) >= 'A' && str.charAt (i) <= 'Z')
//                    cap++;
//                if (str.charAt (i) >= '0' && str.charAt (i) <= '9')
//                    num++;
//            }
//            if (cap > 0 && num > 0)
//                return true;
//            else
//                return false;
//        }
//    public static String longestPalindrome(String s) {
//        int n=s.length();
//        int maxlength=0;
//        String ans="";
//        int[][] lps=new int[n][n];
//        for(int dif=0;dif<n;dif++)
//        {
//            for(int i=0,j=i+dif;j<n;i++,j++)
//            {
//                if(dif==0)
//                {
//                    lps[i][j]=1;
//                }
//                else if(dif==1)
//                {
//                    if(s.charAt(i)==s.charAt(j))
//                    {
//                        lps[i][j]=2;
//                    }
//                    else
//                    {
//                        lps[i][j]=0;
//                    }
//
//                }
//                else
//                {
//                    if(s.charAt(i)==s.charAt(j) && lps[i+1][j-1]>0)
//                    {
//                        lps[i][j]=lps[i+1][j-1]+2;
//                    }
//                    else
//                    {
//                        lps[i][j]=0;
//                    }
//                }
//                if(lps[i][j]>0 && j-i+1>maxlength)
//                {
//                    maxlength=j-i+1;
//                    ans=s.substring(i,j+1);
//                }
//            }
//        }
//        return ans;
//
//    }
}


