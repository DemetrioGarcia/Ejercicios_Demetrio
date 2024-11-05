package org.example;

import java.util.Arrays;
import java.util.Random;

public class ArraysEj7 {
    public void Ejercicio7(){

        Random random = new Random();

        int[] num = new int[3];
        int[] num2 = new int[3];

        //System.out.print("Array normal: ");
        for (int i = 0 ; i < num.length ; i++){
            num[i]= random.nextInt(101);
            num2[i]= random.nextInt(101);
            //System.out.print(num[i]+" ");
            //System.out.print(num2[i]+" ");
        }

        int[] numcomb = new int[6];

        for (int i=0 ; i < numcomb.length; i++){
            if (i<=2) {
                numcomb[i] = num[i];
            }
            else {
                numcomb[i] = num2[i-3];
            }
        }
        System.out.println("La combinacion de arrays es: "+ Arrays.toString(numcomb));
    }
}
