package org.example;

import java.util.Scanner;

public class BateriaMetodos {
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

        for (){
        float[] semana = entradatos();
        String mayventas = masVentas(semana);
         }
    }

    public static float[] entradatos(){

        float[] semana = new float[6];
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            semana[i] = entrada.nextFloat();
        }

        return semana;
    }

    public static String masVentas(float[] semana){

        String dia;
        int x=0;
        int may=0;

        for (int i = 1; i < semana.length; i++) {
            if (semana[x]>semana[i]){
                int may=x;
            }
            else{
                x=i;
            }
        }

        switch (may){
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            default:
                
        }
        return dia;
    }

}
