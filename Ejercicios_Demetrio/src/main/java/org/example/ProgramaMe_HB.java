package org.example;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class ProgramaMe_HB {

    static Scanner entrada;

    public static void main(String[] args) {
        entrada = new Scanner(System.in);
        while (casoDePrueba()) {

        }
    }

    public static boolean casoDePrueba() {
        boolean aux = true;
        int tiempomax = 0;
        while (aux) {
            try {
                tiempomax = Integer.parseInt(entrada.nextLine());
                aux = false;
            } catch (NumberFormatException e) {
                System.out.println("ERROR");
                entrada.nextLine();
                aux = true;
            }
        }

        if (tiempomax <= 0 || tiempomax > 100001) {
            return false;
        } else {
            int[] felicitaciones = cadenaDatos();
            System.out.println(Arrays.toString(felicitaciones));
            int cant = CantFelic(felicitaciones, tiempomax);
            System.out.println(cant);
            return true;
        }
    }

    public static int[] cadenaDatos() {
//        System.out.print("Introduce una cadena que acabe en 0:");
        String felicitaciones;
        int[] tiempo2 = null;
        int[] tiempo = null;
        try {
            felicitaciones = entrada.nextLine();

            String[] tfel = felicitaciones.split(" ");
            tiempo = new int[tfel.length];
            tiempo2 = new int[tiempo.length];

            for (int i = 0; i < tfel.length; i++) {

                if (tiempo[i] > 1000000000) {
                    System.out.println("ERROR");
                    System.exit(0);
                }
                if (Objects.equals(tfel[i], "0")) {
                    tiempo[i] = Integer.parseInt(tfel[i]);
                    Arrays.sort(tiempo);
                    break;
                }
                tiempo[i] = Integer.parseInt(tfel[i]);

            }
        } catch (NumberFormatException e) {
            entrada.nextLine();
            System.out.println("ERROR");
        }
        for (int i = 0; i < tiempo2.length; i++) {

            if (i == tiempo2.length - 1) {
                tiempo2[i] = 0;
            } else {
                tiempo2[i] = tiempo[i + 1];
            }
        }
        return tiempo2;
    }

    public static int CantFelic(int [] datos, int tiempo){

        int respuestas = 0;
        int tiempot = 0;

        for (int i = 0; i < datos.length-1; i++) {
            int tmsg = datos[i];

            if (tmsg<=tiempot){

            }else {
                respuestas++;
                i--;
                tiempot=tiempot+tiempo;
            }
        }

        return respuestas;
    }
}

