package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysEj9 {
    public void Ejercicio9(){
        Scanner entrada = new Scanner(System.in);
        int auxmay = 0, pos=0;

        String array[] = new String[3];
        System.out.println("Introduce la primera palabra");
        array[0] = entrada.nextLine();

        System.out.println("Introduce la segunda palabra");
        array[1] = entrada.nextLine();

        System.out.println("Introduce la tercera palabra");
        array[2] = entrada.nextLine();

        for (int i=0; i < 3 ; i++){

            int aux = array[i].length();

            if (aux>auxmay){
                auxmay=aux;
                pos=i;
            }
        }
        System.out.println("La palabra más larga era: "+array[pos]);
    }
}
