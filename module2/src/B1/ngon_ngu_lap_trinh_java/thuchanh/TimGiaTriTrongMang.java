package B1.ngon_ngu_lap_trinh_java.thuchanh;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("cần tìm ở trong mảng vào vị trí " + input_name + " i là " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist)
            System.out.println("ko tìm thấy " + input_name + " trong list");
    }

}
