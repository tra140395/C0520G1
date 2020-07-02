package B1.ngon_ngu_lap_trinh_java.baitap;

import java.util.Scanner;

public class Hienthicacsnt {
    public static void main(String[] args) {
        for(int i = 0; i<100;i++){
            if (check_songuyento(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean check_songuyento(int num){
        boolean check = false;
        for(int i =2;i<num/2;i++){
            if(num%i == 0){
                check = true;
                break;
            }
        }
        if (!check) {
            return  true;
        } else {
            return false;
        }
    }
}
