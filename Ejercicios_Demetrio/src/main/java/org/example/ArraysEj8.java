package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysEj8 {
    public void Ejercicio8(){

        Random random = new Random();
        Scanner entrada = new Scanner(System.in);

        int[] num = new int[5];
        int[] num2 = new int[6];

        System.out.print("Array normal: ");
        for (int i = 0 ; i < num.length ; i++){
            num[i]= random.nextInt(101);
            System.out.print(num[i]+" ");
        }

        System.out.println();
        System.out.println("En que indice quieres añadir un número? ");
        int indice = entrada.nextInt();

        System.out.println("Que número quieres introducir? ");
        int numintr = entrada.nextInt();

        if (indice>=6){
            indice=5;
        }

        for (int i=0 ; i < num2.length; i++){

            if (i==indice){
                num2[i]=numintr;
            }else if(i>indice){
                    num2[i]= num[i-1];
                }
            else {
                    num2[i]= num[i];
            }
        }

        System.out.println(Arrays.toString(num2));

    }
}
