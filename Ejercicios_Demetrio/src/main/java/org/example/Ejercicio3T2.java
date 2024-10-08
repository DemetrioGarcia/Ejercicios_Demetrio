package org.example;

import java.util.EmptyStackException;
import java.util.Scanner;

public class Ejercicio3T2 {
    public void Ejercicio3(){
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Escribe un número: ");
        int n = Entrada.nextInt();
        System.out.println("Cuantas cifras le quieres quitar? ");
        int m = Entrada.nextInt();

        String cifra = Integer.toString(n);
        int tamanyo = cifra.length();
        String ciframod = cifra.substring(0,tamanyo-m);

        System.out.println(ciframod);

    }
}
