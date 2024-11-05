package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysEj2 {
    public void Ejercicio2(){

        Random random = new Random();

        int num[] = new int[4];

        System.out.print("Array sin invertir: ");
        for (int i=0; i < num.length ; i++){
            num[i]= random.nextInt(501);
            System.out.print(num[i]+" ");
        }

        System.out.println();
        System.out.print("Array invertido: ");
        for (int i=3 ; i >= 0; i--){
            System.out.print(num[i]+" ");
        }
    }

}
