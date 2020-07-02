package B1.ngon_ngu_lap_trinh_java.baitap;

import java.util.Scanner;

public class Hienthicacloaihinh {
    public static void main(String[] args) {
        System.out.println("1. Print the rectangle");

        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");

        System.out.println("3. Print isosceles triangle");

        System.out.println("4. Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.println("chon: ");
        int num =Integer.parseInt(scanner.nextLine());
        int i;
        int j;
        switch (num){
            case 1:{
                System.out.println("1.Print the rectangle");
                for(i=0;i<=2;i++){
                    System.out.println("");
                    for(j=0;j<=10;j++)
                        System.out.print("*");
                }
                break;
            }
            case 2:{
                System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)"+"\n"+" Choice one:");
                System.out.println("1.Top-left");
                System.out.println("2.Top-Right");
                Scanner number = new Scanner(System.in);
                int n = Integer.parseInt(number.nextLine());
                switch (n){
                    case 1:{
                        for (i=5;i>=0;i--){
                            System.out.println(" ");
                            for(j=0;j<=i;j++)
                                System.out.print("*");
                        }
                        break;
                    }
                    case 2:{
                        for(i=0;i<=5;i++){
                            System.out.println(" ");
                            for(j=i;j>=0;j--)
                                System.out.print("*");
                        }
                        break;
                    }
                }
                break;
            }
            case 3:{
                System.out.println("3.Print isosceles triangle");
                break;
            }
            case 4:{
                System.out.println("4.Exit");
                break;
            }
        }
    }
}
