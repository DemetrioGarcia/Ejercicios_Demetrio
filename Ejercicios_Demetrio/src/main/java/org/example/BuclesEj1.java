package org.example;

import java.util.Objects;
import java.util.Scanner;

public class BuclesEj1 {
    public void Ejercicio1() {
        Scanner Entrada = new Scanner(System.in);

        String pass2 = " ";

        System.out.println("Introduce la contraseña");
        String pass = Entrada.nextLine();

        for (int i = 0; !Objects.equals(pass, pass2); i++) {
            System.out.println("Vuelve a introducir la contraseña");
            pass2 = Entrada.nextLine();
        }

        System.out.println("Contraseña Correcta");

    }
}
