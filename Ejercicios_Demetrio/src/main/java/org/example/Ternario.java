package org.example;

public class Ternario {
    public void Ternario(){

        int a=1,b=2, d=3 ;
        int res = 0;

        res = a>b ? a++ :
                d > b++ ? a+=b :
                a > d++ ? a : d ;


        System.out.println(res);
    }
}
