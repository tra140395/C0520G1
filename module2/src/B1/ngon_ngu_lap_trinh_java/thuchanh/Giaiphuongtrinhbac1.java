package B1.ngon_ngu_lap_trinh_java.thuchanh;

import java.io.InterruptedIOException;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Giaiphuongtrinhbac1 {
    public static void main(String[] args) {
        System.out.println("enter constants");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("b = ");
        int b = Integer.parseInt(scanner.nextLine());
       if(a==0){
           System.out.println("pt vo nghiem");
       }else {
           int x= (-b) / a;
           System.out.printf("pt co 1 nghiem la c= %d",x);
       }
    }
    }
