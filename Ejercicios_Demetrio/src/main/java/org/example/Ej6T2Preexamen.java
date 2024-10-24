package org.example;

import java.util.Scanner;

public class Ej6T2Preexamen {
    public void Ejercicio1(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Cuantos niños quieres medir?");
        int cant = entrada.nextInt();
        int edad = 0, altura=0, mayores=0,alto=0, maltura=0, medad=0;

        for (int i=0 ; i<cant ; i++){

            System.out.println("Introduce la edad del niño");
            edad = entrada.nextInt();
            System.out.println("Introduce la altura del niño (cm)");
            altura = entrada.nextInt();
            if (edad>18){
                mayores++;
            }
            if (altura>175){
                alto++;
            }
            maltura += altura;
            medad += edad;
        }
        System.out.println("La altura media es: "+(maltura/cant)+" y edad media es: "+(medad/cant));
        System.out.println("Mayores de 18: "+mayores);
        System.out.println("Más altos de 175cm: "+alto);
    }
}
