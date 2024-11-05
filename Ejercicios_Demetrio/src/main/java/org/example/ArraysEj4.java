package org.example;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysEj4 {
    public void Ejercicio4(){

        Random random = new Random();
        Scanner entrada = new Scanner(System.in);

        int num[] = new int[5];
        int cant;

        for (int i = 0 ; i < num.length ; i++){
            num[i]= random.nextInt(101);
            System.out.print(num[i]+" ");
        }
        System.out.println();

        System.out.println("Introduce el índice que quieres eliminar");
        int indice = entrada.nextInt();

        System.out.println("Array resultante: ");

        for( int i=0 ; i < num.length ; i++){
            if (i==indice){
                continue;
            }
            System.out.print(num[i]+" ");
        }

    }
}
