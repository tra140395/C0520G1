package B2.mang.thuchanh;

import java.util.Scanner;

public class SwapCacelementCuaMang {

    public static void main(String[] args) {
        int[]array;
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhap kich thuoc mang: ");
            size = Integer.parseInt(scanner.nextLine());
            if(size>10)
                System.out.println("size so big");
        } while(size > 10);
        array = new int[size];
        int i = 0;
        while (i<array.length){
            System.out.print("enter element1 "+(i+1)+" :");
            array[i]=scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for(int j=0;j<array.length;j++){
            System.out.print(array[j]+"  ");
        }
        for(int j=0;j<array.length/2;j++){
            int temp = array[j];
            array[j]=array[array.length-1-j];
            array[array.length-1-j]=temp;
        }
        System.out.printf("%-20s%s", "Elements in new array: ", "");
        for(int j=0;j<array.length;j++)
            System.out.print(array[j]+"\t");
    }
}
