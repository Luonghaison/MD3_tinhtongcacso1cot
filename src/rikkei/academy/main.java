package rikkei.academy;
import java.util.Arrays;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số hàng vô đây:");
        int rows = sc.nextInt();
        System.out.println("Nhập số cột vào đây:");
        int cols = sc.nextInt();

        //tao mang kep
        int[][] arr = new int[rows][cols];
        //tạo mảng điền thông tin vô đây
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Nhập phần tử muốn in");
                arr[i][j] = sc.nextInt();

            }

//

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j]+ "   ");
            }
            System.out.println();
        }
//        tính tổng thôi ae
            System.out.println("Nhập cột mún tính tổng");
            int cot = sc.nextInt();
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += arr[i][cot-1];
            }
            System.out.println("Tổng của cột mún xóa là:" +sum);
    }
}
