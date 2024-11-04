package org.example;

import java.util.Random;

public class ArraysEj1 {
    public void  Ejercicio1(){

        Random random = new Random();

        int num[] = new int[8];
        int total = 0;

        for (int i=0; i< num.length; i++){
            num[i]= random.nextInt(501);
            total = total + num[i];
            //System.out.println(num[i]);
        }
        System.out.println("La suma de 8 números aleatorios es: "+total);
    }
}
