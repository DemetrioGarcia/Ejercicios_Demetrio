package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Samurais {
    public void Samurais(){
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        int samurait1=0, samurait2=0, resul1=0, resul2=0;
        boolean aux=true;
        int[] samurais1 = new int[7];
        int[] samurais2 = new int[7];

        System.out.println("Equipo 1");
        while (aux) {
            aux=false;

            System.out.println("Introduce potencia de los samurais: ");
            String pot1 = entrada.nextLine();

            String[] potencia1 = pot1.split(" ");

            if(potencia1.length!=7){
                System.out.println("ERROR. Tienes que tener 7 samurais.");
                aux=true;
            }
            else {
                for (int i = 0; i < 7; i++) {

                    samurais1[i] = Integer.parseInt(potencia1[i]);
                    samurait1 += samurais1[i];

                }
                if (samurait1 != 30) {
                    aux = true;
                    samurait1=0;
                    System.out.println("ERROR. La potencia de los samurais debe ser 30");
                } else {
                    System.out.println("Equipo completado");
                }
            }
        }
        System.out.println("Equipo 2");
        aux=true;

        while (aux) {
            aux=false;
            System.out.println("Introduce potencia de los samurais: ");
            String pot2 = entrada.nextLine();

            String[] potencia2 = pot2.split(" ");

            if(potencia2.length!=7){
                System.out.println("ERROR. Tienes que tener 7 samurais.");
                aux=true;
            }
            else {
                for (int i = 0; i < 7; i++) {

                    samurais2[i] = Integer.parseInt(potencia2[i]);
                    samurait2 += samurais2[i];
                }

                if (samurait2 != 30) {
                    aux = true;
                    samurait2=0;
                    System.out.println("ERROR. La potencia de los samurais debe ser 30.");
                } else {
                    System.out.println("Equipo completado");
                }
            }
        }
                System.out.println("¡Comienza la batalla!");
                int saminicio = random.nextInt(7);
                System.out.println("La batalla empieza por el Samurai "+(saminicio+1));

                for (int j = 0 ; j < 7 ; j++){

                    if (saminicio==7){
                        saminicio=0;
                    }

                    if (samurais1[saminicio] > samurais2[saminicio]){
                        System.out.println("Samurai "+(saminicio+1)+". Gana el equipo 1. "+samurais1[saminicio]+" vs "+samurais2[saminicio]);
                        resul1++;
                        saminicio++;
                    } else if (samurais1[saminicio] == samurais2[saminicio]) {
                        System.out.println("Samurai "+(saminicio+1)+". Empate. "+samurais1[saminicio]+" vs "+samurais2[saminicio]);
                        resul1++;
                        resul2++;
                        saminicio++;
                    }
                    else {
                        System.out.println("Samurai "+(saminicio+1)+". Gana el equipo 2. "+samurais1[saminicio]+" vs "+samurais2[saminicio]);
                        resul2++;
                        saminicio++;
                    }
                }
                if (resul1>resul2){
                    System.out.println("EQUIPO 1 GANA!! El equipo 2 ha tenido "+resul1+" bajas.");
                } else if (resul2>resul1) {
                    System.out.println("EQUIPO 2 GANA!! El equipo 1 ha tenido "+resul2+" bajas.");
                } else {
                    System.out.println("EMPATE");
                    System.out.println("El equipo 1 ha tenido "+resul2+" bajas y el equipo 2 ha tenido "+resul1+" bajas.");
                }
    }
}
