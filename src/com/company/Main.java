package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void reverseNumber(int number){
        List<Integer> array = new ArrayList<>();
        int newNumber;
        while (number!=0){
        newNumber=number%10;
        number=number/10;
        array.add(newNumber);
        }
        for (Integer value: array){
            System.out.println(value);
        }
    }

    public static int reverseNumber2(int originNumber){
        int temporary;
        int newNumber=0;
       while(originNumber!=0){
        temporary=originNumber%10;
        originNumber/=10;
        newNumber=newNumber*10+temporary;
       }
       return newNumber;
    }

   public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       System.out.println("Podaj liczbę: ");
       int number = scanner.nextInt();
       System.out.println("Liczba odwrócona to: ");
       reverseNumber(number);

       System.out.println("Podaj liczbę: ");
       int originNumber = scanner.nextInt();
       System.out.println("Liczba po odwróceniu to: "+reverseNumber2(originNumber));

   }
}
