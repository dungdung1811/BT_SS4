package ra.bt2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1,2,3,4,5,6,7};
        System.out.println("nhap vao phan tu can chen");
        int add = sc.nextInt();
        System.out.println("nhap vao vi tri can chen");
        int index = sc.nextInt();
        if (index < 0 || index > array.length){
            System.out.println("khong the chen phan tu vao mang");
        } else {
            int [] newArray = new int[array.length+1];
            for (int i = 0 ; i < index; i++ ){
                newArray[i] = array[i];
            }
            newArray[index] = add;

            for (int i = index+1; i < newArray.length; i++ ){
                newArray[i]= array[i -1];
            }
            array = newArray;
            System.out.println("mang sau khi chen phan tu " + add + " " + Arrays.toString(array));
        }
    }
}
