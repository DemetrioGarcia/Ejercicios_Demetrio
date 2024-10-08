package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica4 {
    public void Multiplicacion() {
        int n1=1000;
        int n2=0;
        int aux=0;
        int multiplicacion;

        Scanner entradaEscaner = new Scanner(System.in);
        while(n1>999 || n1<-999 || n2>999 || n2<-999) {
            try {

                System.out.println("Introduce un multiplicando(3 cifras):");
                n1 = entradaEscaner.nextInt();

                System.out.println("Introduce un multiplicador(3 cifras):");
                n2 = entradaEscaner.nextInt();

            } catch (NumberFormatException | InputMismatchException ex) {
                System.out.println("Introduce un numero valido");
                entradaEscaner.next();
            }
        }
        int total = n1 * n2;
        if (n1<0){
            n1=n1*-1;
        }
        if (n2<0){
            n2=n2*-1;
        }
            String cifra1 = Integer.toString(n1);
            String cifra2 = Integer.toString(n2);
            if (cifra1.length()==3 && cifra2.length()==3) {
                    System.out.println("El producto de la multiplicación es: " + total);
                    System.out.println("El proceso es:");
                    System.out.println("  " + n1);
                    System.out.println("X " + n2);
                    System.out.println("________");
                    for (int i = 2; i >= 0; i--) {
                        cifra1 = cifra2.substring(i, i + 1);
                        int cifram = Integer.parseInt(cifra1);
                            multiplicacion = cifram * n1;
                        if (i > 1) {
                            System.out.println("+  " + multiplicacion);
                        } else if (i == 1) {
                            System.out.println("  " + multiplicacion + "x");
                        } else {
                            System.out.println(multiplicacion + "xx");
                        }
                    }
                    System.out.println("________");
                    System.out.println("" + total);
            }
            else {
                    System.out.print("Los productos han de tener 3 cifras");
            }
    }
}