package B1.ngon_ngu_lap_trinh_java.thuchanh;

import java.util.Scanner;

public class TimUCLcua2so {
    public static void main(String[] args){
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap a: ");
        a=Integer.parseInt(scanner.nextLine());
        System.out.println("nhap b: ");
        b =Integer.parseInt(scanner.nextLine());
        a=Math.abs(a);
        b=Math.abs(b);
        if(a==0||b==0){
            System.out.println("ko co ucln");
        }
        else
            while (a!=b){
                if(a>b)
                    a=a-b;
                else
                    b=b-a;
            }
        System.out.println(a+ " la ucln");


    }
}
