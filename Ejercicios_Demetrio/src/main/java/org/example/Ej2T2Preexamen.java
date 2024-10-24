package org.example;

import java.util.Scanner;

public class Ej2T2Preexamen {
    public void Ejercicio1() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Que número quieres elevar? ");
        int base = entrada.nextInt();
        System.out.println("Introduce el exponente:  ");
        int expo = entrada.nextInt();

        int total = base;
        for (int i=0 ; i < expo; i++){
            total = total *base;
        }
        System.out.println("El resultado es: "+total);
    }
}

