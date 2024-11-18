package org.example;

public class PrematricesEj3 {
    public void Ejercicio3(){

        for (int i=1 ; i<=10; i++){
            System.out.println();
            System.out.println("TABLA DEL "+i);
            for (int j=0 ; j<=10; j++){
                int total=i*j;
                System.out.println(i+" * "+j+" = "+total);
            }
        }
    }
}
