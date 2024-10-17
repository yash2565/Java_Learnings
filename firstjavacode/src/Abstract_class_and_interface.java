
abstract class Telephone{
     abstract void ring();
    abstract void lift();
    abstract void disconnect();

}
interface TvRemote {
    void on();
    void off();
}
class Tv implements TvRemote{
    @Override
    public void on() {
        System.out.println("Switch on Tv");

    }
    @Override
    public void off() {
        System.out.println("Switch of Tv");
    }

    
}

class SmartTelephone extends Telephone{
    @Override
    void disconnect() {
        System.out.println("Diconnected");
    }

    @Override
    void lift() {
        System.out.println("Lift");
    }

    @Override
    void ring() {
        System.out.println("Ringing");
    }

}
public class Abstract_class_and_interface {


    public static void main(String[] args) {
        SmartTelephone st=new SmartTelephone() ;
        st.lift();


    }
}
