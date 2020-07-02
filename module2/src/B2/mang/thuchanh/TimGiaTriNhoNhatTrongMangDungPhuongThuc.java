package B2.mang.thuchanh;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMangDungPhuongThuc {
    public static void main(String[] args) {
//        int size;
//        int[] array;
//        Scanner scanner = new Scanner(System.in);
//        do {
//            System.out.print("enter do dai array: ");
//            size = Integer.parseInt(scanner.nextLine());
//            if (size > 10)
//                System.out.println("array qua dai");
//        } while (size > 10);
//        int i=0;
//        array = new int[size];
//        while (i<array.length){
//            System.out.println("nhap element vi tri "+(i+1));
//            array[i] = Integer.parseInt(scanner.nextLine());
//            i++;
//        }
//        for(int j =0;j<array.length;j++)
//            System.out.print(array[j]);
//        System.out.println("");
//        for(int array1: array)
//            System.out.print(array1);
        int[] array = {3, 4, 5, 8, 2, 9, 4};
        int index = minValue(array);
        System.out.println("the smallest " + array[index]);
    }

    public static int minValue(int[] array) {
        int i;
        int min = array[0];
        int index = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}


