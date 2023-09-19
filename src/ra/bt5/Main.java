package ra.bt5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào kích thước mảng");
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.println("nhap vào giá trị thứ " + (i + 1) + " ");
            array[i] = sc.nextInt();
        }
        System.out.println("mảng vưừa tạo ra là: ");
        for (int arr : array) {
            System.out.print(arr + " \n");
        }
        int min = array[0];
        for (int a : array) {
            if (a < min) {
                min = a;
            }

        }
        System.out.println("\n" + min + " là phàn tư nhỏ nhất trong mảng");


    }
}

