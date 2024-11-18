package org.example;

import java.util.Scanner;

public class PrematricesEj2 {
    public void Ejercicio2(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la altura del triangulo: ");
        int alt = entrada.nextInt();

        for (int i=0 ; i<alt ; i++){
            System.out.println("");
            for (int j=0 ; j<=i ; j++){
                System.out.print("*");
            }
        }
    }
}
