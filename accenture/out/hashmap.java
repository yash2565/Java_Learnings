package out;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        Map<String,Integer> mp = new HashMap<>();
        for(int i=0;i<num;i++){
            String str = sc.next();
            int ss = sc.nextInt();
            mp.put(str,ss);
        }
        int max =0;
        for(Integer i : mp.values()) {
            if (i > max) {
                max = i;
            }

        }
        System.out.println(max);
    }
}
