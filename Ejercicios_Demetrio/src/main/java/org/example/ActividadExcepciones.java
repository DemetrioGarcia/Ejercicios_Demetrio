package org.example;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ActividadExcepciones {
    public void Calculaedad(){
        Scanner Entrada = new Scanner(System.in);
        LocalDateTime hoy = LocalDateTime.now();
        int anyon = 0;

        System.out.println("Que metodo quieres utilizar el 1 o 2?");
        String modo = Entrada.next();

        switch (modo) {
            case "1":

                System.out.println("Introduce tu año de nacimiento");
                String anyo = Entrada.next();
                anyon = Integer.parseInt(anyo);

                if (anyon < 1900 || anyon > hoy.getYear()) {

                    System.out.println("Año introducido no valido");
                }
                break;
            case "2":
                System.out.println("Introduce tu edad");
                int edad = 0;

                if (Entrada.hasNextInt()) {
                    edad = Entrada.nextInt();
                } else {
                    System.out.println("La edad introducida no es un número");
                }

                if (edad < 0) {
                    System.out.println("Edad introducida no valida");
                } else {
                    anyon = hoy.getYear() - edad;
                }
                break;
            default:
                System.out.println("ERROR. Entrada no reconocida");
                break;
        }
            if(anyon>=1900) {
                if (anyon<=1927){
                    System.out.println("Eres de la sin generación bautizada");
                } else if (anyon<=1944) {
                    System.out.println("Eres de la generación silent");
                } else if (anyon<=1964) {
                    System.out.println("Eres de la generación Baby boomer");
                } else if (anyon<=1981) {
                    System.out.println("Eres de la generación X");
                } else if (anyon<=1994){
                    System.out.println("Eres de la generación Y o Millenials");
                } else if (anyon>1995) {
                    System.out.println("Eres de la generación Z o Centennials");
                }
            }
//            switch (anyon) {
//                case 1900:
//                    System.out.println("Eres de la sin generación bautizada");
//                case 1928:
//                    System.out.println("Eres de la generación silent");
//                case 1945:
//                    System.out.println("Eres de la generación Baby boomer");
//                case 1965:
//                    System.out.println("Eres de la generación X");
//                case 1982:
//                    System.out.println("Eres de la generación Y o Millenials");
//            }
    }
}
