import com.sun.source.tree.UsesTree;

import java.util.Scanner;

public class Main {
    public class ErrorExample{

    }
    public static void main(String[] args) throws RuntimeException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите форму : 1-цилиндр, 2-Параллелопипед");
        Cylinder cylinder = new Cylinder();

        Parallelepiped parallelepiped = new Parallelepiped();
        int choose = sc.nextInt();
        switch (choose) {

            case 1: {

                System.out.println("******ЦИЛИНДР****");
                System.out.println("Функции: 1-площадь, 2-объем");
                int choose2 = sc.nextInt();
                switch (choose2) {
                    case 1: {
                        if (choose2 <0) {
                            System.out.println("Данные не могут быть отрицательны");}

                        System.out.println("*****AREA*****");
                        System.out.println("Высота:");
                        cylinder.setHeight(sc.nextDouble());
                        System.out.println("Радиус:");
                        cylinder.setRadius(sc.nextDouble());
                        if((cylinder.getHeight() <0) || (cylinder.getRadius() < 0)) {
                            throw new RuntimeException("Данные не могут быть отрицательными!");}
                        cylinder.sCylinder();
                        break;
                    }
                    case 2: {
                        System.out.println("*****VOLUME*****");
                        System.out.println("Высота:");
                        cylinder.setHeight(sc.nextDouble());
                        System.out.println("Радиус:");
                        cylinder.setRadius(sc.nextDouble());
                        if((cylinder.getHeight() <0) || (cylinder.getRadius() < 0)) {
                            throw new RuntimeException("Данные не могут быть отрицательными!");}
                        cylinder.sVolume();

                    }
                    break;
                    default:
                        System.out.println("Нет такого в программе");
                }
                break;
            }
            case 2: {
                System.out.println("*****ПАРАЛЛЕЛОПИЕД******");
                System.out.println("Функции: 1-площадь, 2-объем");
                int choose1 = sc.nextInt();
                switch (choose1) {
                    case 1: {
                        System.out.println("*****AREA*****");
                        System.out.println("Высота:");
                        parallelepiped.setHeight(sc.nextDouble());
                        System.out.println("Длина:");
                        parallelepiped.setLength(sc.nextDouble());
                        System.out.println("Ширина:");
                        parallelepiped.setWidth(sc.nextDouble());
                        if((parallelepiped.getHeigth() <0) || (parallelepiped.getWidth() < 0)||(parallelepiped.getLength()<0)) {
                            throw new RuntimeException("Данные не могут быть отрицательными!");}
                        parallelepiped.area();
                    }
                    case 2: {
                        System.out.println("******VOLUME*******");
                        System.out.println("Высота:");
                        parallelepiped.setHeight(sc.nextDouble());
                        System.out.println("Длина:");
                        parallelepiped.setLength(sc.nextDouble());
                        System.out.println("Ширина:");
                        parallelepiped.setWidth(sc.nextDouble());
                        if((parallelepiped.getHeigth() <0) || (parallelepiped.getWidth() < 0)||(parallelepiped.getLength()<0)) {
                            throw new RuntimeException("Данные не могут быть отрицательными!");}
                        parallelepiped.volume();
                        break;
                    }
                    default:
                        System.out.println("Нет такого в программе");
                }
                break;

            }
            default:
                System.out.println("Нет такого в программе");

        }
    }


}