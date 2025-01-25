    public class java_loop_checking {
       public java_loop_checking() {
       }
    
       public static void main(String[] var0) {
          byte var1 = 6;
          int var2 = 0;
    
          for(int var3 = 1; var3 <= var1; ++var3) {
             for(int var4 = 1; var4 <= var1; var4 *= 2) {
                int var10001 = var2++;
                System.out.println("Gate " + var10001);
             }
          }
    
          System.out.println(var1 * (var1 / 2));
       }
    }



   