package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Matrizeslvl1 {
    public void Ejercicio1(){

        Scanner entrada = new Scanner(System.in);

        int matriz[][] = new int [3][3];

        for (int i=0; i< matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++) {

                System.out.println("Introduce el valor [" + i + "," + j + "]");
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Que número quieres buscar? ");
        int buscar = entrada.nextInt();

        for (int i=0; i< matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++) {

                if (matriz[i][j]==buscar){
                    System.out.println("El número "+buscar+" se encuentra en la posicion ("+i+", "+j+")");
                }
            }
        }
    }

    public void Ejercicio2(){

        Random random = new Random();
        int f = random.nextInt(5)+1;
        int c = random.nextInt(5)+1;

        int matriz[][] = new int [f][c];

        System.out.println("MATRIZ:");
        for (int i=0; i< matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++) {

                matriz[i][j] = random.nextInt(101);
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println("Suma de Filas:");
        for (int i=0; i< matriz.length; i++){
            int suma=0;
            for (int j=0; j<matriz[i].length; j++) {

                suma += matriz[i][j];

            }
            System.out.println("Fila "+(i+1)+": "+suma);
        }

        System.out.println("Suma de Columnas:");
        for (int i=0; i< matriz[0].length; i++){
            int suma=0;
            for (int j=0; j < matriz.length; j++) {

                suma += matriz[j][i];

            }
            System.out.println("Columna "+(i+1)+": "+suma);
        }


    }

    public void Ejercicio3() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Cuantos estudiantes quiere introducir: ");
        int estudiantes = entrada.nextInt();

        System.out.println("Cuantas asignaturas quiere introducir: ");
        int asignaturas = entrada.nextInt();

        String matriz[][] = new String[estudiantes + 1][asignaturas + 1];

        for (int i = 0; i < estudiantes; i++) {

            System.out.println("Introduce el nombre del estudienate " + (i+1));
            String nombre = entrada.next();

            matriz[i + 1][0] = nombre;
        }

        for (int i = 0; i < asignaturas; i++) {

            System.out.println("Introduce la asignatura " + (i+1));
            String asignatura = entrada.next();

            matriz[0][i + 1] = asignatura;
        }

        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz[i].length; j++) {

                System.out.println("Inserte la nota de " + matriz[i][0] + " para la asignatura de " + matriz[0][j]);
                int nota = entrada.nextInt();
                matriz[i][j] = String.valueOf(nota);
            }
        }

        System.out.println(Arrays.deepToString(matriz));

        for (int i = 1; i < matriz.length; i++) {
            int media = 0;
            for (int j = 1; j < matriz[i].length; j++) {

               media += Integer.parseInt(matriz[i][j]);

            }

            media = media/(matriz[i].length-1);
            System.out.println("La nota media del alumno "+matriz[i][0]+" es "+media);
        }

        for (int i = 1; i < matriz.length; i++) {
            int media = 0;
            for (int j = 1; j < matriz[i].length; j++) {

                media += Integer.parseInt(matriz[j][i]);

            }

            media = media/(matriz.length-1);
            System.out.println("La nota media de la asignatura "+matriz[0][i]+" es "+media);
        }
    }
}
