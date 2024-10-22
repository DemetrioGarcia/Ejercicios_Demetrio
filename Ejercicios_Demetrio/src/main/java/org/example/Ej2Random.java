package org.example;

import java.util.Random;

public class Ej2Random {
    public void Ejercicio2(){

        int num;
        String pass;
        String passfinal = "";
        Random random = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int max = caracteres.length();
        for (int i = 0 ; i < 6 ; i++){

            num=random.nextInt(max);
            pass = String.valueOf(caracteres.charAt(num));
            passfinal = passfinal + pass;

        }

        System.out.println("La contraseña generada es: "+passfinal);
    }
}
