package org.example;

import java.util.Scanner;

public class BuclesEj2 {
    public void Ejercicio2(){
        Scanner Entrada = new Scanner(System.in);

        System.out.println("Introduce un numero:");
        int num = Entrada.nextInt();

        for (int i = num; i > 0 ; i--){

            System.out.println(i);
        }
    }
}
