package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practica2T3 {
    public void Ejercicio1() {

        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        int aciertos=0;

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
            intnumeros[i] = Integer.parseInt(numeros[i]);
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

        if (intnumeros[0]==sorteo[0]){
            aciertos++;
        }
        if (intnumeros[1]==sorteo[1]){
            aciertos++;
        }
        if (intnumeros[2]==sorteo[2]){
            aciertos++;
        }
        if (intnumeros[3]==sorteo[3]){
            aciertos++;
        }
        if (intnumeros[4]==sorteo[4]){
            aciertos++;
        }
        if (intnumeros[5]==sorteo[5]){
            aciertos++;
        }
        if (aciertos==0 || aciertos==6){
            if (intnumeros[6]==reintegro){
                aciertos+=10;
            }
        }
        if (aciertos==5) {
            for (int i = 0; i < intnumeros.length - 1; i++) {
                if (intnumeros[i] == complementario) {
                    aciertos+=4;
                }
            }
        }
        switch (aciertos) {
            case 16 :
                System.out.println("7 aciertos");
                System.out.println("Categoria Especial!!!");
                break;
            case 6 :
                System.out.println("6 aciertos");
                System.out.println("1ª Categoria");
                break;
            case 9 :
                System.out.println("5 aciertos y complementario");
                System.out.println("2ª Categoria");
                break;
            case 5 :
                System.out.println("5 aciertos");
                System.out.println("3ª Categoria");
                break;
            case 4:
                System.out.println("4 aciertos");
                System.out.println("4ª Categoria");
                break;
            case 3:
                System.out.println("3 aciertos");
                System.out.println("5ª Categoria");
                break;
            case 10:
                System.out.println("Has acertado solo el reintegro");
                System.out.println("Reintegro");
                break;
            default:
                System.out.println("0 aciertos");
                System.out.println("Sin premio");
                break;
        }

    }
}
