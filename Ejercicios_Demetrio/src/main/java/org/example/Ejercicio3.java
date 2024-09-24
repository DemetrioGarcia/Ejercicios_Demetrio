package org.example;
import java.util.Scanner;

public class Ejercicio3 {
    public void ejecutar() {

        Scanner entradaEscaner = new Scanner(System.in);

        System.out.println("Introduce el dividendo: ");
        int num1 = entradaEscaner.nextInt();

        System.out.println("Introduce el divisor: ");
        int num2 = entradaEscaner.nextInt();

        if (num2 == 0){
            System.out.println("ERROR: El divisor no puede ser 0");
        }
        else {
            int division = num1/num2 ;
            System.out.println("El resultado de la division es "+division);

        }
    }
}