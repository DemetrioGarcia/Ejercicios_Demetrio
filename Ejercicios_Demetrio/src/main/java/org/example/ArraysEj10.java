package org.example;

import java.util.Scanner;

public class ArraysEj10 {
    public void Ejercicio10(){

        Scanner entrada = new Scanner(System.in);

        String array[] = new String[3];

        System.out.println("Introduce la primera palabra");
        array[0] = entrada.nextLine();

        System.out.println("Introduce la segunda palabra");
        array[1] = entrada.nextLine();

        System.out.println("Introduce la tercera palabra");
        array[2] = entrada.nextLine();

        System.out.println("Introduce una letra: ");
        String letra = entrada.nextLine();

        char inicial = letra.charAt(0);

        System.out.println("Palabras que empìezan por "+inicial+": ");
        for (String i: array){
            if (inicial ==i.charAt(0)){
                System.out.println(i);
            }
        }
    }
}
