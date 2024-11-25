package org.example;

import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class SopaDeLetras {
    public void Ejercicio1(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el número de filas: ");
        int f = entrada.nextInt();
        System.out.println("Introduce el número de columnas: ");
        int c  = entrada.nextInt();

        String[][] matriz = new String[f][c];

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Introduce las letras de la fila "+(i+1)+": ");
            String linea = entrada.next();
            linea = linea.toLowerCase();

            for (int j = 0; j < matriz[i].length; j++) {
                if (linea.length()==c){
                    matriz[i] = linea.split("");
                }
                else {
                    System.out.println("ERROR. Introduce datos válidos: "+c+" letras.");
                    System.exit(0);
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println("Introduce la palabra a buscar: ");
        String palabra = entrada.next();
        palabra = palabra.toLowerCase();

        String[] vectorbus = palabra.split("");

        

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

                if (Objects.equals(matriz[i][j], vectorbus[0])) {
                        int colant = j;
                        int filant = i;
                        boolean aux = true;

                    for (int k = 0; k < vectorbus.length; k++){
                         if (!Objects.equals(matriz[i][j], vectorbus[k]) || j == matriz[0].length-1){
                             aux = false;
                             break;
                         }
                         else {
                             j++;
                         }
                    }
                    j = colant;

                    if (!aux) {
                        aux = true;
                        for (int k = 0; k < vectorbus.length; k++) {
                            if (!Objects.equals(matriz[i][j], vectorbus[k])  || i == matriz.length-1) {
                                aux = false;
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                    i = filant;

                    if (!aux) {
                        aux = true;
                        for (int k = 0; k < vectorbus.length; k++) {
                            if (!Objects.equals(matriz[i][j], vectorbus[k]) || j == matriz[0].length-1 || i == matriz.length-1) {
                                aux = false;
                                break;
                            } else {
                                i++;
                                j++;
                            }
                        }
                    }
                    i = filant;
                    j = colant;

                    if (!aux) {
                        aux = true;
                        for (int k = 0; k < vectorbus.length; k++) {
                            if (!Objects.equals(matriz[i][j], vectorbus[k]) || j==0) {
                                aux = false;
                                break;
                            } else {
                                j--;
                            }
                        }
                    }
                    i = filant;
                    j = colant;

                    if (!aux) {
                        aux = true;
                        for (int k = 0; k < vectorbus.length; k++) {
                            if (!Objects.equals(matriz[i][j], vectorbus[k]) || i<0) {
                                aux = false;
                                break;
                            } else {
                                i--;
                            }
                        }
                    }
                    i = filant;
                    j = colant;

                    while (aux){
                        System.out.println("Encontrada en la posicion: ("+(i+1)+","+(j+1)+")");
                        aux = false;
                    }
                    j++;
                }
            }
        }
    }
}
