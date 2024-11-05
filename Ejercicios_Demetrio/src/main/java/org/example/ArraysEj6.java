package org.example;

import java.util.Random;

public class ArraysEj6 {
    public void Ejercicio6(){

        Random random = new Random();

        int[] num = new int[5];
        int[] num2 = num.clone();

        System.out.print("Array normal: ");
        for (int i = 0 ; i < num.length ; i++){
            num[i]= random.nextInt(101);
            System.out.print(num[i]+" ");
        }
        System.out.println("");
        System.out.println("Array invertido: ");
        for (int i=0 ; i < num2.length; i++){
            num2[i] = num[4-i];
            System.out.print(num2[i]+" ");
        }

        if (num[4] == num2[0] && num[3] == num2[1] && num[2] == num2[3] && num[1] == num2[3] && num[0] == num2[4]){
            System.out.println("El array es palindromo");
        }
        else {
            System.out.println("El array NO es palindromo");
        }
    }
}
