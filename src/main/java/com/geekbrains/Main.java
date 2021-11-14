package com.geekbrains;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

/* 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
С помощью цикла и условия заменить 0 на 1, 1 на 0;*/

        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(array));
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 1) {
                    array[i] = 0;
                } else if (array[i] == 0){
                    array[i] = 1;
                } else break;
            }
        System.out.println(Arrays.toString(array));

//2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

        int[] i_arr = new int[100];
        for (int i = 0; i < i_arr.length; i++) {
            i_arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(i_arr));

//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 6) arr[i] *= 2;
        }
        System.out.println(Arrays.toString(arr));

/* 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы
одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 */

        int[][] arr_multi = new int[10][10];
        for (int i = 0; i < arr_multi.length; i++){
            int value = 1;
            for (int j = 0; j < arr_multi.length; j++){
                if ( i == j){
                    arr_multi[i][j] = value;
                }
            }
        }

        for (int i = 0; i < arr_multi.length; i++) {
            for (int j = 0; j < arr_multi.length; j++) {
                System.out.print(arr_multi[i][j] + " ");
            }
            System.out.println();
        }

/*5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int
длиной len, каждая ячейка которого равна initialValue;
 */
        printArr(20, 5);


// 6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

        int[] arrayList = new int[15];
        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arrayList));

        int minEll = 100;

        for (int i = 0; i < arrayList.length; i++){
            if (arrayList[i] < minEll) {
                minEll = arrayList[i];
            }
        }
        System.out.println("Минимальный эллемент в массиве " + minEll);

        int maxEll = 0;
        for (int i = 0; i < arrayList.length; i++){
            if (arrayList[i] > maxEll) {
                maxEll = arrayList[i];
            }
        }
        System.out.println("Максимальный эллемент в массиве " + maxEll);
    }

// метод для 5го задания.
    public static void printArr(int len, int initialValue){
        int[] printArr = new int[len];
        for (int i = 0; i < printArr.length; i++){
            printArr[i] = initialValue;
        }
        System.out.println(Arrays.toString(printArr));
    }
}


