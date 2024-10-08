package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio4T2 {
    public void Ejercicio4(){
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Escribe una frase: ");
        String frase = Entrada.nextLine();
        System.out.println("Que subcadena quieres buscar?");
        String cadena = Entrada.next();
        String frasemod = frase.replace(cadena,"a");
        System.out.println(frasemod);
    }
}
