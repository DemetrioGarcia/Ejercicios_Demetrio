package org.example;
import java.util.Scanner;

public class Ejercicio1 {
    public void ejecutar() {

        Scanner entradaEscaner = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int num1 = entradaEscaner.nextInt();

        if(num1 > 0){
            System.out.println("El número "+num1+" es positivo");
        } else if (num1 < 0) {
            System.out.println("El número "+num1+" es negativo");
        }
        else {
            System.out.println("El número "+num1+" es neutro");
        }
    }
}
