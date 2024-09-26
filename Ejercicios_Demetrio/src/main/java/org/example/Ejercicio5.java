package org.example;
import java.util.Scanner;

public class Ejercicio5 {
    public void Menornum() {

        Scanner entradaEscaner = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int num1 = entradaEscaner.nextInt();

        System.out.println("Introduce otro numero: ");
        int num2 = entradaEscaner.nextInt();

        System.out.println("Introduce un ultimo numero: ");
        int num3 = entradaEscaner.nextInt();
        if (num1!=num2 && num1!=num3 && num2!=num3) {
            if (num1 < num2) {
                if (num1 < num3) {
                    System.out.println("El numero mas pequeño es: " + num1);
                } else {
                    System.out.println("El numero mas pequeño es: " + num3);
                }
            } else if (num2 < num3) {
                System.out.println("El numero mas pequeño es: " + num2);
            } else {
                System.out.println("El numero mas pequeño es: " + num3);
            }
        }
        else {
            System.out.println("ERROR. Números introducidos son iguales");
        }
    }

}
