package B1.ngon_ngu_lap_trinh_java.thuchanh;

import java.util.Scanner;

public class Chisocannang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap weight(kg): ");
        float weight = Float.parseFloat(scanner.nextLine());
        System.out.println("nhap height(m): ");
        float height = Float.parseFloat(scanner.nextLine());
        float IMB = weight / (height * height);
        if (IMB <= 0) {
            System.out.println("ko co ai gay nhu vay ca");
        } else {
            if (IMB < 18.5) {
                System.out.println("gay nhu chiec la");
            }else {
                if(IMB<25.0){
                    System.out.println("tam duoc");
                }else{
                    if(IMB<35.0)
                        System.out.println("hoi beo");
                    else
                        System.out.println("pig");
                }

            }
        }
    }
}
