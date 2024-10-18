package org.example;

import java.util.Scanner;

public class BuclesEj4 {
    public void Ejercicio4(){

        Scanner Entrada = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = Entrada.nextLine();

        int longitud = frase.length();

        for (int i = 0 ; i < longitud ; i++){
            char caracter = frase.charAt(i);
            System.out.println(caracter);
        }
    }
}
