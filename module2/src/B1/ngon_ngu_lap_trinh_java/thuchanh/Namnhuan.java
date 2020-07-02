package B1.ngon_ngu_lap_trinh_java.thuchanh;

import java.util.Scanner;

public class Namnhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap nam can kt: ");
        int year = Integer.parseInt(scanner.nextLine());
        if (((year % 4 ==0)&&(year % 100 != 0)) || ((year % 100 == 0) && (year % 400 == 0))){
            System.out.print("nam nhuan");
        }
        else
            System.out.print("nam ko nhuan");
    }
}
