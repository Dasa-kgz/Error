import java.util.Scanner;

public class Cylinder {
    Scanner sc = new Scanner(System.in);
    private double radius;
    private double height;

    public Cylinder(){
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        this.height = height;
    }
    void sCylinder(){
        double s=2*Math.PI*radius*(radius+height);
        System.out.println("Площадь цилиндра равна "+s);
    }
    void sVolume(){
        double v=(Math.PI*getRadius()+getRadius()+getHeight());
        System.out.println("Объём цилиндра равна "+v);
    }
}
