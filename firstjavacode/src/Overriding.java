public class Overriding {
    void run(int a) {
        System.out.println("run");
    }

    static class yash extends Overriding {
        @Override
        void run(int a) {
            System.out.println(" run "+a);
        }
    }

    public static void main(String[] args) {
        Overriding obj=new yash();
        obj.run(6);




    }
}

