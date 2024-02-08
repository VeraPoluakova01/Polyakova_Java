//1. Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
//  - сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов: "a > b", "a < b" или "a = b";
//  - совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.

package org.example;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.println("Введите первое число");
        a = sc.nextInt();//Считываем первое число

        System.out.println("Введите второе число");
        b = sc.nextInt();//Считываем второе число

        c = a + b;
        System.out.println("сумма = " + c);
        if (a > b) {
            System.out.println(a + " > " + b);
        } else {
            if (a < b) {
                System.out.println(a + " < " + b);
            } else {
                System.out.println(a + " = " + b);
            }
        }


    }
}