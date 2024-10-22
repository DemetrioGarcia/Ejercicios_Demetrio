package org.example;

import java.util.Random;
import java.util.Scanner;

public class Ej4Random {
    public void Ejercicio4(){
        Scanner Entrada = new Scanner(System.in);

        int num;
        String pass;
        String passfinal = "";
        Random random = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int max = caracteres.length();

        int cant = random.nextInt(3)+6;
            for (int i = 0; i < cant; i++) {

                num = random.nextInt(max);
                pass = String.valueOf(caracteres.charAt(num));
                passfinal = passfinal + pass;

            }
        System.out.println("La contraseña generada es: "+passfinal);
    }
}
