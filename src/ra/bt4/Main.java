package ra.bt4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào kích thước Matrix");
        System.out.println("Nhập vào số dòng");
        int row = sc.nextInt();
        System.out.println("Nhập vào số cột ");
        int col = sc.nextInt();
        int [][] array =  input2DimensionArray(row,col);
        System.out.println("kich thươc matrix");
        printArray(array);
        maxValue(array);

    }

    public static int[][] input2DimensionArray(int row, int col) {
        Scanner sc = new Scanner(System.in);
        int[][] arrray = new int[row][col];
        for (int i = 0; i < arrray.length;i++){
            for ( int j = 0; j< arrray[i].length; j++){
                System.out.print("nhập giá trị cho hàng, cột " + i + " " + j);
                arrray[i][j] = sc.nextInt();

            }

        }
        return arrray;


    }

    public static void maxValue(int [][] arr){
        int max = 0;
        int col = 0;
        int row = 0;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] > max){
                    max = arr[i][j];
                    col = i;
                    row = j;
                }
            }
        }
        System.out.println("phần tử lớn nhất trong mảng: " + max );
        System.out.println("tọa độ là: " + row + " " + col);
    }

    public static void printArray (int [][] arr){
        for (int[] value1 : arr){
            for (int vale2: value1){
                System.out.println(vale2 + "  " );
            }
        }
        System.out.println();
    }
}

