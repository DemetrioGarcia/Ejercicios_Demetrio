package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio6 {
    public static void Compra() {

        Scanner entradaEscaner = new Scanner(System.in);

        System.out.println("Tenemos tomate?");
        String tomate = entradaEscaner.next();
        tomate = tomate.toLowerCase();

        System.out.println("Tenemos aceite?");
        String aceite = entradaEscaner.next();
        aceite = aceite.toLowerCase();

        System.out.println("Tenemos jamon?");
        String jamon = entradaEscaner.next();
        jamon = jamon.toLowerCase();

        if (jamon.equals("no") || aceite.equals("no")|| tomate.equals("no")){
           System.out.println("Tienes que ir a comprar");
        }
        else {
            System.out.println("No tienes que ir a comprar");
        }
    }
}
