package B1.ngon_ngu_lap_trinh_java.baitap;

import java.util.Scanner;

public class Chuyendoitiente {
    public static void main(String[] args) {
        System.out.println("nhap so USD muon doi: ");
        Scanner scanner = new Scanner(System.in);
        float USD =Float.parseFloat(scanner.nextLine());
        int a = Integer.parseInt(scanner.nextLine());
        float VND = USD*a;
        System.out.println("so tien vnd chuyen duoc la: "+VND);
    }
}
