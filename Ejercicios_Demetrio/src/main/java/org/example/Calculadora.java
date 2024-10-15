package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public void Calculadora(){
        Scanner Entrada = new Scanner(System.in);

        String ope = "0";
        int num1 = 0;
        boolean aux = true;
        boolean error = true;

        System.out.println("Bienvenido Usuario");

        while (aux){

        while (error) {
            try {

                System.out.println("Introduce el primer operando: ");
                num1 = Entrada.nextInt();
                error = false;
            } catch (InputMismatchException e) {
                System.out.println("ERROR. Entrada de valor no valida.");
                Entrada.nextLine();
            }
        }

        System.out.println("Introduce el signo de la operación:  (+,-,/,*,R)");
        ope = Entrada.next();
        ope = ope.toUpperCase();

        try {

            switch (ope) {
                case "+":
                    System.out.println("Introduce el segundo operando: ");
                    int num2 = Entrada.nextInt();
                    int total = num2 + num1;
                    System.out.println("El resultado es " + total);
                    aux = false;
                    break;
                case "-":
                    System.out.println("Introduce el segundo operando: ");
                    num2 = Entrada.nextInt();
                    total = num1 - num2;
                    System.out.println("El resultado es " + total);
                    aux = false;
                    break;
                case "/":
                    aux = false;
                    System.out.println("Introduce el dividendo: ");
                    num2 = Entrada.nextInt();
                    if (num2 == 0) {
                        System.out.println("No se puede dividir entre 0");
                        break;
                    } else {
                        double totald = num1 / num2;
                        System.out.println("El resultado es " + totald);
                        break;
                    }
                case "*":
                    aux = false;
                    System.out.println("Introduce el multiplicador: ");
                    num2 = Entrada.nextInt();
                    total = num1 * num2;
                    System.out.println("El resultado es " + total);
                    break;
                case "R":
                    aux = false;
                    if (num1>0) {
                        double totalr = Math.sqrt(num1);
                        System.out.println("El resultado es " + totalr);
                        break;
                    }
                    else {
                        System.out.println("No se puede realizar la raiz cuadrada de un número negativo");
                        break;
                    }
                default:
                    System.out.println("El operando es incorrecto");
                    break;
            }
        }catch (InputMismatchException e){
            System.out.println("ERROR. Entrada de valor no valida.");
            Entrada.nextLine();
        }
        }
    }
}
