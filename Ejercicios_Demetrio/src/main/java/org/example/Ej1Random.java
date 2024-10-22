package org.example;

import java.util.Random;

public class Ej1Random {
    public void Ejercicio1 (){
        Random random = new Random();
        int num1, num2, sum;

        num1 = random.nextInt(5) +1;
        num2 = random.nextInt(5) +1;
        sum = num1+num2;
        System.out.println("El resultado del primer dado es: "+num1);
        System.out.println("El resultado del segundo dado es: "+num2);
        System.out.println("El resultado de la suma es:  "+sum);


    }
}
