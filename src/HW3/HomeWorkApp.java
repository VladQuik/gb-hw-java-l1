/*
1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью
цикла и условия заменить 0 на 1, 1 на 0;
2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
 заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить
 элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1],
 [2][2], …, [n][n];
5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int
длиной len, каждая ячейка которого равна initialValue;
*/

package HW3;

import java.util.Scanner;

public class HomeWorkApp {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int arr[];
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        returnArray(10, 10);
    }

    //Задание 1
    public static void invertArray() {
        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = 1;
            } else if (a[i] == 1) {
                a[i] = 0;
            }
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    //Задание 2
    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println(arr[i]);
        }
    }

    //Задание 3
    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
    }

    //Задание 4
    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            arr[i][i] = 1;
            arr[i][3 - i] = 1;
        }
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j = j + 1) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Задание 5
    public static int[] returnArray(int len, int initialValue) {
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
