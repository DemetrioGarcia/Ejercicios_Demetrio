package org.example;

import java.util.Random;
import java.util.Scanner;

public class ArraysEj2 {
    public void Ejercicio2(){

        Random random = new Random();

        int num[] = new int[4];

        for (int i=0; i< num.length; i++){
            num[i]= random.nextInt(501);
        }
        for (int i=num.length; i>=0; i--){
            System.out.println(num[i]);
        }
    }

}
