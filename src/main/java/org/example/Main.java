package org.example;

import java.util.Scanner;
import java.util.regex.*;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку для проверки: ");
        String s = scanner.nextLine();

        int max = 0;
        int cur = 0;
        for (int i = 0; i < s.length(); i++) {
            cur = 0;
            for (int j = i; j < s.length(); j++) {
                if (s.substring(i, j).indexOf(s.charAt(j)) != -1) {
                    break;
                }
                cur++;
            }
            if (cur > max) {
                max = cur;
            }
        }
        System.out.println("Вы ввели: " + s);
        System.out.println("Максимальная длина подстроки без повторяющихся символов: " + max);

        scanner.close();
    }
}