package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio4T2 {
    public void Ejercicio4(){
        Scanner Entrada = new Scanner(System.in);

        System.out.println("Escribe una frase: ");
        String frase = Entrada.nextLine();
        frase = frase.concat(" ");

        System.out.println("Que subcadena quieres buscar?");
        String cadena = Entrada.next();
        cadena = cadena.concat(" ");

        int posicion = 0;
        int i = 0;

        while (posicion>=0) {

            posicion = frase.indexOf(cadena, posicion + 1);
            if (posicion > 0) {
                i++;
            }
        }
        System.out.println("La palabra "+cadena+" aparece "+i+" veces.");

    }
}
