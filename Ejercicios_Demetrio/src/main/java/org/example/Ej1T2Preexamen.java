package org.example;

import java.util.Scanner;

public class Ej1T2Preexamen {
    public void Ejercicio1() {
        Scanner entrada = new Scanner(System.in);

        int may = 0, men = 0, ig = 0;
        System.out.println("Cuantos números quieres introducir: ");
        int cant = entrada.nextInt();

        for (int i = 0; i < cant; i++) {
            System.out.println("Introduce un número número: ");
            int n = entrada.nextInt();
            if (n > 0) {
                may++;
            } else if (n < 0) {
                men++;
            } else {
                ig++;
            }
        }
        System.out.println("Mayores que 0: " + may);
        System.out.println("Menores que 0: " + men);
        System.out.println("Iguales que 0: " + ig);
    }
}