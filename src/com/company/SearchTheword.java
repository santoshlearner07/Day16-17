package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//public class SearchTheword {
//}
//package com.company;

        import java.util.*;

        import java.util.HashMap;
        import java.util.Map;

public class SearchTheword {

    static void findTheWord(String sentence) { //, String found
        Scanner sc = new Scanner(System.in);
        System.out.println("Finding the word from the user");
        System.out.println("Find the word from given sentence->");
        String find = sc.nextLine();
        String[] msg = sentence.split(sentence);
        String newSent = " ";
        for (String word : msg) {
            if (word == find) {
                System.out.println("Your word is present" + find);
            } else {
                System.out.println("Not here");
                break;
            }
        }
    }


    public static void main(String[] args) {
        String sentence2 = "Finding the word from the user";
        String x[] = sentence2.toLowerCase().split(" ");
        Map<String, Integer> words = new HashMap<>();
        for (String word : x) {
            if (words.containsKey(word)) {
                words.put(word, 1 + words.get(word));
            } else {
                words.put(word, 1);
            }
        }
        System.out.println(words);

        String sentence = "Finding the word from the user";
        String found = " ";
        findTheWord(sentence);

    }
}
