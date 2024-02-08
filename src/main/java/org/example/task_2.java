//2. Написать программу, которая принимает на вход две строки (a и b) и сравнивает их.
// В результате сравнения в консоль должно быть выведено одно из сообщений: "Строки неидентичны" или "Строки идентичны"


package org.example;

import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        StringBuilder lineFirst = new StringBuilder(scanner.nextLine());
        System.out.println("Введите вторую строку: ");
        StringBuilder lineSec = new StringBuilder(scanner.nextLine());
        if (lineFirst.toString().equals(lineSec.toString())) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }


    }
}