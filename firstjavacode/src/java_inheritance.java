import javax.sound.midi.Soundbank;

class Rectangle{
    int length;
    int breadth;
    Rectangle(){
        System.out.println("Non Parameterized");
    }

     Rectangle(int length, int bredth) {
         System.out.println("Parameterized");
        this.length = length;
        this.breadth = bredth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public double area(){
        System.out.print("Area of Rectangle is : ");
        return length*breadth;

    }

}

class Cuboid extends Rectangle{
    int height;
    Cuboid(){
        System.out.println("Non Parametrized ");
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    Cuboid(int length, int breadth, int height) {
        super(length, breadth);
        System.out.println("Parameterized");
        this.height = height;
    }
    public double volume(){
        System.out.print("Volume of Cuboid is :");
        return length*breadth*height;
    }
}
public class java_inheritance {
    public static void main(String[] args) {
        Cuboid c= new Cuboid(4,4,4);
//        c.setLength(4);
//        c.setBreadth(4);
//        c.setHeight(4);
        System.out.println(c.area());
        System.out.println(c.volume());


    }

}
