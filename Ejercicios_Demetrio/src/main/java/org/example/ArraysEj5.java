package org.example;

import java.util.Random;

public class ArraysEj5 {
    public void Ejercicio5(){

        Random random = new Random();

        int[] num = new int[5];
        int[] num2 = num.clone();

        for (int i = 0 ; i < num.length ; i++){
            num[i]= random.nextInt(101);
            System.out.println(num[i]+" ");
        }

        int aux;
        aux = num[4];

        System.out.print("Array invertido: ");
        for (int i=0 ; i < num.length ; i++){
            if (i==0) {
                num2[i] = aux;
            }
            else {
                num2[i] = num[i-1];
            }
            System.out.print(num2[i]+" ");
        }

    }
}
