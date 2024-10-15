package org.example;

import java.util.Scanner;

public class EjercicioAlturas {
    public void Altura(){
        Scanner Entrada = new Scanner(System.in);

        System.out.println("Introduce tu altura: (cm)");
        int altura = Entrada.nextInt();

        if (altura<150){
            System.out.println("Persona de altura baja");
        } else if (altura<175) {
            System.out.println("Persona de altura media");
        } else if (altura>=176) {
            System.out.println("Persona alta");
        }
    }
}
