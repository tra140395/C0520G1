package B1.ngon_ngu_lap_trinh_java.thuchanh;


import java.util.Scanner;

public class InTongCacSo {
    public static void main(String[] args) {
        int sum=0;
        int number;
        Scanner scanner = new Scanner(System.in);
            do{
                System.out.print("Nhap so: ");
                number = scanner.nextInt();
                sum+= number;
            } while (number!=0);
                System.out.println("Sum bang: "+sum);
    }
}
