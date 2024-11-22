package org.example;

import java.util.Arrays;
import java.util.Random;

public class ArrayDArrays {
    public void prueba(){

        Random random = new Random();

        int matriz[][] = new int [2][3];
        int matriz2[][] = new int [2][3];
        int matrizmay[][] = new int [2][3];
        for (int i = 0; i<matriz2.length; i++){
            for (int j=0; j<matriz[i].length; j++){

                matriz2[i][j]= random.nextInt(101);
                matriz[i][j]= random.nextInt(101);

            }
        }

        for (int i = 0; i<matriz2.length; i++){
            for (int j=0; j<matriz[i].length; j++){
                if (matriz[i][j]>matriz2[i][j]){
                    matrizmay[i][j] = matriz[i][j];
                }
                else {
                    matrizmay[i][j] = matriz2[i][j];
                }
            }
        }

        System.out.println(Arrays.deepToString(matrizmay));

    }
}
