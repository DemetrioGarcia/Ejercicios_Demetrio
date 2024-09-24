package org.example;
import java.util.Scanner;

public class Ejercicio4 {
    public void ejecutar() {

        Scanner entradaEscaner = new Scanner(System.in);

        System.out.println("Introduce la base del triangulo");
        int b = entradaEscaner.nextInt();

        while (b<=0){
            System.out.println("La base tiene que ser mayor de 0");
            b = entradaEscaner.nextInt();
        }
        System.out.println("Introduce la altura del triangulo");
        int h = entradaEscaner.nextInt();

        while (h<=0){
            System.out.println("La altura tiene que ser mayor de 0");
            h = entradaEscaner.nextInt();
        }
        int A = (b*h)/2 ;
        System.out.println("El area del triangulo es:"+A);

    }
}