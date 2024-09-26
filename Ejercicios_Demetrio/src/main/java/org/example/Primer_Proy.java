package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Primer_Proy {
    public void ejecutar() {

        Scanner entradaEscaner = new Scanner(System.in);

        System.out.println("¿Como te llamas?: ");
        String nombre = entradaEscaner.next();

        System.out.println("¿A qué curso vas?: ");
        String curso = entradaEscaner.next();

        System.out.println("Hola " + nombre + ", bienvenid@ a " + curso);

        int num1 = 0;
        int num2 = 0;
        while (num1 == 0 || num2 == 0) {

            try {
                System.out.println("Introduce un numero: ");
                num1 = entradaEscaner.nextInt();

                System.out.println("Introduce un numero: ");
                num2 = entradaEscaner.nextInt();
            }
            catch (NumberFormatException | InputMismatchException ex) {
                System.out.println("Introduce un número válido.");
                entradaEscaner.next();
            }
            if (num1 == 0 || num2 == 0) {
                System.out.println("No sumes con 0");
            }
        }
            int total;
            total = num1 + num2;

            System.out.println("La suma de los dos números es: " + total);

    }
}