
import java.util.Scanner;


public class java_strings {

//    public static boolean isPalindrome(String str){
//        int n=str.length();
//        for(int i=0;i<n/2;i++){
//            if(str.charAt(i)!=str.charAt(n-1-i)){
//                return false;
//            }
//
//        }
//        return true;
//    }

//    public static float getShortestPath(String path){
//        int x=0 ,y=0;
//        for(int i=0;i<path.length();i++){
//            char dir=path.charAt(i);
//            //South
//            if(dir=='S'){
//                y--;
//            }
//            //North
//            else if (dir=='N') {
//                y++;
//            }
//            //west
//            else if (dir=='W') {
//                x--;
//
//            }
//            else if(dir=='E'){
//                x++;
//            }
//        }
//        int X2=x*x;
//        int Y2=y*y;
//        return (float) Math.sqrt(X2+Y2);   //underroot of (x2-x1)^2 + (y2-y1)^2
//    }


//    public static String toUppercase(String str){                       //Each first letter of the word will become capital
//        StringBuilder sb=new StringBuilder("");
//
//        char ch=Character.toUpperCase(str.charAt(0));
//        sb.append(ch);
//
//        for(int i=1;i<str.length();i++){
//            if(str.charAt(i)==' ' && i<str.length()-1){
//                sb.append(str.charAt(i));
//                i++;
//                sb.append(Character.toUpperCase(str.charAt(i)));
//
//            }
//            else{
//                sb.append(str.charAt(i));
//            }
//        }
//        return sb.toString();
//    }

//    public static String compressor(String str){        //it will compress a strinng aaaaaabbbbbccccc to a6b5c5
//        String newStr="";
//        for(int i=0;i<str.length();i++){
//            Integer count=1;
//            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
//                count++;
//                i++;
//
//            }
//            newStr +=str.charAt(i);
//            if(count>1){
//                newStr+=count.toString();
//            }
//        }
//        return newStr;
//    }


    public static void main(String[] args) {
  //            Scanner sc =new Scanner(System.in);

//        System.out.println("STRING OPERATIONS");
//        String name =new String("Yash Sanjay Musmade");
//        System.out.println(name);
//       System.out.printf("This is %s",name);
//
//       System.out.format(" Hi %s",name);
//        int a=name.length();
//        String b=name.toLowerCase();
//        String c=name.toUpperCase();
//        String ab="       SDJ       DNK    ";
//        String d=ab.trim();
//        System.out.println(name.substring(1));  //index start from zero
//        System.out.println(name.replace(" ","_")); //two values required
//        System.out.println(name.startsWith("Y"));
//        System.out.println(name.endsWith("h"));
//        System.out.println(name.charAt(2));
//        System.out.println(name.indexOf("h"));
//        System.out.println(name.indexOf("sh",0));
//        System.out.println(name.lastIndexOf("Y",4));
//        System.out.println(name.equals("Yash"));
//        System.out.println(name.equalsIgnoreCase("yash"));
//        System.out.println("i am yash \s double ");
//
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//
//        String yash= new String("Hello Welcome to Java Program");
//        System.out.println(yash.replace("Hello","Yash"));



//        String str=sc.nextLine();
//        String abcd =str.toUpperCase();
//        System.out.println(abcd);
//        System.out.println(str.charAt(0));


        //isPalindrome
//        String str=sc.nextLine();
  //      System.out.println(isPalindrome(str));

        //Shortest Path
//        String path=sc.nextLine();
//        System.out.println(getShortestPath(path));


        //Substring
//        String str=sc.nextLine();
//        System.out.println(str.substring(0,4));     //prints substring from the given string through indexing provided starting index and ending index

//        String fruits[]={"apple","mango","banana","pineapple"};   //i.e lexically highest order fruit name
//
//        String largest=fruits[0];
//        for(int i=0;i< fruits.length;i++){
//            if(largest.compareToIgnoreCase(fruits[i])<0){
//                largest=fruits[i];
//            }
//        }
//        System.out.println(largest);

//        StringBuilder sb=new StringBuilder("");       //object type declaration
//        for(char ch ='a';ch<='z';ch++){
//            sb.append(ch);
//
//        }
//        System.out.println(sb );
//        System.out.println(sb.length());

//        String str = "hi, i am yash musmade";                 //first letter uppercase convertor
//        System.out.println(toUppercase(str));

//        String str = "aaabbbccc";
//        System.out.println(compressor(str));                //string compressor

        int counter=0;
        while(true){
            System.out.println("hi bro");
            counter++;
        }



    }
}
