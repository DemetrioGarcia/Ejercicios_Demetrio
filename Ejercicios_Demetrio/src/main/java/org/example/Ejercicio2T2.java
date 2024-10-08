package org.example;

import java.util.Scanner;

public class Ejercicio2T2 {
    public void Ejercicio2(){
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Escribe una palabra: ");
        String palabra1 = Entrada.next();
        System.out.println("Escribe otra palabra: ");
        String palabra2 = Entrada.next();

        int tam1 = palabra1.length();
        int tam2 = palabra2.length();
        if (tam1>tam2){
            System.out.println("La palabra "+palabra1+" es más grande");
        } else if (tam2>tam1) {
            System.out.println("La palabra "+palabra2+" es más grande");
        }
        else {
            System.out.println("La palabra "+palabra1+" y la palabra "+palabra2+" son iguales de tamaño");

        }
    }
}
