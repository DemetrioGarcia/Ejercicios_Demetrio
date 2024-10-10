package org.example;

import java.util.EmptyStackException;
import java.util.Scanner;

public class Ejercicio5T2 {
    public void Ejercicio5() {
        Scanner Entrada = new Scanner(System.in);
        int intentos = 10;
        String espacio = " ";

        System.out.println("Jugador 1: Introduce una frase:");
        String frase = Entrada.nextLine();
        frase = espacio.concat(frase);
        frase = frase.concat(" ");
        System.out.println("Jugador 2: Intenta adivinar una palabra de la frase:");
        String palabra = Entrada.nextLine();
        palabra = espacio.concat(palabra);
        palabra = palabra.concat(" ");

        while (intentos > 0) {

            if (frase.contains(palabra)) {
                System.out.println("Enhorabuena has ganado. Aún te quedaban " + intentos + " intentos");
                intentos = 0;
            } else {
                intentos -= 1;
                System.out.println("Intento fallido te quedan " + intentos + " intentos");
                palabra = Entrada.nextLine();
                palabra = espacio.concat(palabra);
                palabra = palabra.concat(" ");
            }
        }
    }
}