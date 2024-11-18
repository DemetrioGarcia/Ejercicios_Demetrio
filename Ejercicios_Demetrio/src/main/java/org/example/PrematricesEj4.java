package org.example;

import java.util.Scanner;

public class PrematricesEj4 {
    public void Ejercicio4(){

        Scanner entrada = new Scanner(System.in);

        int num;
        boolean primo;
        String nprimos = "Los números primos son: ";
        System.out.println("Hasta que número quieres saber los primos? ");
        int m = entrada.nextInt();

        for (int i = 2; i < m; i++) {
            num = i;
            primo = true;
            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                nprimos = nprimos.concat(num + " ");
            }
        }
        System.out.println(nprimos);
    }
}
