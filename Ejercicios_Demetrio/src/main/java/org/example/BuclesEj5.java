package org.example;

import java.util.Scanner;

public class BuclesEj5 {
    public void Ejercicio5(){

        Scanner Entrada = new Scanner(System.in);

        System.out.println("Introduce un numero que quieras ver su tabla de multiplicar:");
        int n = Entrada.nextInt();

        for (int i = 0; i <= 10; i++){
            int resultado = i*n;
            System.out.println(i+" X "+n+" = "+resultado);
        }
    }
}
