package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practica2T3 {
    public void Ejercicio1() {

        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        int aciertos=0;
        int aciertoreintegro=0;
        int aciertocomp=0;
        int reintusuario=11;

        String boleto;
        boolean aux=true;
        do {

            System.out.println("Introduce tu boleto: (Separando los numeros con - )");
            boleto = entrada.nextLine();
        }
        while (!boleto.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d{1}"));

        String[] numeros = boleto.split("[-/]");
        int[] intnumeros = new int[numeros.length];

        for (int i = 0 ; i<numeros.length ; i++){
            if (i==6){
                intnumeros[i]=Integer.parseInt(numeros[i]);
                reintusuario=intnumeros[i];
            }
            else{
                intnumeros[i] = Integer.parseInt(numeros[i]);

            }
        }
        Arrays.sort(intnumeros);

        Integer[] sorteo = new Integer[6];
        int reintegro = random.nextInt(10);
        int complementario = 0;

        for (int i=0; i< sorteo.length; i++) {
                sorteo[i] = random.nextInt(49) + 1;
        }

        while (aux) {
                Arrays.sort(sorteo);
            aux = false;
            for (int j = 0; j < sorteo.length - 1; j++) {
                if (sorteo[j] == sorteo[j + 1]) {
                    sorteo[j + 1] = random.nextInt(49) + 1;
                    aux=true;
                }
            }
        }

        boolean compr = true;
        while (compr){
           complementario = random.nextInt(49)+1;
           compr=  Arrays.asList(sorteo).contains(complementario);
        }


        System.out.println("Boleto ganador: "+ Arrays.toString(sorteo).replace(","," -"));
        System.out.println("Reintegro: "+reintegro);
        System.out.println("Complementario: "+complementario);
        System.out.println("");
        System.out.println("RESULTADO: ");

        for(int i=0 ; i < intnumeros.length ;i++){
            if (Arrays.asList(sorteo).contains(intnumeros[i])){
                aciertos++;
            }
        }

        if (reintusuario == reintegro){
            aciertoreintegro++;
        }
        if (aciertos==5) {
            for (int i = 0; i < intnumeros.length - 1; i++) {
                if (intnumeros[i] == complementario) {
                    aciertocomp++;
                }
            }
        }
        if (aciertos==6 && aciertoreintegro==1) {
            System.out.println("6 aciertos y el reintegro!!!");
            System.out.println("Categoria Especial!!!");
        } else if (aciertos==6) {
            System.out.println("6 aciertos");
            System.out.println("1ª Categoria");
        } else if (aciertos==5 && aciertocomp==1) {
            System.out.println("5 aciertos y complementario");
            System.out.println("2ª Categoria");
        } else if (aciertos==5) {
            System.out.println("5 aciertos");
            System.out.println("3ª Categoria");
        } else if (aciertos==4) {
            System.out.println("4 aciertos");
            System.out.println("4ª Categoria");
        } else if (aciertos==3) {
            System.out.println("3 aciertos");
            System.out.println("5ª Categoria");
        } else if (aciertoreintegro==1) {
            System.out.println("Has acertado solo el reintegro");
            System.out.println("Reintegro");
        } else {
                System.out.println(aciertos+" aciertos");
                System.out.println("Sin premio");
        }

    }
}
