package org.example;

import java.util.Random;
import java.util.Scanner;

public class ArraysEj3 {
    public void Ejercicio3(){

        Random random = new Random();
        Scanner entrada = new Scanner(System.in);

        int num[] = new int[25];
        int cant=0;

        for (int i = 0 ; i < num.length ; i++){
            num[i]= random.nextInt(101);
        }

        System.out.println("Introduce un número del 0 al 100");
        int numelegido = entrada.nextInt();

        for(int i=0; i < num.length ; i++){
            if (num[i]==numelegido){
                cant++;
            }
        }

        System.out.println("El numero "+numelegido+" aparece "+cant+" veces" );


    }
}
