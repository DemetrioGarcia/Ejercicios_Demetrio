package org.example;

import java.util.Scanner;

public class Ej5T2Preexamen {
    public void Ejercicio1() {

        Scanner entrada = new Scanner(System.in);

        int mayor=0, smax=0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Introduce un sueldo: ");
            int sueldo = entrada.nextInt();

            if (sueldo>1000){
                mayor++;
            }
            if(sueldo>smax){
                smax=sueldo;
            }
        }
        System.out.println("El mayor sueldo es: "+smax+" y hay "+mayor+" que cobran más de 1000€");
    }
}
