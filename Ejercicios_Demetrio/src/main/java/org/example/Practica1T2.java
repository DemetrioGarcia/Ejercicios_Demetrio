package org.example;

import java.util.Scanner;

public class Practica1T2 {
    public void NumMagico(){
        Scanner Entrada = new Scanner(System.in);

        System.out.println("Introduce tu fecha de nacimiento: (formato dd-mm-aaaa)");
        String fecha = Entrada.next();

        if (fecha.length()==10) {

            String day = fecha.substring(0, 2);
            int dia = Integer.parseInt(day);
            String month = fecha.substring(3, 5);
            int mes = Integer.parseInt(month);
            String year = fecha.substring(6, 10);
            int anyo = Integer.parseInt(year);

            int total = dia + mes + anyo;

            String totals = Integer.toString(total);

            String cifra1 = totals.substring(0, 1);
            String cifra2 = totals.substring(1, 2);
            String cifra3 = totals.substring(2, 3);
            String cifra4 = totals.substring(3, 4);

            int cif1 = Integer.parseInt(cifra1);
            int cif2 = Integer.parseInt(cifra2);
            int cif3 = Integer.parseInt(cifra3);
            int cif4 = Integer.parseInt(cifra4);

            if (dia<=0 || mes<=0 || anyo <=0){
                System.out.println("Dia,Mes o Año no puede valer 0");
            }
            else {
                System.out.println(dia + "+" + mes + "+" + anyo + " = " + total);

                total = cif1 + cif2 + cif3 + cif4;
                System.out.println(cifra1 + "+" + cifra2 + "+" + cifra3 + "+" + cifra4 + " = " + total);

                System.out.println("Tu número de la suerte es: " + total);
            }
        }
        else {
            System.out.println("Formato erróneo prueba (01-01-2000)");
        }
    }
}
