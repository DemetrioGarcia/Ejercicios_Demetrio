package org.example;

import java.util.Scanner;

public class Ejercicio1T2 {
        public void Ejercicio1(){
            Scanner Entrada = new Scanner(System.in);
            System.out.println("Escribe una palabra o frase");
            String frase = Entrada.nextLine();
            System.out.println("Texto original: "+frase);
            int longitud = frase.length();
            System.out.println("La longitud del texto es: "+longitud);
            System.out.println("El texto sin espacios: "+frase.replace(" " ,""));
            int mitad = longitud/2;
            String mitad1 = frase.substring(0 , mitad);
            String mitad2 = frase.substring(mitad);
            System.out.println("La mitad del texto es: "+mitad1+" , la otra mitad es: "+mitad2);
            System.out.println("El texto en mayusculas es: "+frase.toUpperCase());

        }
}
