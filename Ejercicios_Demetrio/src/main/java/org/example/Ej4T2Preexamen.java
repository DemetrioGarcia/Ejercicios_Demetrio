package org.example;

import java.util.Scanner;

public class Ej4T2Preexamen {
    public void Ejercicio1(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una nota númerica: ");
        int nota = entrada.nextInt();

        switch (nota) {
            case 0, 1, 2, 3, 4:
                System.out.println("INSUFICIENTE");
                break;
            case 5:
                System.out.println("SUFICIENTE");
                break;
            case 6:
                System.out.println("BIEN");
                break;
            case 7,8:
                System.out.println("NOTABLE");
                break;
            case 9,10:
                System.out.println("SOBRESALIENTE");
                break;
            default:
                System.out.println("No valido");
        }
    }
}
