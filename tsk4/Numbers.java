package ru.mirea.ivbo0419.tskSENLA.tsk4;
import java.util.Scanner;


public class Numbers {
    public static void print_zero(int h, String[] str, char c) {
        switch (h) {
            case 0 -> str[h] += " "+c+c+c+c+"   ";
            case 1 -> str[h] += ""+c+c+"  "+c+c+"  ";
            case 2 -> str[h] += c+"    "+c+"  ";
            case 3 -> str[h] += c+"    "+c+"  ";
            case 4 -> str[h] += c+"    "+c+"  ";
            case 5 -> str[h] += ""+c+c+"  "+c+c+"  ";
            case 6 -> str[h] += " "+c+c+c+c+"   ";
            default -> throw new IllegalStateException("Unexpected value: " + h);
        }
    }
    public static void print_one(int h, String[] str, char c) {
        switch (h) {
            case 0 -> str[h] += "  "+c+c+"    ";
            case 1 -> str[h] += " "+c+" "+c+"    ";
            case 2 -> str[h] += c+"  "+c+"    ";
            case 3 -> str[h] += "   "+c+"    ";
            case 4 -> str[h] += "   "+c+"    ";
            case 5 -> str[h] += "   "+c+"    ";
            case 6 -> str[h] += ""+c+c+c+c+c+c+"  ";
            default -> throw new IllegalStateException("Unexpected value: " + h);
        }
    }
    public static void print_two(int h, String[] str, char c) {
        switch (h) {
            case 0 -> str[h] += " "+c+c+c+c+"   ";
            case 1 -> str[h] += ""+c+c+"  "+c+c+"  ";
            case 2 -> str[h] += "    "+c+"   ";
            case 3 -> str[h] += "   "+c+"    ";
            case 4 -> str[h] += "  "+c+"     ";
            case 5 -> str[h] += " "+c+"      ";
            case 6 -> str[h] += ""+c+c+c+c+c+c+"  ";
            default -> throw new IllegalStateException("Unexpected value: " + h);
        }
    }
    public static void print_three(int h, String[] str, char c) {
        switch (h) {
            case 0 -> str[h] += " "+c+c+c+c+"   ";
            case 1 -> str[h] += ""+c+c+"  "+c+c+"  ";
            case 2 -> str[h] += "    "+c+"   ";
            case 3 -> str[h] += "  "+c+c+c+"   ";
            case 4 -> str[h] += "    "+c+"   ";
            case 5 -> str[h] += ""+c+c+"  "+c+c+"  ";
            case 6 -> str[h] += " "+c+c+c+c+"   ";
            default -> throw new IllegalStateException("Unexpected value: " + h);
        }
    }
    public static void print_four(int h, String[] str, char c) {
        switch (h) {
            case 0 -> str[h] += "   "+c+"    ";
            case 1 -> str[h] += "  "+c+c+"    ";
            case 2 -> str[h] += " "+c+" "+c+"    ";
            case 3 -> str[h] += c+"  "+c+"    ";
            case 4 -> str[h] += ""+c+c+c+c+"    ";
            case 5 -> str[h] += "   "+c+"    ";
            case 6 -> str[h] += "   "+c+"    ";
            default -> throw new IllegalStateException("Unexpected value: " + h);
        }
    }
    public static void print_five(int h, String[] str, char c) {
        switch (h) {
            case 0 -> str[h] += ""+c+c+c+c+c+c+"  ";
            case 1 -> str[h] += c+"       ";
            case 2 -> str[h] += c+"       ";
            case 3 -> str[h] += ""+c+c+c+c+c+"   ";
            case 4 -> str[h] += "     "+c+"  ";
            case 5 -> str[h] += ""+c+c+"  "+c+c+"  ";
            case 6 -> str[h] += " "+c+c+c+c+"   ";
            default -> throw new IllegalStateException("Unexpected value: " + h);
        }
    }
    public static void print_six(int h, String[] str, char c) {
        switch (h) {
            case 0 -> str[h] += " "+c+c+c+c+"   ";
            case 1 -> str[h] += ""+c+c+"      ";
            case 2 -> str[h] += c+"       ";
            case 3 -> str[h] += ""+c+c+c+c+c+"   ";
            case 4 -> str[h] += c+"    "+c+"  ";
            case 5 -> str[h] += ""+c+c+"  "+c+c+"  ";
            case 6 -> str[h] += " "+c+c+c+c+"   ";
            default -> throw new IllegalStateException("Unexpected value: " + h);
        }
    }
    public static void print_seven(int h, String[] str, char c) {
        switch (h) {
            case 0 -> str[h] += ""+c+c+c+c+c+c+"  ";
            case 1 -> str[h] += "     "+c+"  ";
            case 2 -> str[h] += "    "+c+"   ";
            case 3 -> str[h] += "   "+c+"    ";
            case 4 -> str[h] += "  "+c+"     ";
            case 5 -> str[h] += "  "+c+"     ";
            case 6 -> str[h] += "  "+c+"     ";
            default -> throw new IllegalStateException("Unexpected value: " + h);
        }
    }
    public static void print_eight(int h, String[] str, char c) {
        switch (h) {
            case 0 -> str[h] += " "+c+c+c+"    ";
            case 1 -> str[h] += c+"   "+c+"   ";
            case 2 -> str[h] += c+"   "+c+"   ";
            case 3 -> str[h] += " "+c+c+c+"    ";
            case 4 -> str[h] += c+"   "+c+"   ";
            case 5 -> str[h] += c+"   "+c+"   ";
            case 6 -> str[h] += " "+c+c+c+"    ";
            default -> throw new IllegalStateException("Unexpected value: " + h);
        }
    }
    public static void print_nine(int h, String[] str, char c) {
        switch (h) {
            case 0 -> str[h] += ""+c+c+c+c+c+c+"  ";
            case 1 -> str[h] += c+"    "+c+"  ";
            case 2 -> str[h] += c+"    "+c+"  ";
            case 3 -> str[h] += ""+c+c+c+c+c+c+"  ";
            case 4 -> str[h] += "     "+c+"  ";
            case 5 -> str[h] += "     "+c+"  ";
            case 6 -> str[h] += ""+c+c+c+c+c+c+"  ";
            default -> throw new IllegalStateException("Unexpected value: " + h);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = {"","","","","","",""};

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); ++i) {
            int nextNumber = Integer.parseInt(String.valueOf(s.charAt(i)));
            if (nextNumber > max) {
                max = nextNumber;
            }
        }
        for (int i = 0; i < s.length(); ++i) {
            for(int h = 0; h < 7; ++h){
                char ch = s.charAt(i);
                switch (ch) {
                    case '0' -> {
                        if (max == 0) {
                            print_zero(h, str, '0');
                        } else {
                            print_zero(h, str, '*');
                        }
                    }
                    case '1' -> {
                        if (max == 1) {
                            print_one(h, str, '1');
                        } else {
                            print_one(h, str, '*');
                        }
                    }
                    case '2' -> {
                        if (max == 2) {
                            print_two(h, str, '2');
                        } else {
                            print_two(h, str, '*');
                        }
                    }
                    case '3' -> {
                        if (max == 3) {
                            print_three(h, str, '3');
                        } else {
                            print_three(h, str, '*');
                        }
                    }
                    case '4' -> {
                        if (max == 4) {
                            print_four(h, str, '4');
                        } else {
                            print_four(h, str, '*');
                        }
                    }
                    case '5' -> {
                        if (max == 5) {
                            print_five(h, str, '5');
                        } else {
                            print_five(h, str, '*');
                        }
                    }
                    case '6' -> {
                        if (max == 6) {
                            print_six(h, str, '6');
                        } else {
                            print_six(h, str, '*');
                        }
                    }
                    case '7' -> {
                        if (max == 7) {
                            print_seven(h, str, '7');
                        } else {
                            print_seven(h, str, '*');
                        }
                    }
                    case '8' -> {
                        if (max == 8) {
                            print_eight(h, str, '8');
                        } else {
                            print_eight(h, str, '*');
                        }
                    }
                    case '9' -> {
                        if (max == 9) {
                            print_nine(h, str, '9');
                        } else {
                            print_nine(h, str, '*');
                        }
                    }
                    default -> System.out.println("error  ");
                }
            }
            }
        for(int h = 0; h < str.length; ++h) {
            System.out.println(str[h]+"\n");
        }
    }
}

