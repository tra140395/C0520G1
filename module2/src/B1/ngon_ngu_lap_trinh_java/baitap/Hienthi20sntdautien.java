package B1.ngon_ngu_lap_trinh_java.baitap;

public class Hienthi20sntdautien {
    public static void main(String[] args) {
        int count = 0;
        int i;
        int n = 3;
        while (count <= 20) {
            boolean check = true;
            for (i = 2; i < n; i++) {
                if (n % i == 0) {
                    check = false;
                }
            }

            if (check) {
                System.out.print(" " + n);
                count += 1;
            }
            n += 1;
        }

//        int count = 0;
//        for (int i = 3; count<=20; i++){
//            if (check_songuyento(i)== true){
//                System.out.println(i);
//                count++;
//            }
//        }
//    }
//    public static boolean check_songuyento(int num){
//        boolean check = false;
//        for(int i =2;i<num/2;i++){
//            if(num%i == 0){
//                check = true;
//                break;
//            }
//        }
//        if (!check) {
//            return  true;
//        } else {
//            return false;
//        }
//    }
    }
}

