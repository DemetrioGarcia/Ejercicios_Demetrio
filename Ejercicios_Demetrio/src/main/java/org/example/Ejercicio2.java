package org.example;
import java.util.Scanner;

public class Ejercicio2 {
    public void ejecutar() {

        Scanner entradaEscaner = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int num1 = entradaEscaner.nextInt();

        System.out.println("Introduce otro numero: ");
        int num2 = entradaEscaner.nextInt();

        if (num1>num2){
            System.out.println("El numero "+num1+" es mayor que "+num2);
        } else if (num1==num2) {
            System.out.println("ERROR: El numero "+num1+" y "+num2+" son iguales");
        }
        else {
            System.out.println("El numero "+num1+" es menor que "+num2);
        }
    }
}