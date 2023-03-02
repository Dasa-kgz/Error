import com.sun.source.tree.UsesTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws RuntimeException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Выберите форму : 1-цилиндр, 2-Параллелопипед");
      Cylinder cylinder=new Cylinder();

      Parallelepiped parallelepiped = new Parallelepiped();
      int choose=sc.nextInt();
      switch (choose){

          case 1:{

              System.out.println("******ЦИЛИНДР****");
              System.out.println("Функции: 1-площадь, 2-объем");
              int choose2= sc.nextInt();
              switch (choose2){
                  case 1:{
                      System.out.println("*****AREA*****");
                     cylinder.sCylinder();
                  }
                  case 2:{
                      System.out.println("*****VOLUME*****");
                      cylinder.sVolume();

                  }break;
                  default:
                      System.out.println("Нет такого в программе");
              }
              break;
          } case 2:{
              System.out.println("*****ПАРАЛЛЕЛОПИЕД******");
              System.out.println("Функции: 1-площадь, 2-объем");
              int choose1= sc.nextInt();
              switch (choose1){
                  case 1:{
                      System.out.println("*****AREA*****");
                      parallelepiped.area();
                  }
                  case 2:{
                      System.out.println("******VOLUME*******");
                      parallelepiped.volume();
                      break;
                  } default:
                      System.out.println("Нет такого в программе");
              }break;

          }
          default:
              System.out.println("Нет такого в программе");

          }
    }
}