package com.company;

import java.util.Scanner;

/**
 * @author Yurii Selebynka
 * @version 1.0.0
 * @project YPalindromeChecker
 * @class com.company
 * @since 12-Mar-21 - 17.14
 *
 * Copyright (c) 1996-present Yurii Selebynka. All Rights Reserved.
 * UR1DAO
 *
 **/

public class Main {

    public static void main(String[] args) {

        String sentence = new String();

            System.out.println("__________________________________");
            System.out.println("|           welcome to           |");
            System.out.println("|       YPalindromeChecker       |");
            System.out.println("|________________________________|");
            System.out.println("|         author: Yurii Selebynka|");
            System.out.println("|                   version 1.0.0|");
            System.out.println("|                since 12.03.2021|");
            System.out.println("|________________________________|");
            System.out.println("| Enter a sentence for checking: |");
            System.out.println("|               or               |");
            System.out.println("| Enter 'q' for exit.            |");
            System.out.println("|________________________________|");
            do {
            Scanner scanner = new Scanner(System.in);
            sentence = scanner.nextLine();
            if (!sentence.equals("q")) {
                System.out.println("|________________________________|");
                System.out.println("|Your sentence is:               |" + "\n" +
                        "   " + sentence);
                sentence = sentence.replaceAll("[^A-Za-zА-Яа-я]", "");
                sentence = sentence.replaceAll("\\ ", "");
                sentence = sentence.replaceAll("\\–", "");
                sentence = sentence.replaceAll("\\.", "");
                sentence = sentence.replaceAll("\\,", "");
                sentence = sentence.replaceAll("\\?", "");
                sentence = sentence.replaceAll("\\!", "");
                sentence = sentence.toLowerCase();
                String template = "";
                for (int i = 0; i < sentence.length(); i++) {
                    int index = sentence.length() - i - 1;
                    template += sentence.charAt(index);
                    }

                if (/*!sentence.equals("q") && */sentence.equals(template)) {
                    System.out.println("|This sentence is palindrome.    |");
                    System.out.println("|________________________________|");
                    System.out.println("| Enter a sentence for checking: |");
                    System.out.println("|               or               |");
                    System.out.println("| Enter 'q' for exit.            |");
                    System.out.println("|________________________________|");

                    sentence = scanner.nextLine();
                    }

                else if (/*!sentence.equals("q") && */
                        !sentence.equals(template)) {
                    System.out.println("|This sentence is not palindrome.|");
                    System.out.println("|________________________________|");
                    System.out.println("| Enter a sentence for checking: |");
                    System.out.println("|               or               |");
                    System.out.println("| Enter 'q' for exit.            |");
                    System.out.println("|________________________________|");
                    }
                }

                else if (sentence.equals("q")) {
                    System.out.println("|________________________________|");
                    System.out.println("| Thank You for using my program |");
                    System.out.println("|______________EXIT______________|");
                    System.out.println("|  Copyright (c) Yurii Selebynka.|");
                    System.out.println("|================================|");
                    System.exit(1);
                    }

                } while (sentence != "q");
        }
}
