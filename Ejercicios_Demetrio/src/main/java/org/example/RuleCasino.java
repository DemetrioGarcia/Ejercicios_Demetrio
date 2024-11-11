package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RuleCasino {
    public void Ruletilla(){

        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        String[] colores = {"negro", "rojo"};
        String[] par = {"par", "impar"};
        Integer[] numeros = new Integer[37];
        int numruleta = random.nextInt(37);
        int colorruleta = random.nextInt(2);
        String parelecc = "";
        int j=0;

        for (int i=0 ; i <= 36 ; i++){
            numeros[i]=i;
        }
        System.out.println("Introduce un número: ");
        int numelecc = entrada.nextInt();

        boolean num_comp = Arrays.asList(numeros).contains(numelecc);

        if (!num_comp){
            System.out.println("ERROR. Número introducido no valido.");
        }
        else{
            if (numelecc!=0) {
                System.out.println("Introduce el color: ");
                String colorelecc = entrada.next();
                colorelecc = colorelecc.toLowerCase();

                boolean color_comp = Arrays.asList(colores).contains(colorelecc);
                boolean par_comp = false;
                if (!color_comp) {
                    System.out.println("ERROR. Color introducido no válido.");
                } else {
                    System.out.println("Introduce si es par o impar: ");
                    parelecc = entrada.next();
                    parelecc = parelecc.toLowerCase();
                    par_comp = Arrays.asList(par).contains(parelecc);
                }
                if (!par_comp) {
                    System.out.println("ERROR. Par o impar introducido incorrectamente.");
                } else {
                    if (numruleta % 2 == 0) {
                        System.out.println("Ha tocado el numero " + numruleta + " color " + colores[colorruleta] + " par");
                        j=0;
                    } else {
                        System.out.println("Ha tocado el numero " + numruleta + " color " + colores[colorruleta] + " impar");
                        j=1;
                    }
                    if (numelecc==numruleta && colorelecc.equals(colores[colorruleta]) && parelecc.equals(par[j])){
                        System.out.println("HAS GANADO");
                    }
                    else if(numelecc!=numruleta && colorelecc.equals(colores[colorruleta]) && !parelecc.equals(par[j])){
                        System.out.println("Has acertado el color");
                    }
                    else if (numelecc!=numruleta && !colorelecc.equals(colores[colorruleta]) && parelecc.equals(par[j])){
                        System.out.println("Has acertado que es par/impar");
                    }
                    else if (numelecc==numruleta && !colorelecc.equals(colores[colorruleta]) && !parelecc.equals(par[j])){
                        System.out.println("Has acertado el número.");
                    }
                    else {
                        System.out.println("Has perdido");
                    }
                }
            }
            else {
                if (numruleta % 2 == 0) {
                    System.out.println("Ha tocado el numero " + numruleta + " color " + colores[colorruleta] + " par");
                } else {
                    System.out.println("Ha tocado el numero " + numruleta + " color " + colores[colorruleta] + " impar");
                }
                if (numelecc==numruleta){
                    System.out.println("HAS GANADO, el resto de la mesa pierde");
                }
                else {
                    System.out.println("Has perdido");
                }
            }
        }
    }
}
