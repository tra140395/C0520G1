package B1.ngon_ngu_lap_trinh_java.thuchanh;

import java.util.Scanner;

public class Timsonguyento {
    public static void main(String[] args) {
        System.out.println("nhap so ban muon kt: ");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        if(number<2)
            System.out.println(number+" ko phải snt");
        else {
            int i=2;
            boolean check = true;
            while (i<=Math.sqrt(number)){
                if(number%i==0){
                    System.out.println(number+" ko phai snt");
                    check=false;
                    break;
                }
                i++;
            }
            if(check)
                System.out.println(number+" la snt");
        }
    }
}
