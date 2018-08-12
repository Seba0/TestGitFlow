package com.seba0.sda;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static void wyswietlTekst(String tekst) {
        System.out.println(String.format("Tekst: {0}", tekst));
    }

    public static int sumowanieTablicy(int[] tablica) {
        if (tablica == null) {
            return 0;
        }
        int suma = 0;
        for (int element : tablica) {
            suma += element;
        }
        return suma;
    }
}
