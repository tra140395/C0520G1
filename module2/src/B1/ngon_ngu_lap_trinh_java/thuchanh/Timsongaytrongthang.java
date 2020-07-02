package B1.ngon_ngu_lap_trinh_java.thuchanh;

import java.util.Scanner;

public class Timsongaytrongthang {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap thang can kt: ");
        int month = Integer.parseInt(scanner.nextLine());
        switch (month){
            case 2:
                System.out.print("thang 2 coa 28 hoac 29 ngay");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("thang "+month+" 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("thang "+month+" 30 ngay");
                break;
            default:
                System.out.print("ko co thang nay");
                break;
        }
    }
}
