package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Samurais {
    public void Samurais(){
        Scanner entrada = new Scanner(System.in);

        int samurait1=0, samurait2=0;

        System.out.println("Equipo 1");
        System.out.println("Introduce potencia de los samurais: ");
        String pot1 = entrada.nextLine();

        System.out.println("Equipo 2");
        String pot2 = entrada.nextLine();

        String[] potencia1 = pot1.split(" ");
        String[] potencia2 = pot2.split(" ");

        int[] samurais1 = new int[7];
        int[] samurais2 = new int[7];

        if (potencia1.length==7 && potencia2.length==7){
            
        }
        for (int i = 0; i < 7 ; i++){

            samurais1[i]=Integer.parseInt(potencia1[i]);
            samurais2[i]=Integer.parseInt(potencia2[i]);

            samurait1 += samurais1[i];
            samurait2 += samurais2[i];

        }

        if (samurait1==30 && samurait2==30){
            System.out.println(Arrays.toString(potencia1));
        }
        System.out.println(Arrays.toString(potencia1));
    }
}
