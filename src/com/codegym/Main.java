package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int[] array;
        int size;
        do {
            System.out.print("Enter size: ");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("Size < 30");
            }
        } while (size > 30);
        // nhap gia tri vao mang
        array = new int[size];
        addElement(array);
        System.out.println("Điểm của các sinh viên là: ");
        for (int element : array) {
            System.out.print(element + "\t");
        }
        // tinh so sinh vien do
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 5) {
                count++;
            }
        }
        System.out.println("\nSố lượng sinh viên đỗ là: "+count);

    }

    //hàm nhập giá trị vào mảng
    public static int[] addElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (10 - 1) + 1);
        }
        return arr;
    }


}
