package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordsInTreeSetDemo
{
    public static void main(String[] args) throws FileNotFoundException {
        Set<String> words = new TreeSet<String>();
        long totalTime = 0;

        File file = new File("..\\alice30.txt");
        Scanner in = new Scanner(file);
        while (in.hasNext()) {
            String word = in.next();
            long callTime = System.currentTimeMillis();
            words.add(word);
            callTime = System.currentTimeMillis() - callTime;
            totalTime += callTime;
        }

        Iterator<String> iter = words.iterator();
        for (int j = 1; j <= 20; ++j) {
            System.out.println(iter.next());
        }

        System.out.println(". . .");
        System.out.println(words.size() + " unikalnych słów. " + totalTime + " milisekund.");
        // 5908 unikalnych slow. 32 milisekund / 28 milisekund / 21 milisekund
    }
}

