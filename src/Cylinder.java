import java.util.Scanner;

public class Cylinder {
    Scanner sc = new Scanner(System.in);
    private double r;
    private double h;

    public Cylinder(){
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
    void sCylinder(){
        System.out.println("Высота:");
        setH( sc.nextDouble());
        System.out.println("Радиус:");
        setR(sc.nextDouble());
        double s=2*Math.PI*getR()*(getR()+getH());
        System.out.println("Площадь цилиндра равна "+s);
    }
    void sVolume(){
        System.out.println("Высота:");
        setH( sc.nextDouble());
        System.out.println("Радиус:");
        setR(sc.nextDouble());
        double v=(Math.PI*getR()+getR()+getH());
        System.out.println("Объём цилиндра равна "+v);
    }
}
