

class Sphere {
    private int radius;

    public Sphere(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double surfacearea() {
        return 4 * Math.PI * radius * radius;
    }

    public double volume() {
        return 1.3333333333 * Math.PI * radius * radius * radius;
    }


    public static void main(String[] args) {
        Sphere sc = new Sphere(12);
       // sc.setRadius(12);
        System.out.println(sc.getRadius());
        System.out.println(sc.surfacearea());
        System.out.println(sc.volume());


    }
}


