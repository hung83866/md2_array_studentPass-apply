package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int[] studentList = new int[30];
        for (int i = 0 ;i<30;i++){
            System.out.println("nhập điểm vào đi bro!");
            int a = scanner.nextInt();
            if (a>=0&&a<=10){
                studentList[i]=a;
            }else {
                System.out.println("Điểm sai kìa, Nhập lại đi!");
                i--;
            }
        }
        System.out.println("Số người pass = "+studentPass(studentList));
    }

    static int studentPass(int[] studentPoint) {
        int count = 0;
        for (int i = 0; i < studentPoint.length; i++) {
            if (studentPoint[i] >= 5) {
                count++;
            }
        }
        return count;
    }
}
