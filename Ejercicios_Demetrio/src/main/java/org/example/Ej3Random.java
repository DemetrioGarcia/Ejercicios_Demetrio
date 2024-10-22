package org.example;

import java.util.Random;
import java.util.Scanner;

public class Ej3Random {
    public void Ejercicio3(){
        Scanner Entrada = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Cuantos números aleatorias tienes? ");
        int cant = Entrada.nextInt();

        System.out.println("Rango minimo ? ");
        int min = Entrada.nextInt();
        System.out.println("Rango Máximo ? ");
        int max = Entrada.nextInt();
        if (max>min) {

            for (int i = 0; i < cant; i++) {
                int num = random.nextInt(max - min + 1) + min;
                System.out.println(num);
            }
        }
        else {
            System.out.println("El minimo no puede ser mayor o igual que maximo");
        }
    }
}
