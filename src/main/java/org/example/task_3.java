//3. Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10].
// Необходимо написать программу, которая выведет в консоль все чётные числа.


package org.example;

public class task_3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printOddNumbers(arr);
    }

    public static void printOddNumbers(int[] arr) {
        for (int x = 0; x < arr.length; x++)
            if (arr[x] % 2 == 0)
                System.out.print(arr[x] + " ");
    }
}
