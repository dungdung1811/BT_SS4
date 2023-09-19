package ra.bt1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = {10, 4, 6, 7, 8, 6};
        System.out.println("nhap phan tu can xoa");
        int x = sc.nextInt();
        int index = -1;
        for (int i = 0; i < array.length; i++){
            if(array[i] == x){
                index = i;
                break;
            }
        }
        System.out.println(index);

        if (index != -1){
            for (int i = index; i < array.length-1; i++){
                array[i] = array[i+1];
            }
            array = Arrays.copyOf(array,array.length-1);
            System.out.println("mang sau khi xoa phan tu " + x + " la " + Arrays.toString(array));
        } else {
            System.out.println("Không tìm thấy phần tử " + x + " trong mảng.");
        }
    }
}
