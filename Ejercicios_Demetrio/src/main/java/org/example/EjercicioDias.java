package org.example;

import java.util.Scanner;

public class EjercicioDias {
    public void Semana(){
        Scanner Entrada = new Scanner(System.in);

        System.out.println("Introduce un número del 1-7: ");
        int dia = Entrada.nextInt();

        switch (dia){
            case 1:
                System.out.println("1.- Lunes");
            break;
            case 2:
                System.out.println("2.- Martes");
                break;
            case 3:
                System.out.println("3.- Miercoles");
                break;
            case 4:
                System.out.println("4.- Jueves");
                break;
            case 5:
                System.out.println("5.- Viernes");
                break;
            case 6:
                System.out.println("6.- Sabado");
                break;
            case 7:
                System.out.println("7.- Domingo");
                break;
            default:
                System.out.println("Número no valido");
                break;
        }
    }
}
