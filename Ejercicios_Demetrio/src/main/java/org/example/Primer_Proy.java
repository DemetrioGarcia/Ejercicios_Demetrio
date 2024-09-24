package org.example;
import java.util.Scanner;

public class Primer_Proy {
    public void ejecutar() {

        Scanner entradaEscaner = new Scanner(System.in);

        System.out.println("¿Como te llamas?: ");
        String nombre = entradaEscaner.next();

        System.out.println("¿A qué curso vas?: ");
        String curso = entradaEscaner.next();

        System.out.println("Hola "+nombre+", bienvenid@ a "+curso);

        System.out.println("Introduce un numero: ");
        int num1 = entradaEscaner.nextInt();

        System.out.println("Introduce un numero: ");
        int num2 = entradaEscaner.nextInt();

        int total;
        total = num1+num2 ;

        System.out.println("La suma de los dos números es: "+total);
    }
}