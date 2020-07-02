package B2.mang.baitap;

import java.util.InputMismatchException;
import java.util.Scanner;
public class aaaaaa{
    public int kiemTra() {
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                int num1 = scanner.nextInt();
                if (num1 > 3) {
                    System.out.println("Error");
                    return num1;
                }
            } catch (InputMismatchException e) {
               System.out.println("nhap lai");
           }
        } while (true);
    }
    public String inRa() {
        return "abc";
    }
}
