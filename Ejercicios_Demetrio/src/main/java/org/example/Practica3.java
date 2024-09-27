package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica3 {
    public void Votar() {
            //asiganmos el metodo escaner para poder leer la información que entra por consola.
            Scanner entradaEscaner = new Scanner(System.in);
            int edad = 0;
            //Preguntamos por el string nombre
            System.out.println("Cual es tu nombre?");
            String nombre = entradaEscaner.next();

            /*
            Preguntamos por el int edad. Además ponemos un try-catch para asegurarnos de que el programa no tenga problemas si alguien se equivoca.
            Todo esto dentro de un bucle while para asegurar que no podemos salir del bucle sin introducir correctamente la edad.
            */
        while (edad == 0) {
            try {
                System.out.println("Hola " + nombre + ". Cuantos años tienes?");
                edad = entradaEscaner.nextInt();
                //Hacemos un bucle while para asegurar que la entrada de edad es correcta.
                while (edad <= 0) {
                    System.out.println("Vuelve a introducir la edad:");
                    edad = entradaEscaner.nextInt();
                }
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Por favor introduzca un número");
                entradaEscaner.next();
                edad = 0;
            }
        }
        //Hacemos un condicional para saber si es mayor o menor de edad.
        if (edad>18){
            System.out.println("Enhorabuena "+nombre+". Puedes votar");
        }
        else {
            System.out.println("Lo siento "+nombre+". Te faltan "+(18-edad)+" para poder votar");
        }
    }
}
