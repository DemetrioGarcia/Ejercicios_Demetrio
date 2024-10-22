package org.example;

import java.util.Scanner;

public class Practica3T2 {
    public void Practica3() {

        Scanner Entrada = new Scanner(System.in);

        int posicion = 0;
        int pos = 0;
        int totalf = 0;
        int total = 0;
        System.out.println("Introduce el ISBN: ");
        String ISBN = Entrada.next();
        int tamanyo = ISBN.length();

        if (tamanyo==10 && (ISBN.indexOf("?") == ISBN.lastIndexOf("?")) && (ISBN.indexOf("x") == 9 || !ISBN.contains("x"))) {
            for (int i = 0; i < 10; i++) {

                String caracter = String.valueOf(ISBN.charAt(i));
                if (caracter.equalsIgnoreCase("x")) {
                    totalf = totalf + 10;
                } else if (caracter.equals("?")) {
                    pos = 10 - i;
                } else {
                    int sum = Integer.parseInt(caracter);
                    total = sum * (10 - i);
                    totalf += total;
                }
            }
            if (pos > 0) {
                for (int i = 0; i < 10; i++) {

                    posicion = (totalf + i * pos) % 11;

                    if (posicion == 0) {
                        System.out.println("El digito que falta es " + i);
                        break;
                    }

                }
            } else {
                if (totalf % 11 == 0) {
                    //System.out.println(totalf);
                    System.out.println("ISBN correcto");
                } else {
                    //System.out.println(totalf);
                    System.out.println("ISBN incorrecto");
                }
            }
        }
        else {
            System.out.println("ISBN no válido (Comprueba que tenga 10 digitos o solo le falte un digito '?' ");
        }
    }
}
