package out;
import java.util.*;

public class search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        String[] str  = new String[n];
        for(int i=0;i<n;i++){
            str[i] = sc.nextLine();
        }
        String find = sc.nextLine();
        for(int i=0;i<n;i++){
            String str1 = str[i];
            if(str1.equals(find)){
                System.out.println(i);
            }
        }
        System.out.println(-1);
    }
}
