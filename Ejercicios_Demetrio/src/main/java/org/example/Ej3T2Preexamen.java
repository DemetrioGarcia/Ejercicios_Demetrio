package org.example;

import java.util.Scanner;

public class Ej3T2Preexamen {
    public void Ejercicio1(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Cuantos meses quieres financiar?");
        int meses = entrada.nextInt();

        int n=10, total=0;
        for (int i=0 ; i<meses ; i++){
            System.out.println("Mes "+(i+1)+": "+n+"€");
            total += n;
            n = n*2;
        }
        System.out.println("Total a pagar: "+total+"€");
    }
}
