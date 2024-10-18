package org.example;

import java.util.Scanner;

public class BuclesEj8 {
    public void Ejercicio8(){

        Scanner Entrada = new Scanner(System.in);

        System.out.println("Introduce una frase");
        String frase = Entrada.nextLine();

        int longitud = frase.length();

        for (int i = longitud-1 ; i >= 0 ; i--){
            char caracter = frase.charAt(i);
            System.out.println(caracter);
        }
    }
}
