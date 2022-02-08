package ru.mirea.ivbo0419.tskSENLA.tsk1;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int result = 0;

        for (int i = 0; i < s.length(); ++i) {
            if (Character.isDigit(s.charAt(i))) {
                result += s.charAt(i) - '0';
            }
        }
        System.out.println(result);
    }
}
