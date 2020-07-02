package B1.ngon_ngu_lap_trinh_java.thuchanh;

import java.util.Scanner;

public class Sudungtoantu {
  /*  public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the width: ");
        width = Float.parseFloat(scanner.nextLine());
        System.out.println("enter the height: ");
        height =Float.parseFloat(scanner.nextLine());
        float s = width*height;
        System.out.println("dien tich la:" +s);
    }*/
  public static void main(String[] args) {
      float cao;
      float rong;
      Scanner scanner= new Scanner(System.in);
      System.out.println("enter cao: ");
      cao = Float.parseFloat(scanner.nextLine());
      System.out.println("enter rong: ");
      rong = Float.parseFloat(scanner.nextLine());
      float s = cao*rong;
      System.out.println(" dien tich la "+s);
  }
}
