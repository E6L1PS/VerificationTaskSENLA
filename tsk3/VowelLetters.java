package ru.mirea.ivbo0419.tskSENLA.tsk3;

import  javafx.util.Pair;
import java.util.*;

public class VowelLetters {
    static boolean is_vowel(char c) {
        if (c == 'а' || c == 'о' || c == 'э' || c == 'и' || c == 'ы' || c == 'у' || c == 'е' || c == 'ё' || c == 'ю' || c == 'я' ||
            c == 'А' || c == 'О' || c == 'Э' || c == 'И' || c == 'Ы' || c == 'У' || c == 'Е' || c == 'Ё' || c == 'Ю' || c == 'Я')
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] sArray = s.split(" ");

        Pair<Integer, String> [] pairs = new Pair[sArray.length];
        int[] cnt = new int[sArray.length];

        for(int i = 0; i < sArray.length; ++i) {
            String str = null;
            for (int j = 0; j < sArray[i].length(); ++j) {
                if (is_vowel(sArray[i].charAt(j))) {
                    cnt[i]++;
                    if(cnt[i] == 1) {
                        str = sArray[i].substring(0, j) + Character.toUpperCase(sArray[i].charAt(j)) + sArray[i].substring(j+1);
                    }
                }
            }
            pairs [i] = new Pair(cnt[i], str);
        }

        Arrays.sort(pairs, new Comparator<Pair<Integer, String>>() {
            @Override
            public int compare(Pair<Integer, String> p1, Pair<Integer, String> p2) {
                return -(p1.getKey()- p2.getKey());
            }
        });

        for(Pair p : pairs) {
            System.out.print(p.getValue()+" ");
        }
    }
}
