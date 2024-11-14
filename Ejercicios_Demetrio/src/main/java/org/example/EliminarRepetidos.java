package org.example;

import java.util.Arrays;
import java.util.Random;

public class EliminarRepetidos {
    public void Ejercicio1(){

        int[] vector = {4,8,9,1,2,2,1,3};
        int[] vectorlimpio;
        int j=0;
        Arrays.sort(vector);

        for (int i =0; i<vector.length-1 ; i++){

            if (vector[i]==vector[i+1]){
                vector[i+1]=0;
                j++;
            }
        }
        vectorlimpio = new int[vector.length-j];
        j=0;
        for (int k : vector) {
            if (k != 0) {
                vectorlimpio[j] = k;
                j++;
            }
        }
        System.out.println(Arrays.toString(vector));
        System.out.println(Arrays.toString(vectorlimpio));
    }

    public void Ejercicio2(){

        int j=0;
        int[] vector = {4,8,9,1,2,2,1,3};
        int[] vector2 = new int[vector.length];
        Arrays.sort(vector);

        for (int i =0; i<vector.length-1 ; i++){

            if (vector[i]==vector[i+1]){
                vector2[j]=vector[i];
                vector[i]=0;
                j++;
            }
        }
        System.out.println(Arrays.toString(vector));
        System.out.println(Arrays.toString(vector2));
    }

    public void Ejercicio3(){

        boolean aux=false;
        Random random = new Random();
        int[] vector = {4,8,9,1,2,2,1,3};
        Arrays.sort(vector);

        while (!aux) {
            aux=true;
            for (int i = 0; i < vector.length - 1; i++) {

                if (vector[i] == vector[i + 1]) {
                    vector[i] = random.nextInt(10);
                    aux=false;
                }
            }
            Arrays.sort(vector);
        }
        System.out.println(Arrays.toString(vector));
    }
}
