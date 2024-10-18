package org.example;

import java.util.Scanner;

public class BuclesEj6 {
    public void Ejercicio6(){

        Scanner Entrada = new Scanner(System.in);
        int total = 0;
        System.out.println("Cuantos números quieres sumar: ");
        int cantidad = Entrada.nextInt();

        for (int i = 1 ; i <= cantidad ; i++ ){
            System.out.println("Introduce numero "+i+": ");
            int n = Entrada.nextInt();
            total = total + n;
        }
        System.out.println("El resultado es: "+total);
    }
}
