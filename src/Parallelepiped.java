import java.util.Scanner;

public class Parallelepiped {
    Scanner sc=new Scanner(System.in);
    private double length;
    private double width;
    private double height;



    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Parallelepiped{" +
                "length=" + length +//длина
                ", width=" + width +//ширина
                ", height=" + height +//высота
                '}';
    }
    void area(){
        System.out.println("Высота:");
        setHeight( sc.nextDouble());
        System.out.println("Длина:");
        setLength(sc.nextDouble());
        System.out.println("Ширина:");
        setWidth(sc.nextDouble());
        double s=2*((getHeigth()*getLength())
                +(getLength()*getWidth())+(getHeigth()*getWidth()));
        System.out.println("AREA "+s);
    }
    void volume(){
        System.out.println("Высота:");
        setHeight( sc.nextDouble());
        System.out.println("Длина:");
        setLength(sc.nextDouble());
        System.out.println("Ширина:");
        setWidth(sc.nextDouble());
        double v=(getHeigth()*getWidth()*getLength());
        System.out.println("Объём параллелопипеда равна "+v);
    }
}
