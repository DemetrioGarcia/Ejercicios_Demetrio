package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class BateriaMetodos {

    static Scanner entrada;

    public static void  Ejercicio1() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int num = entrada.nextInt();

        int n = alcubo(num);

        System.out.println(num+" al cubo es: "+n);
    }

    public static int alcubo(int n){

        n = n*n*n;

        return n;
    }

    public static void Ejercicio2(){

        int opc = menu();
        comprobar(opc);
    }

    public static void comprobar(int opc) {
        switch (opc){
            case 1:
                System.out.println("HAS ELEGIDO LA OPCIÓN 1!!!");
                break;
            case 2:
                System.out.println("HAS ELEGIDO LA OPCIÓN 2!!!");
                break;
            case 3:
                System.out.println("HAS ELEGIDO LA OPCIÓN 3!!!");
                break;
            case 4:
                System.out.println("SALIENDO DEL PROGRAMA...");
                break;
            default:
                System.out.println("Opción no reconocida, saliendo del programa...");
        }
    }

    public static int menu() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Opción 1: ");
        System.out.println("Opción 2: ");
        System.out.println("Opción 3: ");
        System.out.println("Opción 4: SALIR");

        return entrada.nextInt();
    }

    public static void Ejercicio3(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una palabra: ");
        String palabra = pasarMay(entrada.next());
        System.out.println(palabra);
        int contador = cantvocales(palabra);
        System.out.println("Cantidad de vocales: "+contador);
    }

    public static int cantvocales(String palabra) {
        int contador=0;
        String[] array = palabra.split("");
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("A") || array[i].equals("E") || array[i].equals("I") || array[i].equals("O") || array[i].equals("U")){
                contador++;
            }
        }
       return contador;
    }

    public static String pasarMay(String palabra) {

        return palabra.toUpperCase();

    }

    public static void Ejercicio4(){

    }

        public static boolean casoDePrueba() {
            float dato = entrada.nextFloat();
            if (dato==-1) {
                return false;
            }
            else {
                float[] semana = rellenarDatos(dato);
                String diamay = masVentas(semana);
                String diamenos = menosVentas(semana);
                float media = media(semana);
                String recaudacion = recaudacion(semana[5],media);
                System.out.println(diamay+" "+diamenos+" "+recaudacion);
                return true;
            }
        }

        public static void main(String[] args) {
            entrada = new java.util.Scanner(System.in);
            while (casoDePrueba()) {

            }
        }

        public static float[] rellenarDatos(float dato){
            float[] datos = new float[6];

            datos[0] = dato;
            for (int i = 1; i < datos.length; i++) {
                datos[i] = entrada.nextFloat();
            }
            return datos;
        }

    public static String masVentas(float[] semana){

        String dia;
        int x=0;
        float may=0;

        float[] semana2 = semana.clone();
        Arrays.sort(semana2);

        may = semana2[5];

        for (int i = 0; i < semana.length; i++) {
            if (may==semana[i]){
                x = i;
            }
        }

        dia = switch (x) {
            case 0 -> "Martes";
            case 1 -> "Miercoles";
            case 2 -> "Jueves";
            case 3 -> "Viernes";
            case 4 -> "Sábado";
            case 5 -> "Domingo";
            default -> "ERROR";
        };
        return dia;
    }

    public static String menosVentas(float[] semana){

        String dia;
        int x=0;
        float may=0;

        float[] semana2 = semana.clone();
        Arrays.sort(semana2);

        may = semana2[0];

        for (int i = 0; i < semana.length; i++) {
            if (may==semana[i]){
                x = i;
            }
        }

        dia = switch (x) {
            case 0 -> "Martes";
            case 1 -> "Miercoles";
            case 2 -> "Jueves";
            case 3 -> "Viernes";
            case 4 -> "Sábado";
            case 5 -> "Domingo";
            default -> "ERROR";
        };
        return dia;
    }

    public static float media (float[] semana){

        float media = 0;
        for (int i = 0; i < semana.length; i++) {
             media = media + semana[i];
        }
        media = media/ semana.length;
        return media;
    }

    public static String recaudacion (float domingo, float media){

        String recaudacion;

        if (media>domingo){
            recaudacion = "NO";
        }
        else {
            recaudacion="Sí";
        }
        return recaudacion;
    }
}
