package B1.ngon_ngu_lap_trinh_java.baitap;

import java.util.Scanner;

public class Ungdungdocsothanhchuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so: ");
        int number = Integer.parseInt(scanner.nextLine());
        if (number >= 0 && number <= 19) {
            switch (number) {
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("for");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;
                case 10:
                    System.out.print("ten");
                    break;
                case 11:
                    System.out.print("eleven");
                    break;
                case 12:
                    System.out.print("twelve");
                    break;
                case 13:
                    System.out.print("thirteen");
                    break;
                case 14:
                    System.out.print("fourteen");
                    break;
                case 15:
                    System.out.print("fifteen");
                    break;
                case 16:
                    System.out.print("sixteen");
                    break;
                case 17:
                    System.out.print("seventeen");
                    break;
                case 18:
                    System.out.print("eighteen");
                    break;
                case 19:
                    System.out.print("nineteen");
                    break;
            }
        }else if(number>=20 &&number<=99){
            switch (number/10){
                case 2:
                    System.out.print("twenty");
                    break;
                case 3:
                    System.out.print("thirty");
                    break;
                case 4:
                    System.out.print("fourty");
                    break;
                case 5:
                    System.out.print("fifty");
                    break;
                case 6:
                    System.out.print("sixty");
                    break;
                case 7:
                    System.out.print("seventy");
                    break;
                case 8:
                    System.out.print("eighty");
                    break;
                case 9:
                    System.out.print("ninety");
                    break;
            }
            switch (number%10){
                case 1:
                    System.out.print(" one");
                    break;
                case 2:
                    System.out.print(" two");
                    break;
                case 3:
                    System.out.print(" three");
                    break;
                case 4:
                    System.out.print(" four");
                    break;
                case 5:
                    System.out.print(" five");
                    break;
                case 6:
                    System.out.print(" six");
                    break;
                case 7:
                    System.out.print(" seven");
                    break;
                case 8:
                    System.out.print(" eight");
                    break;
                case 9:
                    System.out.print(" nine");
                    break;
            }


        }
    }
}
