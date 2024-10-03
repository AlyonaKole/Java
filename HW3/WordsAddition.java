package Homeworks.HW3;

import java.util.Scanner;

public class WordsAddition {
    public static void main(String[] args) {
       /* 1 уровень сложности: №1
        Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв
        (проверьте количество букв в слове).
        Нужно получить слово, состоящее из первой половины первого слова и второй
        половины второго слова. распечатать на консоль.
         Например:
        ввод - mama, papa
        вывод - mapa */
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter a word 1    " );
        String word1 = scan1.next();
        System.out.println("Enter a word 2  ");
        String word2 = scan1.next();

        String firstHalf = word1.substring(0, word1.length()/2);
        String secondHalf = word2.substring(word2.length()/2);
        String result = firstHalf + secondHalf;
        System.out.println("Your result is  " + result);
        



    }

   //public static String getWord(string word1, string word2) {



   }




