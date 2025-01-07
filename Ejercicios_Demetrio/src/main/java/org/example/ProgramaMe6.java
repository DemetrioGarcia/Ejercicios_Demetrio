package org.example;
import java.util.Scanner;

public class ProgramaMe6 {

        static Scanner in;

        public static boolean casoDePrueba() {
            if (!in.hasNext()) {
                return false;
            } else {

                String cadena = in.nextLine().trim();

                if (puedeReorganizar(cadena)) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }

                return true;
            }
        }

        public static boolean puedeReorganizar(String cadena) {
            int[] frecuencias = new int[26];


            for (int i = 0; i < cadena.length(); i++) {
                char letra = cadena.charAt(i);
                frecuencias[letra - 'A']++;
            }

            int maxFrecuencia = 0;
            for (int frecuencia : frecuencias) {
                if (frecuencia > maxFrecuencia) {
                    maxFrecuencia = frecuencia;
                }
            }

            int longitud = cadena.length();
            return maxFrecuencia <= (longitud + 1) / 2;
        }

        public static void main(String[] args) {
            in = new Scanner(System.in);
            while (casoDePrueba()) {

            }
            in.close();
        }

}
