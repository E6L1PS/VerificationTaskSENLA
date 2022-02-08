package ru.mirea.ivbo0419.tskSENLA.tsk2;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);

        while(!sc.hasNextInt()) {
            sc.next();
            System.out.println("Ошибка, введите число заново:");
        }
        int num = sc.nextInt();
        int i = 2;

        while (num > 1) {
            while (num % i == 0) {
                num /= i;
                System.out.println(i);
            }
            ++i;
        }

    }
}
