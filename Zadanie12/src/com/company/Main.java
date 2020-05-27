package com.company;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static int RomanIntoArabic(String a) {
        Map<Character, Integer> RomanNumbers = new HashMap<Character, Integer>();
        RomanNumbers.put('I', 1);
        RomanNumbers.put('V', 5);
        RomanNumbers.put('X', 10);
        RomanNumbers.put('L', 50);
        RomanNumbers.put('C', 100);
        RomanNumbers.put('D', 500);
        RomanNumbers.put('M', 1000);
        int final_number = 0;
        for (int i = 0; i < a.length(); i += 1) {
            if (i == 0 || RomanNumbers.get(a.charAt(i)) <= RomanNumbers.get(a.charAt(i - 1)))
                final_number += RomanNumbers.get(a.charAt(i));
            else
                final_number += RomanNumbers.get(a.charAt(i)) - 2 * RomanNumbers.get(a.charAt(i - 1));
        }
        return final_number;
    }
    public static void main(String[] args) {
        Scanner RomanNumber =new Scanner(System.in);
        System.out.print("Введите римскую цифру: ");
        String number = RomanNumber.nextLine();
        int number_output = RomanIntoArabic(number);
        System.out.println("Римская цифра:" + number + " равна:" + number_output);
        Scanner number_in = new Scanner(System.in);
        System.out.print("Введите число для проверки: ");
        int i = number_in.nextInt();
        if (String.valueOf(i).equals(new StringBuilder(String.valueOf(i)).reverse().toString())){
            System.out.println("Число палиндром");
        }
        else{
            System.out.println("Число не палиндром");
        }
    }

}
