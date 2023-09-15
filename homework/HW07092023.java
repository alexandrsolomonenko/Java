package HomeWork;

import java.util.Random;
import java.util.Scanner;

public class HW07092023 {
    public static void main(String[] args) {

//        Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
//                Числа могут быть, как целочисленные, так и дробные.
//        Например :
//        ввод : m=10.5, n=10.45
//        вывод: Число 10.45 ближе к 10.

        double m = 10.5;
        double n = 10.45;
        double result;

        if (m < n) {
            System.out.println("Число " + m + " ближе к 10.");
        } else if (m > n) {
            System.out.println("Число " + n + " ближе к 10.");
        } else {
            System.out.println();
        }
//
////        Часы для работников
//
        Random random = new Random();
        int h = random.nextInt(28801);

        System.out.println("Осталось секунд: " + h);
        int hours = h / 3600;

        if (hours > 0) {
            System.out.println("Осталось " + hours + " часов");
        } else {
            System.out.println("Осталось менее часа");
        }


    }
        }



// Ссылка на опрос =  https://docs.google.com/document/d/1hrC3vxQgRH5ikYWxJRRmaLZdGJxfZSGe/edit?usp=sharing&ouid=114823458722605890072&rtpof=true&sd=true
