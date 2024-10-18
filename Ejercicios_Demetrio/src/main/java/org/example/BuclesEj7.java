package org.example;

import java.util.Scanner;

public class BuclesEj7 {
    public void Ejercicio7(){

        Scanner Entrada = new Scanner(System.in);
        int total = 1;

        System.out.println("Introduce el numero que quieres factorizar: ");
        int n = Entrada.nextInt();

        for (int i = 1; i <= n ;i++){
            total =  total * i;

        }
        System.out.println("El factorial de "+n+" es "+total);

    }
}
