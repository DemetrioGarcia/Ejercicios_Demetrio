package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej7T2Preexamen {
    public void Ejercicio1() {

        Scanner entrada = new Scanner(System.in);

        int seq = 0, j = 1, ant = 0;
        boolean aux = true;
        String secuencia = "Secuencia de Números: ";

        while(aux){
        try {
            System.out.println("De cuantos números quieres ver la secuencia? ");
            seq = entrada.nextInt();
            aux = false;
        }
        catch (InputMismatchException e){
            System.out.println("ERROR. Vuelve a introducir un número valido. (Entero y positivo)");
            entrada.nextLine();
            aux = true;
        }
            if (seq<=0){
                aux = true;
            }
        }
        for (int i=0 ; i<seq ; i++){
            secuencia= secuencia.concat(String.valueOf(ant+" "+j+" "));
            ant=ant+j;
            j=j+ant;
        }

        System.out.println(secuencia);
    }
}
